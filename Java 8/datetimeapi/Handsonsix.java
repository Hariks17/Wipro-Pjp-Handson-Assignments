package datetimeapi;

import java.time.LocalTime;

public class Handsonsix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time=LocalTime.now();
		System.out.println("Current Time : "+time);
		System.out.println("Time after : "+time.minusHours(5).minusMinutes(25));
	}

}
