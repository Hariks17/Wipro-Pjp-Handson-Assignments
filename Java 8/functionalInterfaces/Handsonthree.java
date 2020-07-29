package functionalInterfaces;
import java.util.*;
import java.util.function.Predicate;
public class Handsonthree {
	public static void main(String args[])
	{
		Predicate<String> p=x->{
			return x.equals(new StringBuffer(x).reverse().toString());
		};
		List<String> al=new ArrayList<String>();
		al.add("redivider");al.add("deified");al.add("civic");al.add("radar");al.add("level");
		al.add("cricket");al.add("game");al.add("football");al.add("corona");al.add("virus");
		
		al.stream().filter(p).forEach(System.out::println);
		
	}

}
