package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Handsonsix {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<List<String>> c=list->{
			for(int i=0;i<list.size();i++)
			{
				list.set(i,new StringBuffer(list.get(i)).reverse().toString());
			}
		};
		List<String> al=new ArrayList<String>();
		al.add("Apple");al.add("bank");al.add("car");al.add("dance");al.add("game");
		al.add("ice");al.add("job");al.add("king");al.add("news");al.add("pen");
		c.accept(al);
		System.out.println(al);
	}

}
