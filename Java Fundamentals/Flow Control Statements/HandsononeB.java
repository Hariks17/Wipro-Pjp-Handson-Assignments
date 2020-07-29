package Flow_Control;

import java.util.Scanner;

public class HandsononeB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		if(number1%10==number2%10)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
