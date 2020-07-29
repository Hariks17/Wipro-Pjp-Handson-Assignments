package lamba_expression;

import java.util.ArrayList;
import java.util.Collections;

public class Handsontwo {
	public static void main(String args[]) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");al.add("bank");al.add("car");al.add("dance");al.add("game");
		al.add("ice");al.add("job");al.add("king");al.add("news");al.add("pen");
		Collections.reverse(al);
		al.forEach(n->System.out.println(n));			
		}

}
