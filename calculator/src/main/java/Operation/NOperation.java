package Operation;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;


public class NOperation implements Arithmetic {
	private Date inputDate1;
	private Date inputDate2;
	Calendar calendar1 = Calendar.getInstance();
	Calendar calendar2 = Calendar.getInstance();
	String operString;
	Integer datesInteger;
	Integer monthsInteger;
	Integer weeksInteger;
	Integer yearsInteger;
	LocalDate date1;

	public LocalDate getDate1() {
		return date1;
	}

	LocalDate date2;
	Period period;

	public NOperation(String opeString) {


		this.operString = opeString;

	}




	@Override
	public void equationSolver(Date inputDate1, Date inputDate2) {

		date1 = LocalDate.ofInstant(inputDate1.toInstant(), ZoneId.systemDefault());
		date2 = LocalDate.ofInstant(inputDate2.toInstant(), ZoneId.systemDefault());

		LocalDate today = LocalDate.now();
		period = Period.between(today, date2);

		System.out.println("Trying operation " + operString);



		if (operString.contains("Addition")) {

			date1 = date1.plus(period);
			System.out.println("Addition operation completed : " + date1);

		} else if (operString.contains("Subtraction")) {

			date1 = date1.minus(period);

			System.out.println("Subtracted operation completed : " + date1);


		}


	}

	@Override
	public Integer date() {
		// TODO Auto-generated method stub

		return date1.getDayOfMonth();
	}

	@Override
	public Integer week() {
		// TODO Auto-generated method stub
		return date1.getDayOfMonth() / 7;
	}

	@Override
	public Integer months() {
		// TODO Auto-generated method stub
		return date1.getMonthValue();
	}

	@Override
	public Integer years() {
		// TODO Auto-generated method stub
		return date1.getYear();
	}


}
