package Flow_Control;

import java.util.Scanner;

public class Handson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='&';
	
		
		if(Character.isDigit(ch))
		{
			System.out.println("Digit");
		}	
		else if (Character.isAlphabetic(ch))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Special Character");
		}
	}

}
