package InputOutputConstants;

import Operation.Arithmetic;

public class OutputConstants implements StandardOut {
	public static final String DATE_PARSER_ERROR = " ERROR : Entered date can't be parsed : ";
	public static final String DAYS_DIFF = " DAYS  ";
	public static final String WEEK_DIFF = " WEEK  ";
	public static final String MONTHS_DIFF = " MONTHS  ";
	public static final String YEAR_DIFF = " YEAR  ";
	public static final String WELCOME_MESSAGE = "Hello, welcome to the calculator App.";

	public static final String SUB_TWO_DATES_MESSAGE = "You can subtract two dates(as string or as specified US date format).";
	public static final String SIMPLE_DATE_STRING = "Evaluate simple date/string";
	public static final String DETERMINE_THE_WEEK_NUMBER = " Determine the Week number for a given a date";
	public static final String N_DATES_MESSAGE = "Add, Subtract 'n' Days, Months, Weeks to the given date";
	public static final String FORMAT_MESSAGE = "If you want to enter date enter it in MM/DD/YYYY format or just type a string as mentioned in example";
	public static final String DESIGN = "********************************************\n";

	public static final String CALC_STRING = "***************CALCUALTOR*******************\n";
	public static final String EXAMPLE = "--------------EXAMPLES ------------ ";
	public static final String EXAMPLE_MESSAGE1 = " Input first date as 10/02/1990  and second as 1/02/1990 ";
	public static final String HELP_LINK_STRING = "FOR MORE EXAMPLES visit http://natty.joestelmach.com/doc.jsp";
	public static final String EXAMPLE_MESSAGE2 = " Input first date as 10/02/1990  and second Date as string \"5 days from now \" ";
	public static final String OPTIONS1 = "Type First Date or String";
	public static final String OPTIONS2 = "Type Second Date or String";
	public static final String ASK_USER_INPUT_INTEGER = "Choose one of the  option -> Type 1 or 2 or .. ";
	float days;
	float weeks;
	float months;
	float year;

	@Override
	public void mainOutput() {
		System.out.println(DESIGN);
		System.out.println(CALC_STRING);
		System.out.println(DESIGN);
		System.out.println(WELCOME_MESSAGE);

		System.out.println(FORMAT_MESSAGE);
		System.out.println(EXAMPLE);
		System.out.println(EXAMPLE_MESSAGE1);
		System.out.println(EXAMPLE_MESSAGE2);
		System.out.println("!!!!!!!!!!     " + HELP_LINK_STRING + "     !!!!!!!!!!");
		UserIOTypes();
		System.out.println(ASK_USER_INPUT_INTEGER);
		System.out.println(DESIGN);


	}

	@Override
	public void UserIOTypes() {
		System.out.println("1." + SUB_TWO_DATES_MESSAGE);
		System.out.println("2." + N_DATES_MESSAGE);
		System.out.println("3." + SIMPLE_DATE_STRING);
		// System.out.println("4." + DETERMINE_THE_WEEK_NUMBER);
	}

	public OutputConstants() {

	}

	public OutputConstants(Arithmetic arithmetic) {
		this.days = arithmetic.date();
		this.weeks = arithmetic.week();
		this.months = arithmetic.months();
		this.year = arithmetic.years();
	}


	@Override
	public void UserOut() {
		System.out.println(year + YEAR_DIFF + months + MONTHS_DIFF + weeks + WEEK_DIFF + days + DAYS_DIFF);

	}

}
