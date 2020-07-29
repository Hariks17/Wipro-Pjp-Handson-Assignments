package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Handson9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,10,10,2};
		int newarray[]=new int[array.length];
		int index=0;
		for(int i=0;i<array.length;i++)
			if(array[i]!=10)
				newarray[index++]=array[i];
				
		
		System.out.println(Arrays.toString(newarray));
		
	}

}
