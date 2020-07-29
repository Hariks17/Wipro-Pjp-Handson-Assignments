package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Handsontwo {

	public static void main(String[] args) {

		Function<List<Integer>,Integer> f= list->{
			int sum=0;
			for(int i=0;i<list.size();i++)
			{
				sum+=list.get(i);
			}
			return sum;
		}; 
		
		List<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
			al.add(i);
		
		System.out.println(f.apply(al));
		
	}

}
