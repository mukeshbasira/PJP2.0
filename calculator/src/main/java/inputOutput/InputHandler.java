package inputOutput;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import Converter.StringParser;
import Converter.StringtoDateParser;
import History.History;
import History.ToCsv;
import History.ToSerialize;
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
	public static final int optionIntegerFIVE = 5;
	public static final int optionIntegerSIX = 6;
	public static final int optionIntegerSEVEN = 7;
	public static final int optionIntegerEIGHT = 8;

	Optional<Date> date1Parsed;
	Optional<Date> date2Parsed;
	History history;
	String returnResultString;
	ArrayList<localStructure> sessionList = new ArrayList<localStructure>();

	public ArrayList<localStructure> getsessionList() {
		return sessionList;

	}


	static InputTypes standardIn = new InputTypes();;
	static Output standardOut;


	public void saveIt() throws Exception {
		setSession(new ToSerialize());
		history.addSession(getsessionList());
		history.save("save.ser");
		setSession(new ToCsv());
		history.addSession(getsessionList());
		history.save("save.csv");

	}
	public void setSession(History history) {
		this.history = history;
	}

	public String takeUserIntegerInput() throws Exception {
		Optional<Integer> userIntegerInput = standardIn.userIntegerInput();
		System.out.println("option selected is ->" + userIntegerInput.get());
		return IntegerHandler(userIntegerInput.get());

	}

	public String IntegerHandler(Integer number) throws Exception {
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

			sessionList
			.add(
					new localStructure(optionIntegerTHREE, "NONE", OutConstants.SUB_TWO_DATES_MESSAGE,
							userSingleInput
							.orElse(""),
							"",
							returnResultString));
			//			saveIt();
			return returnResultString;

		case optionIntegerONE:
			List<Optional<String>> userTwoDateInput = standardIn.UserTwoDateInput(OutConstants.OPTIONS1,
					OutConstants.OPTIONS2);
			date1 = userTwoDateInput.get(0).get();
			date2 = userTwoDateInput.get(1).get();

			date1Parsed = stringParser.parser(date1);
			date2Parsed = stringParser.parser(date2);

			if (date1Parsed.isPresent() && date2Parsed.isPresent()) {

				arithmetic = new Subtraction();
				arithmetic.equationSolver(date1Parsed.orElse(new Date()), date2Parsed.orElse(new Date()));

				standardOut = new Output(arithmetic);
				returnResultString = standardOut.UserOut("Difference between two dates is -> ");

				sessionList.add(new localStructure(optionIntegerONE,
						"Subtraction",
						OutConstants.SUB_TWO_DATES_MESSAGE,
						date1,
						date2, returnResultString
						));
			} else {
				System.out.println("NO DATE FOUND");
				sessionList.add(new localStructure(optionIntegerONE, "Subtraction",
						OutConstants.SUB_TWO_DATES_MESSAGE,
						date1, date2, "NO DATE FOUND"));

			}
			//			saveIt();

			return returnResultString;


		case optionIntegerTWO:
			List<Optional<String>> userTwoDateInput1 = standardIn.UserTwoDateInput(
					OutConstants.OPTIONS1, OutConstants.OPTIONSNDAYSADD);
			date1 = userTwoDateInput1.get(0).get();
			date2 = userTwoDateInput1.get(1).get();
			date1Parsed = stringParser.parser(date1);
			date2Parsed = stringParser.parser(date2);

			arithmetic = new NOperation("Addition");
			if(date1Parsed.isPresent()&& date2Parsed.isPresent()) {

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

				sessionList.add(new localStructure(optionIntegerTWO, "Addition",
						OutConstants.OPTIONSNDAYSADD,
						date1,
						date2,
						returnResultString));
			}else {
				System.out.println("NO DATE FOUND");
				sessionList.add(new localStructure(optionIntegerTWO, "Addition",
						OutConstants.OPTIONSNDAYSADD,
						date1,
						date2,
						"NO DATE FOUND"));

			}



			//			saveIt();

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
			if (date1Parsed.isPresent() && date2Parsed.isPresent()) {

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

				sessionList.add(new localStructure(optionIntegerFOUR,
						"Subtraction",
						OutConstants.OPTIONSNDAYSADD,
						date1, date2, returnResultString));
			} else {
				System.out.println("NO DATE FOUND");
				sessionList.add(new localStructure(optionIntegerFOUR, "Subtraction", OutConstants.OPTIONSNDAYSADD,
						date1,
						date2, "NO DATE FOUND"));
			}
			//			saveIt() ;

			return returnResultString;



		case optionIntegerFIVE:
			setSession(new ToSerialize());
			history.addSession(sessionList);
			history.save("save.ser");

			return "DONE";



		case optionIntegerSIX:
			setSession(new ToCsv());
			history.addSession(sessionList);
			history.save("save.csv");
			return "DONE";
		case optionIntegerSEVEN:
			Optional<String> userInput = standardIn.UserInputString(OutConstants.DETERMINE_THE_WEEK_NUMBER);
			Optional<Date> userInputDateParsed = stringParser.parser(userInput.orElse(""));

			userInputDateParsed.ifPresentOrElse(value -> {
				System.out.println("Found Date is ->>> " + value);
				Calendar cal = Calendar.getInstance();
				cal.setTime(value);
				Integer week = cal.get(Calendar.WEEK_OF_YEAR);
				System.out.println("WEEK FOUND " + week);

				returnResultString = week.toString();
			}, () -> {
				System.out.println("NO WEEK FOUND");
				returnResultString = "WEEK NOT FOUND";

			});


			sessionList.add(new localStructure(optionIntegerSEVEN, "NONE",
					OutConstants.DETERMINE_THE_WEEK_NUMBER,
					userInput.orElse(""), "", returnResultString));

			//			saveIt();
			return returnResultString;
		case optionIntegerEIGHT:
			saveIt();

			return "EXIT";





		default:

			System.out.println("\"Entered Integer is not valid\"");

			sessionList.add(new localStructure(0, "ERROR", "", "", "", ""));
			//			saveIt() ;
			return "\"Entered Integer is not valid\\";

		}


	}

}
