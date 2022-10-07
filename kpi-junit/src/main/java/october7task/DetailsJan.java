package october7task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DetailsJan {
    
	public static void jan26() {
		
		LocalDate date = LocalDate.of(2022, 01, 26);
		System.out.println("DETAILS OF THE DATE YOU WANT : "+date);
		LocalDateTime time = date.atStartOfDay();
		Month mon = date.getMonth();
		int day = date.getDayOfMonth();
		int time1 = date.getYear();
		
		System.out.println("\n"+time+" \n"+day+" \n"+mon+" \n"+time1);
		
		
		
		
	}
	
	
	public static void main(String args[]) {
		jan26();
	}
	
}
