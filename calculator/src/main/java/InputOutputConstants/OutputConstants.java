package InputOutputConstants;

public class OutputConstants implements StandardInOut {
	public static final String DATE_PARSER_ERROR = "ERROR : Entered date can't be parsed : ";
	public static final String DAYS_DIFF = "DAYS Differerence ";
	public static final String WEEK_DIFF = "WEEK Differerence ";
	public static final String MONTHS_DIFF = "MONTHS Differerence ";
	public static final String YEAR_DIFF = "YEAR Differerence ";
	float days;
	float weeks;
	float months;
	float year;

	public OutputConstants(float days, float weeks, float months, float year) {
		this.days = days;
		this.weeks = weeks;
		this.months = months;
		this.year = year;
	}

	@Override
	public void UserIO() {
		System.out.println(DAYS_DIFF + days);
		System.out.println(WEEK_DIFF + weeks);
		System.out.println(MONTHS_DIFF + months);
		System.out.println(YEAR_DIFF + year);

	}

}
