package datetimeapi;

import java.time.LocalDate;

public class Handsonfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		if(today.isLeapYear())
		{
			System.out.println("LeapYear");
		}
		else
		{
			System.out.println("Not a leap year");
		}
		
	}

}
