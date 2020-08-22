package InputOutputConstants;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class InputTypes implements StandardIn {


	public static final String OPTIONS1 = "Type First Date(MM/DD/YYYY)/String or String";
	public static final String OPTIONS2 = "for option 1 Type Second Date(MM/DD/YYYY)/string OR for option 2 type N days or N weeks";



	private Optional<String> date1;

	private Optional<String> date2;






	@Override
	public List<Optional<String>> UserTwoDateInput(String message1, String message2) {
		System.out.println(message1);
		try (Scanner input = new Scanner(System.in)) {
			date1 = Optional.of(input.nextLine());

			System.out.println(message2);

			date2 = Optional.of(input.nextLine());
		}

		return Arrays.asList(date1, date2);

	}



	@Override
	public Optional<Integer> userIntegerInput() {
		try (Scanner input = new Scanner(System.in)) {
			Optional<Integer> optionInteger = Optional.of(input.nextInt());
			return optionInteger;
		}

	}

	@Override
	public Optional<String> UserInputString(String message1) {
		System.out.println(message1);
		try (Scanner input = new Scanner(System.in)) {
			date1 = Optional.of(input.next());
		}

		return date1;

	}











}
