package com.app.inputOutput;

import com.app.Operation.Arithmetic;

public class Output {

	float days;
	float weeks;
	float months;
	float year;



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
