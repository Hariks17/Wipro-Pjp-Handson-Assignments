package Set;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Handson2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set=new TreeSet<String>();
		set.add("apple");set.add("ball");
		set.add("computer");set.add("dance");
		System.out.println(set);
		System.out.println(((TreeSet<String>) set).descendingSet());
		
		for(Iterator i=set.iterator();i.hasNext();)
		{
			System.out.println(i.next());
		}
		System.out.println(set.contains("ball"));
	}


}
