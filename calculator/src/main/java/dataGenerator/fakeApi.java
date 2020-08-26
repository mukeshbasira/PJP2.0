package dataGenerator;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import inputOutput.InputHandler;

//not added
public class fakeApi {
	static InputHandler inputHandler;

	public static void run(Integer times) throws Exception {
		RandomDate rd = new RandomDate(LocalDate.of(1980, 1, 1), LocalDate.of(2021, 1, 1));


		for (int i = 0; i < times; i++) {
			System.out.println("--------TEST-" + i + "--------RUNNING-----------");

			int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);

			List<Optional<String>> userTwoDateInput = new LinkedList<Optional<String>>();
			Optional<String> firstdateOptional ;
			Optional<String> seconddateOptional ;

			switch (randomNum) {

			case 1:
				firstdateOptional = Optional.of(rd.nextDate().toString());
				seconddateOptional = Optional.of(rd.nextDate().toString());


				userTwoDateInput.add(firstdateOptional);
				userTwoDateInput.add(seconddateOptional);
				inputHandler = new InputHandler(userTwoDateInput);

				System.out.println(inputHandler.parserAPI(randomNum));

				break;
			case 2:
				firstdateOptional = Optional.of(rd.nextDate().toString());
				seconddateOptional = Optional.of(ThreadLocalRandom.current().nextInt(0, 600 + 1) + " days ");


				userTwoDateInput.add(firstdateOptional);
				userTwoDateInput.add(seconddateOptional);
				inputHandler = new InputHandler(userTwoDateInput);

				System.out.println(inputHandler.parserAPI(randomNum));

				break;
			case 3:
				firstdateOptional = Optional.of(rd.nextDate().toString());


				userTwoDateInput.add(firstdateOptional);

				inputHandler = new InputHandler(userTwoDateInput);

				System.out.println(inputHandler.parserAPI(randomNum));

				break;
			case 4:
				firstdateOptional = Optional.of(rd.nextDate().toString());
				seconddateOptional = Optional.of(ThreadLocalRandom.current().nextInt(0, 600 + 1) + " days ");

				userTwoDateInput.add(firstdateOptional);
				userTwoDateInput.add(seconddateOptional);
				inputHandler = new InputHandler(userTwoDateInput);

				System.out.println(inputHandler.parserAPI(randomNum));

				break;
			case 5:
				firstdateOptional = Optional.of(rd.nextDate().toString());

				userTwoDateInput.add(firstdateOptional);

				inputHandler = new InputHandler(userTwoDateInput);

				System.out.println(inputHandler.parserAPI(randomNum));

				break;

			default:
				System.out.println("Integer error");
				return;

			}


		}


	}


}
