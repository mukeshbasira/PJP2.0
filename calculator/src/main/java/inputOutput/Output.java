package inputOutput;

import Operation.Arithmetic;

public class Output {

	float days;
	float weeks;
	float months;
	float year;


	public void mainOutput() {
		System.out.println(OutConstants.DESIGN);
		System.out.println(OutConstants.CALC_STRING);
		System.out.println(OutConstants.DESIGN);
		System.out.println(OutConstants.WELCOME_MESSAGE);

		System.out.println(OutConstants.FORMAT_MESSAGE);
		System.out.println(OutConstants.EXAMPLE);
		System.out.println(OutConstants.EXAMPLE_MESSAGE1);
		System.out.println(OutConstants.EXAMPLE_MESSAGE2);
		System.out.println("!!!!!!!!!!     " + OutConstants.HELP_LINK_STRING + "     !!!!!!!!!!");
		UserIOTypes();
		System.out.println(OutConstants.ASK_USER_INPUT_INTEGER);
		System.out.println(OutConstants.DESIGN);


	}


	public void UserIOTypes() {
		System.out.println("1." + OutConstants.SUB_TWO_DATES_MESSAGE);
		System.out.println("2." + OutConstants.N_DATES_MESSAGEADD);
		System.out.println("3." + OutConstants.SIMPLE_DATE_STRING);
		System.out.println("4." + OutConstants.N_DATES_MESSAGESUB);
		// System.out.println("4." + DETERMINE_THE_WEEK_NUMBER);
	}

	public Output() {

	}

	public Output(Arithmetic arithmetic) {
		this.days = arithmetic.date();
		this.weeks = arithmetic.week();
		this.months = arithmetic.months();
		this.year = arithmetic.years();
	}



	public String UserOut(String meString) {
		String replyString = meString + year + OutConstants.YEAR_DIFF + months + OutConstants.MONTHS_DIFF + weeks
				+ OutConstants.WEEK_DIFF + days + OutConstants.DAYS_DIFF;
		System.out.println(replyString);
		return replyString;

	}

	public String showInput(String input, String extracted) {
		String extractionForInputString = "You entered - >" + input + " Extracted output is - >" + extracted;
		System.out.println(extractionForInputString);
		return extractionForInputString;

	}

}
