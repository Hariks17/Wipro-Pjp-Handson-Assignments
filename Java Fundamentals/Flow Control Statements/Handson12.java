package Flow_Control;

import java.util.Scanner;

public class Handson12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
			
		}
		if(count==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
