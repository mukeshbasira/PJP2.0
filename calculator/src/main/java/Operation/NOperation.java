package Operation;

import java.util.Calendar;
import java.util.Date;

public class NOperation {
	private Date inputDate1;
	private Date inputDate2;
	Calendar calendar1 = Calendar.getInstance();
	Calendar calendar2 = Calendar.getInstance();
	private float difference;

	public NOperation(Date inputDate1, Date inputDate2) {
		// Date date = date1Parsed.get(); // the date instance
		// Calendar calendar = Calendar.getInstance();
		// calendar2.setTime(inputDate2);
		// calendar1.setTime(inputDate2);

		// System.out.println(calendar.get(Calendar.YEAR));
		this.inputDate1 = inputDate1;
		this.inputDate2 = inputDate2;

	}

	public float dateDifferece() {
		return ((difference + 10) / (1000 * 60 * 60 * 24));

	}

	public float weekDifferece() {
		return ((difference + 10) / (1000 * 60 * 60 * 24 * 7));

	}

	public float monthsDifferece() {
		return ((difference + 10) / (1000 * 60 * 60 * 24 * 12));

	}

	public float yearsDifferece() {
		return ((difference + 10) / (1000 * 60 * 60 * 24 * 365));

	}

	@Override
	public void equationSolver() {

		this.difference = inputDate1.getTime() - inputDate2.getTime();

	}

}
