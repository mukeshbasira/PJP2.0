package com.app.inputOutput;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.app.Converter.StringParser;
import com.app.Converter.StringtoDateParser;
import com.app.Operation.Arithmetic;
import com.app.Operation.NOperation;
import com.app.Operation.Subtraction;
import com.app.Structure.localStructure;


public class InputHandler {
	private static String date1 = null;
	private static String date2 = null;

	static Arithmetic arithmetic;
	StringParser stringParser = new StringtoDateParser();
	public static final int optionIntegerONE = 1;
	public static final int optionIntegerTWO = 2;
	public static final int optionIntegerTHREE = 3;
	public static final int optionIntegerFOUR = 4;
	public static final int optionIntegerFIVE = 5;
	public static final int optionIntegerSIX = 6;
	public static final int optionIntegerSEVEN = 7;
	public static final int optionIntegerEIGHT = 8;
	public static final int optionIntegerNINE = 9;
	public static final int optionIntegerTEN = 10;

	Optional<Date> date1Parsed;
	Optional<Date> date2Parsed;
	List<Optional<String>> userTwoDateInput;
	List<Optional<String>> userTwoDateInput1;
	Optional<String> userInput;
	Optional<String> userSingleInput;
	String returnResultString;
	List<Optional<String>> userTwoDateInput2;

	localStructure localStructure;
	ArrayList<localStructure> sessionList = new ArrayList<localStructure>();
	ArrayList<localStructure> BulksessionList = new ArrayList<localStructure>();

	public ArrayList<localStructure> getsessionList() {
		return sessionList;

	}


	static Output standardOut;






	public InputHandler() {
		super();

	}

	public void setuserTwoDateInput(List<Optional<String>> userTwoDateInput) {

		this.userTwoDateInput = userTwoDateInput;
		this.userTwoDateInput1 = userTwoDateInput;

		this.userTwoDateInput2 = userTwoDateInput;
		this.userSingleInput = userTwoDateInput.get(0);
		this.userInput = userTwoDateInput.get(0);

	}



	public localStructure parserAPI(Integer number) throws Exception {
		switch (number) {
		case optionIntegerTHREE:
			Optional<Date> dateParsed = stringParser.parser(userSingleInput.orElse(""));

			dateParsed.ifPresentOrElse(value -> {
				System.out.println("Found Date is ->>> " + value);
				returnResultString = value.toString();
			}, () -> {
				System.out.println("NO DATE FOUND");
				returnResultString = "NO DATE FOUND";

			});
			localStructure = new localStructure(optionIntegerTHREE, "NONE",
					OutConstants.SIMPLE_DATE_STRING,
					userSingleInput.orElse(""), "", returnResultString);

			sessionList.add(localStructure);
			// saveIt();
			return localStructure;

		case optionIntegerONE:

			date1 = userTwoDateInput.get(0).get();
			date2 = userTwoDateInput.get(1).get();

			date1Parsed = stringParser.parser(date1);
			date2Parsed = stringParser.parser(date2);

			if (date1Parsed.isPresent() && date2Parsed.isPresent()) {

				arithmetic = new Subtraction();
				arithmetic.equationSolver(date1Parsed.orElse(new Date()), date2Parsed.orElse(new Date()));

				standardOut = new Output(arithmetic);
				returnResultString = standardOut.UserOut("Difference between two dates is -> ");
				localStructure = new localStructure(optionIntegerONE, "Subtraction", OutConstants.SUB_TWO_DATES_MESSAGE,
						date1, date2, returnResultString);

				sessionList.add(localStructure);
			} else {
				System.out.println("NO DATE FOUND");
				localStructure = new localStructure(optionIntegerONE, "Subtraction", OutConstants.SUB_TWO_DATES_MESSAGE,
						date1, date2, "NO DATE FOUND");
				sessionList.add(localStructure);

			}
			// saveIt();

			return localStructure;

		case optionIntegerTWO:

			date1 = userTwoDateInput1.get(0).get();
			date2 = userTwoDateInput1.get(1).get();
			date1Parsed = stringParser.parser(date1);
			date2Parsed = stringParser.parser(date2);

			arithmetic = new NOperation("Addition");
			if (date1Parsed.isPresent() && date2Parsed.isPresent()) {

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
				localStructure = new localStructure(optionIntegerTWO, "Addition", OutConstants.OPTIONSNDAYSADD, date1,
						date2, returnResultString);

				sessionList.add(localStructure);
			} else {
				System.out.println("NO DATE FOUND");
				localStructure = new localStructure(optionIntegerTWO, "Addition", OutConstants.OPTIONSNDAYSADD, date1,
						date2, "NO DATE FOUND");
				sessionList.add(localStructure);

			}

			return localStructure;
		case optionIntegerFOUR:

			date1 = userTwoDateInput2.get(0).get();
			date2 = userTwoDateInput2.get(1).get();
			//			System.out.println(date1);
			//			System.out.println(date2);
			date1Parsed = stringParser.parser(date1);

			date2Parsed = stringParser.parser(date2);
			//			System.out.println(date1Parsed);
			//			System.out.println(date2Parsed);
			if (date1Parsed.isPresent() && date2Parsed.isPresent()) {

				arithmetic = new NOperation("Subtraction");

				arithmetic.equationSolver(date1Parsed.orElse(new Date()), date2Parsed.orElse(new Date()));
				System.out.println(arithmetic.months() + "/" + arithmetic.date() + "/" + arithmetic.years());
				Optional<Date> dateParsed4 = stringParser
						.parser(arithmetic.months() + "/" + arithmetic.date() + "/" + arithmetic.years());

				dateParsed4.ifPresentOrElse(value -> {
					System.out.println("Concluded Date is ->>> " + value);
					returnResultString = value.toString();
				}, () -> {
					System.out.println("NO DATE FOUND");
					returnResultString = "NO DATE FOUND";
				});
				localStructure = new localStructure(optionIntegerFOUR, "Subtraction",
						OutConstants.OPTIONSNDAYSSUB,
						date1, date2, returnResultString);

				sessionList.add(localStructure);
			} else {
				System.out.println("NO DATE FOUND");
				localStructure = new localStructure(optionIntegerFOUR, "Subtraction",
						OutConstants.OPTIONSNDAYSSUB,
						date1, date2, "NO DATE FOUND");
				sessionList.add(localStructure);
			}
			// saveIt() ;

			return localStructure;

		case optionIntegerFIVE:
			Optional<Date> userInputDateParsed = stringParser.parser(userInput.orElse(" "));

			userInputDateParsed.ifPresentOrElse(value -> {
				System.out.println("Found Date is ->>> " + value);
				Calendar cal = Calendar.getInstance();
				cal.setTime(value);

				Integer week = cal.get(Calendar.WEEK_OF_YEAR);
				System.out.println("WEEK FOUND " + week);
				returnResultString = "WEEK FOUND " + week;

				returnResultString = week.toString();
			}, () -> {
				System.out.println("NO WEEK FOUND");
				returnResultString = "WEEK NOT FOUND";

			});
			localStructure = new localStructure(optionIntegerSEVEN, "NONE",
					OutConstants.DETERMINE_THE_WEEK_NUMBER,
					userInput.orElse(""), "", returnResultString);


			sessionList.add(localStructure);

			//			saveIt();
			return localStructure;
		default:
			localStructure = new localStructure(0, "ERROR", "", "", "", "");
			return localStructure;



		}

	}
}
