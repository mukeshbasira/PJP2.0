package Operation;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Subtraction implements Arithmetic {
	//	private float days;
	//	private float weeks;
	//	private float years;
	//	private float months;

	private LocalDate date1;
	private LocalDate date2;
	private Period period;


	@Override
	public Integer date() {
		return Math.abs(period.getDays() % 7);

	}

	@Override
	public Integer week() {
		return Math.abs(period.getDays() / 7);


	}

	@Override
	public Integer months() {
		return Math.abs(period.getMonths());

	}

	@Override
	public Integer years() {
		return Math.abs(period.getYears());

	}


	@Override
	public void equationSolver(Date inputDate1, Date inputDate2) {
		date1 = LocalDate.ofInstant(inputDate1.toInstant(), ZoneId.systemDefault());
		date2 = LocalDate.ofInstant(inputDate2.toInstant(), ZoneId.systemDefault());
		period = Period.between(date1, date2);


	}


}
