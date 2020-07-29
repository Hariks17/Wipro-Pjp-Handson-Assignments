package datetimeapi;

import java.time.LocalDate;

public class Handsontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate todaydate=LocalDate.now();
		
		System.out.println("Today's Date : "+todaydate.with(todaydate.getDayOfWeek()));
		
	}

}
