package lamba_expression;

import java.util.ArrayList;
import java.util.Collections;

public class Handsonthree {
	public static void main(String args[]) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");al.add("bank");al.add("car");al.add("dance");al.add("game");
		al.add("ice");al.add("job");al.add("king");al.add("news");al.add("pen");
		al.forEach(n->{
			if(n.length()%2!=0)
			System.out.println(n);});			
		}

}
