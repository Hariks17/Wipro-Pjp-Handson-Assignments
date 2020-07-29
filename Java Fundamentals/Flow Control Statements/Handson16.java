package Flow_Control;

import java.util.Scanner;

public class Handson16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Please enter an integer number");
		int num=new Scanner(System.in).nextInt();
		int temp=0;
		while(num>0)
		{
			temp*=10;
			temp+=num%10;
			num/=10;
		}
		System.out.println(temp);
	}

}
