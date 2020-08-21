package app;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

import Converter.StringtoDateParser;


public class AppRunner {

	private static String date1 = null;
	private static String date2 = null;
	private static Scanner input;

	public static void main(String[] args) {
		// BasicConfigurator.configure();
		new InputTypes();
		System.out.println(InputTypes.OPTIONS1);
		input = new Scanner(System.in);

		date1 = input.nextLine();

		System.out.println(InputTypes.OPTIONS2);

		date2 = input.nextLine();

		Optional<Date> date1Parsed = StringtoDateParser.parser(date1);
		Optional<Date> date2Parsed = StringtoDateParser.parser(date2);
		if (date1Parsed.isPresent()) {
			System.out.println(date1Parsed.get());

		} else {
			System.out.println(OutputConstants.DATE_PARSER_ERROR + date1);
		}
		if (date2Parsed.isPresent()) {
			System.out.println(date2Parsed.get());
		} else {
			System.out.println(OutputConstants.DATE_PARSER_ERROR + date2);
		}

		Date dTotal = new Date(date1Parsed.get().getDate() + date2Parsed.get().getDate());
		System.out.println(dTotal);
		input.close();
	}

}
