package Operation;

import java.util.Calendar;
import java.util.Date;

public class Subtraction implements Arithmetic {
	//	private float days;
	//	private float weeks;
	//	private float years;
	//	private float months;
	Calendar calendar1 = Calendar.getInstance();
	Calendar calendar2 = Calendar.getInstance();
	private float difference;


	@Override
	public int dateDifferece() {
		return (int) ((difference + 10) / (1000 * 60 * 60 * 24));

	}

	@Override
	public int weekDifferece() {
		return (int) ((difference + 10) / (1000 * 60 * 60 * 24 * 7));


	}

	@Override
	public int monthsDifferece() {
		return (int) ((difference + 10) / (1000 * 60 * 60 * 24 * 12));

	}

	@Override
	public int yearsDifferece() {
		return (int) ((difference + 10) / (1000 * 60 * 60 * 24 * 365));

	}


	@Override
	public void equationSolver(Date inputDate1, Date inputDate2) {

		this.difference = inputDate1.getTime() - inputDate2.getTime();

	}

}
