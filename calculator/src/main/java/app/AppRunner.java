package app;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

import Converter.StringtoDateParser;
import InputOutputConstants.InputTypes;
import InputOutputConstants.OutputConstants;
import InputOutputConstants.StandardInOut;
import Operation.Arithmetic;
import Operation.Subtraction;



public class AppRunner {

	private static String date1 = null;
	private static String date2 = null;
	private static Scanner input;
	static Arithmetic arithmetic;
	static StandardInOut standardInOut;

	public static void main(String[] args) {
		// BasicConfigurator.configure();
		standardInOut = new InputTypes();
		standardInOut.UserIO();
		System.out.println(InputTypes.OPTIONS1);
		input = new Scanner(System.in);

		date1 = input.nextLine();

		System.out.println(InputTypes.OPTIONS2);

		date2 = input.nextLine();

		Optional<Date> date1Parsed = StringtoDateParser.parser(date1);
		Optional<Date> date2Parsed = StringtoDateParser.parser(date2);
		if (date1Parsed.isPresent() && date2Parsed.isPresent()) {
			System.out.println(date1Parsed.get());


			arithmetic = new Subtraction();
			arithmetic.equationSolver(date1Parsed.get(), date2Parsed.get());
			standardInOut = new OutputConstants(arithmetic.dateDifferece(),
					arithmetic.weekDifferece(),
					arithmetic.monthsDifferece(), arithmetic.yearsDifferece());
			standardInOut.UserIO();






		} else {
			System.out.println(OutputConstants.DATE_PARSER_ERROR + "your inputs were -> " + date1 + " " + date2);
		}


		input.close();
	}

}
