package Flow_Control;

import java.util.Scanner;

public class Handson15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Please enter an integer number");
		int num=new Scanner(System.in).nextInt();
		int x=0;
		int i=0;
		for(i=1;i<=num;i++)
		{
		int v=i;
		while(v>0)
		{
			System.out.print("x ");
			v--;
		}
		
		System.out.println();
		}
		
	}

}
