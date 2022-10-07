package october7task;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class DetailsOct {
	static void oct7details() {
		LocalDate date = LocalDate.now();

		LocalDate day = date.withDayOfYear(7).withYear(2030).withMonth(10);
		LocalDate specificDate = day.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("DETAILS FOLLOWS : "+specificDate);
		
		DayOfWeek day1 = day.getDayOfWeek();
		System.out.println("Day of the week : "+day1);
		
		int day11 = day.getMonthValue();
		System.out.println("date is : "+day11);
		
		Month month = day.getMonth();
		System.out.println("Month of the date : "+month);
		
		int year = day.getYear();
		System.out.println("Year of the day : "+year);
		
		
		
		
		
		
		

	}

	public static void main(String args[]) {
		oct7details();
	}
}


