package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import java.util.List;

public class Handsonone {
	public static void main(String args[])
		{
		List<Integer> al=new ArrayList<Integer>();
		al.add(-4);
		al.add(-7);
		al.add(-2);
		List<Integer> nl=al.stream()
				.filter(x->x%2==0 && x<0)
				.collect(Collectors.toList());
		
		System.out.println(nl);
		
		}
		
		
		
		
}
