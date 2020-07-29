package Flow_Control;

import java.util.Scanner;

public class Handson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=Integer.parseInt(args[1]);
		if(args[0].equalsIgnoreCase("Male"))
		{
			if(age>58)
				System.out.println("Interest 10.5%");
			else
				System.out.println("Interest 8.4%");
		}
		else
		{
			if(age>59)
				System.out.println("Interest 9.2%");
			else
				System.out.println("Interest 8.2%");
		}
		
	}

}
