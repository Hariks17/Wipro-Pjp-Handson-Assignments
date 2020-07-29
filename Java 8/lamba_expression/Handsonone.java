package lamba_expression;

import java.util.ArrayList;
import java.util.Random;

public class Handsonone {
	public static void main(String args[]) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		Random rand=new Random();
		for(int i=0;i<25;i++)
		al.add(rand.nextInt(50));
		System.out.println(al+"\n"+"Prime Numbers of Above List are ");
		al.forEach(n->{
			int count=0;
			for(int i=1;i<=(int)Math.sqrt(n);i++)
			{
				if(n%i==0)
					count++;
			}
			if(count==1)
				System.out.println(n);
		});			
		}
		
	}

