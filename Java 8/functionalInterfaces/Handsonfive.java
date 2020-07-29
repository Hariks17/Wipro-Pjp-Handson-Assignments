package functionalInterfaces;
import java.util.*;
import java.util.function.Predicate;
public class Handsonfive {
	public static void main(String args[])
	{
		Predicate<Integer> p=x->{
			int y=(int)Math.sqrt(x);
			return x==y*y;
		};
		Random rand=new Random();
		List<Integer> list=Arrays.asList(1,4,9,64,5,8,36,56,50,34);
		
		list.stream().filter(p).forEach(System.out::println);
	}

	
}
