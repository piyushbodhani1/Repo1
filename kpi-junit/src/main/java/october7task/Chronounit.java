package october7task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Chronounit {
	public static void chrono() {
		// current date
		LocalDate date = LocalDate.now();
		System.out.println("Todays date  " + date);
		// local time
		LocalDate year = date.plus(2, ChronoUnit.YEARS);
		System.out.println("Year after 2 years : " + year);
		// LocalDateTime
		LocalDate month = date.plus(3, ChronoUnit.MONTHS);
		System.out.println("Month after 3 month :" + month);

		LocalDate day = date.plus(6, ChronoUnit.DAYS);
		System.out.println("Day after 6 data "+day);
	}

	public static void main(String args[]) {
		chrono();
	}
}
