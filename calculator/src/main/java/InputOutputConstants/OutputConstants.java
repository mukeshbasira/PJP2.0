package InputOutputConstants;

import Operation.Arithmetic;

public class OutputConstants implements StandardInOut {
	public static final String DATE_PARSER_ERROR = " ERROR : Entered date can't be parsed : ";
	public static final String DAYS_DIFF = " DAYS  ";
	public static final String WEEK_DIFF = " WEEK  ";
	public static final String MONTHS_DIFF = " MONTHS  ";
	public static final String YEAR_DIFF = " YEAR  ";
	float days;
	float weeks;
	float months;
	float year;

	public OutputConstants(Arithmetic arithmetic) {
		this.days = arithmetic.date();
		this.weeks = arithmetic.week();
		this.months = arithmetic.months();
		this.year = arithmetic.years();
	}

	@Override
	public void UserIO() {
		System.out.println(year + YEAR_DIFF + months + MONTHS_DIFF + weeks + WEEK_DIFF + days + DAYS_DIFF);

	}

}
