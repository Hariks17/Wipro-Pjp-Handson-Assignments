package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Handsonseven {
public static void main(String args[])
{
	Consumer<Integer> c=x->
	{
		if(x%2==0)
			System.out.println(x +" even");
		else
			System.out.println(x +" odd");;
	};
	List<Integer> al=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	al.forEach(n->c.accept(n));
	
}
}
