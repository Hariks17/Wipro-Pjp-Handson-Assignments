package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Handson11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,1,4};
		for(int i:array)
			if (i!=4&&i!=1)
			{
				System.out.println("false");
				return ;
			}
		System.out.println("true");
		
	}

}