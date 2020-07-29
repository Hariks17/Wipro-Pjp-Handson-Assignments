package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Handson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,3,2,4,5};
		int number=new Scanner(System.in).nextInt();
		for(int i=0;i<array.length;i++)
			if (number==array[i])
			{
				System.out.println(number+" is present in index "+i);
			return ;
			}
		System.out.println("-1");
		
		
		
	}

}
