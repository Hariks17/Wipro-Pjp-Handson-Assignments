package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Handson13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=0;
		int a[][]=new int[2][2];
		if(args.length<4)			
		{
		System.out.println("Please enter 4 integer numbers");
		}
		else
		{
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				a[i][j]=Integer.parseInt(args[index++]);
		
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
				System.out.print(a[i][j]+" ");
		System.out.println();
		}	
		System.out.println();
		for(int i=1;i>=0;i--)
		{
			for(int j=1;j>=0;j--)
				System.out.print(a[i][j]+" ");
		System.out.println();
		}	
		
		
	}

}