package stringjoiner;

import java.util.StringJoiner;

public class Handsontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1=new StringJoiner("-");
		s1.add("Mumbai");
		s1.add("Delhi");
		StringJoiner s2=new StringJoiner("-");
		s2.add("Chennai");
		s2.add("Kolkata");
		System.out.println(s1.merge(s2));
		System.out.println(s2.merge(s1));
	}

}
