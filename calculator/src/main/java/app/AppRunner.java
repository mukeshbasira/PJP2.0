package app;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import Converter.StringtoDateParser;
import InputOutputConstants.InputTypes;
import InputOutputConstants.OutputConstants;
import InputOutputConstants.StandardIn;
import InputOutputConstants.StandardOut;
import Operation.Arithmetic;
import Operation.NOperation;
import Operation.Subtraction;



public class AppRunner {

	private static String date1 = null;
	private static String date2 = null;
	static Arithmetic arithmetic;
	static StandardIn standardIn;
	static StandardOut standardOut;

	public static void main(String[] args) {
		standardOut = new OutputConstants();
		standardOut.mainOutput();
		standardIn = new InputTypes();
		Optional<Integer> userIntegerInput = standardIn.userIntegerInput();
		Integer valueInteger = userIntegerInput.orElse(1);
		if (valueInteger.equals(3)) {
			standardIn = new InputTypes();
			Optional<String> userSingleInput = standardIn.UserInputString(InputTypes.OPTIONS1);
			Optional<Date> dateParsed = StringtoDateParser.parser(userSingleInput.orElse(""));

			dateParsed.ifPresentOrElse(value -> {
				System.out.println(value);
			}, () -> {
				System.out.println("NO DATE FOUND");
			});

		} else {
			List<Optional<String>> userTwoDateInput = standardIn.UserTwoDateInput(InputTypes.OPTIONS1,
					InputTypes.OPTIONS2);
			date1 = userTwoDateInput.get(0).get();
			date2 = userTwoDateInput.get(1).get();
			Optional<Date> date1Parsed = StringtoDateParser.parser(date1);
			Optional<Date> date2Parsed = StringtoDateParser.parser(date2);
			if (date1Parsed.isPresent() && date2Parsed.isPresent()) {
				System.out.println(date1Parsed.get());
				System.out.println(date2Parsed.get());
				if (valueInteger == 1) {
					arithmetic = new Subtraction();
					arithmetic.equationSolver(date1Parsed.get(), date2Parsed.get());

					standardOut = new OutputConstants(arithmetic);
					standardOut.UserOut();

				} else if (valueInteger == 2) {
					Optional<String> userSingleInput = standardIn.UserInputString(
							"Enter \"Addition\" for add operation else  \"Subtraction\" for subtract "
									+ " operation of time)");

					arithmetic = new NOperation(userSingleInput.orElse("Subtraction"));

					arithmetic.equationSolver(date1Parsed.get(), date2Parsed.get());

					standardOut = new OutputConstants(arithmetic);
					standardOut.UserOut();

				}

				else {
					System.out.println("Entered Integer is not valid");
				}



			} else {
				System.out.println(OutputConstants.DATE_PARSER_ERROR + "your inputs were -> " + date1 + " and  " + date2);
			}

		}

	}

}
