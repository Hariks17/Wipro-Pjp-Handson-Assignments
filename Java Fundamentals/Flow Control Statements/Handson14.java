package Flow_Control;

import java.util.Scanner;

public class Handson14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int num=new Scanner(System.in).nextInt();
		int sum=0;
		String str=String.valueOf(num);
		for(int i=0;i<str.length();i++)
		{
			
			sum+=(48-str.charAt(i));
		}
		System.out.println(-sum);
		
	}

}
