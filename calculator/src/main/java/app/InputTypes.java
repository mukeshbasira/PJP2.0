package app;

public class InputTypes {

	public static final String WELCOME_MESSAGE = "Hello, welcome to the calculator App.";
	public static final String ADD_TWO_DATES_MESSAGE = "You can add days,months,dates.";
	public static final String SUB_TWO_DATES_MESSAGE = "You can subtract two dates.";
	public static final String DAY_OF_THE_WEEK = "Determine the Day of the Week for a given date";
	public static final String DETERMINE_THE_WEEK_NUMBER = " Determine the Week number for a given a date";
	public static final String N_DATES_MESSAGE = "Add, Subtract 'n' Days, Months, Weeks to the given date";
	public static final String FORMAT_MESSAGE = "If you want to enter date enter it in MM/DD/YYYY format or just type a string as mentioned in example";
	public static final String DESIGN = "********************************************";

	public static final String CALC_STRING = "***************CALCUALTOR*******************";
	public static final String EXAMPLE = "--------------EXAMPLES ------------ ";
	public static final String EXAMPLE_MESSAGE1 = " Input first date as 15/02/1990  and second as 18/02/1990 ";
	public static final String EXAMPLE_MESSAGE2 = " Input first date as 15/02/1990  and second Date as string \"5 days from now \" ";
	public static final String OPTIONS1 = "Type First Date or String";
	public static final String OPTIONS2 = "Type Second Date or String";


	public InputTypes() {
		System.out.println(DESIGN);
		System.out.println(CALC_STRING);
		System.out.println(DESIGN);
		System.out.println(WELCOME_MESSAGE);
		System.out.println("1." + ADD_TWO_DATES_MESSAGE);
		System.out.println("2." + SUB_TWO_DATES_MESSAGE);
		System.out.println("3." + N_DATES_MESSAGE);
		System.out.println("4." + DAY_OF_THE_WEEK);
		System.out.println("5." + DETERMINE_THE_WEEK_NUMBER);
		System.out.println(EXAMPLE);
		System.out.println(EXAMPLE_MESSAGE1);
		System.out.println(EXAMPLE_MESSAGE2);
		System.out.println(DESIGN);
	}




}
