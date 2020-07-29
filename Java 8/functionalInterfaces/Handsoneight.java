package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Handsoneight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<List<Integer>> s1=()->{
			List<Integer> al=new ArrayList<Integer>();
			int count=0;
			for(int j=2;j<=100;j++)
			{
				int sum=0;				
				for(int k=1;k<=(int)Math.sqrt(j);k++)
				{
					if(j%k==0)
					sum++;
				}
				if(sum==1)
				{
					al.add(j);	
					count++;
				}	
				if(count==10)
					break;
			}			
			
			
		return al;
			
		};
		System.out.println(s1.get());
	}

}
