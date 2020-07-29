package forEach;

import java.util.ArrayList;

public class Handsonone {
	public static void main(String args[]) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sunday");al.add("Monday");al.add("Tuesday");al.add("Wednesday");
		al.add("Thurday");al.add("Friday");al.add("Saturday");
		al.forEach(System.out::println);
	}

}
