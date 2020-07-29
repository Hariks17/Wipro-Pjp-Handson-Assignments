package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Handson14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=0;
		int a[][]=new int[3][3];
		int max=0;
		if(args.length<9)			
		{
		System.out.println("Please enter 9 integer numbers");
		}
		else
		{
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j]=Integer.parseInt(args[index++]);
		
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");		
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
			}
		}
		System.out.println(max);
		
	}

}