package october7task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
	public static void LocalDateTimeApi() {
		// current date
		LocalDate d = LocalDate.now();
		System.out.println("Todays date  " + d);
		// local time
		LocalTime t = LocalTime.now();
		System.out.println("Todays time : " + t);
		// LocalDateTime
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Todays date and time " + current);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		String formatedDateTime = current.format(format);
		System.out.println("In formatted manner " + formatedDateTime);

		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int hr = current.getSecond();
		int yr = current.getYear();
		System.out.println(" Month " + month + " day " + day + " hr " + hr + " Year " + yr);

	}
	

	public static void main(String args[]) {
		LocalDateTimeApi();
	}
}
