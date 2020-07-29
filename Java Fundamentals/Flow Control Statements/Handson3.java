package Flow_Control;

import java.util.Scanner;

public class Handson3 {

	public static void main(String[] args) {
		if(args.length==0)
			System.out.println("No Values");
		else
		{
			if(args.length>1)
			for(int i=0;i<args.length;i++)
				System.out.print(args[i]+" , ");
			else
				System.out.println(args[0]);
		}
	}

}
