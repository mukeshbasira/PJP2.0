package inputOutput;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import Converter.StringParser;
import Converter.StringtoDateParser;
import History.History;
import Operation.Arithmetic;
import Operation.NOperation;
import Operation.Subtraction;
import Structure.localStructure;

public class InputHandler {
	private static String date1 = null;
	private static String date2 = null;
	static Arithmetic arithmetic;
	StringParser stringParser = new StringtoDateParser();
	public static final int optionIntegerONE = 1;
	public static final int optionIntegerTWO = 2;
	public static final int optionIntegerTHREE = 3;
	public static final int optionIntegerFOUR = 4;
	Optional<Date> date1Parsed;
	Optional<Date> date2Parsed;
	History history;
	String returnResultString;


	static InputTypes standardIn = new InputTypes();;
	static Output standardOut;



	public void setSession(History history) {
		this.history = history;
	}
	public void takeUserIntegerInput() {
		Optional<Integer> userIntegerInput = standardIn.userIntegerInput();
		IntegerHandler(userIntegerInput.orElse(1));

	}

	public String IntegerHandler(Integer number) {
		switch (number) {
		case optionIntegerTHREE:
			Optional<String> userSingleInput = standardIn.UserInputString(OutConstants.OPTIONS1);
			Optional<Date> dateParsed = stringParser.parser(userSingleInput.orElse(""));


			dateParsed.ifPresentOrElse(value -> {
				System.out.println("Found Date is ->>> " + value);
				returnResultString = value.toString();
			}, () -> {
				System.out.println("NO DATE FOUND");
				returnResultString = "NO DATE FOUND";

			});

			history.addSession(
					new localStructure(optionIntegerTHREE, "NONE", OutConstants.SUB_TWO_DATES_MESSAGE,
							userSingleInput
							.orElse(""),
							"",
							returnResultString));
			return returnResultString;

		case optionIntegerONE:
			List<Optional<String>> userTwoDateInput = standardIn.UserTwoDateInput(OutConstants.OPTIONS1,
					OutConstants.OPTIONS2);
			date1 = userTwoDateInput.get(0).get();
			date2 = userTwoDateInput.get(1).get();

			date1Parsed = stringParser.parser(date1);
			date2Parsed = stringParser.parser(date2);


			arithmetic = new Subtraction();
			arithmetic.equationSolver(date1Parsed.orElse(new Date()), date2Parsed.orElse(new Date()));

			standardOut = new Output(arithmetic);
			returnResultString = standardOut.UserOut("Difference between two dates is -> ");

			history.addSession(new localStructure(optionIntegerTHREE, "Subtraction", OutConstants.SUB_TWO_DATES_MESSAGE,
					date1,
					date2, returnResultString
					));

			return returnResultString;


		case optionIntegerTWO:
			List<Optional<String>> userTwoDateInput1 = standardIn.UserTwoDateInput(
					OutConstants.OPTIONS1, OutConstants.OPTIONSNDAYSADD);
			date1 = userTwoDateInput1.get(0).get();
			date2 = userTwoDateInput1.get(1).get();
			date1Parsed = stringParser.parser(date1);
			date2Parsed = stringParser.parser(date2);

			arithmetic = new NOperation("Addition");

			arithmetic.equationSolver(date1Parsed.orElse(new Date()), date2Parsed.orElse(new Date()));
			Optional<Date> dateParsed3 = stringParser
					.parser(arithmetic.months() + "/" + arithmetic.date() + "/" + arithmetic.years());

			dateParsed3.ifPresentOrElse(value -> {
				System.out.println("Concluded Date is ->>> " + value);
				returnResultString = value.toString();
			}, () -> {
				System.out.println("NO DATE FOUND");
				returnResultString = "NO DATE FOUND";
			});


			history.addSession(new localStructure(optionIntegerTHREE, "Addition", OutConstants.OPTIONSNDAYSADD, date1,
					date2,
					returnResultString));

			return returnResultString;
		case optionIntegerFOUR:
			List<Optional<String>> userTwoDateInput2 = standardIn
			.UserTwoDateInput(
					OutConstants.OPTIONS1,
					OutConstants.OPTIONSNDAYSSUB);
			date1 = userTwoDateInput2.get(0).get();
			date2 = userTwoDateInput2.get(1).get();
			date1Parsed = stringParser.parser(date1);
			date2Parsed = stringParser.parser(date2);

			arithmetic = new NOperation("Subtraction");

			arithmetic.equationSolver(date1Parsed.orElse(new Date()), date2Parsed.orElse(new Date()));
			Optional<Date> dateParsed4 = stringParser
					.parser(arithmetic.months() + "/" + arithmetic.date() + "/" + arithmetic.years());

			dateParsed4.ifPresentOrElse(value -> {
				System.out.println("Concluded Date is ->>> " + value);
				returnResultString = value.toString();
			}, () -> {
				System.out.println("NO DATE FOUND");
				returnResultString = "NO DATE FOUND";
			});

			history.addSession(new localStructure(optionIntegerTHREE, "Subtraction", OutConstants.OPTIONSNDAYSADD,
					date1, date2, returnResultString));

			return returnResultString;




		default:

			System.out.println("\"Entered Integer is not valid\"");

			history.addSession(new localStructure(0, "ERROR", "", "", "", ""));
			return "\"Entered Integer is not valid\\";

		}


	}






}
