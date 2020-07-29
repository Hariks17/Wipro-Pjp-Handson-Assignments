package datetimeapi;

import java.time.LocalDate;

public class Handsonone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate todaydate=LocalDate.now();
		
		System.out.println("Today's Date : "+todaydate);
		System.out.println("After 10 days: "+todaydate.plusDays(10));
				
	}
}
