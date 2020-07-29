package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Handson8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10, 3, 6, 1, 2, 7, 9};
		int sum = 0;
		int positionOfSeven = 0;
		int positionOfSix = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 6) 
				positionOfSix = i;
			if (array[i] == 7) 
				positionOfSeven = i;
		}
		
		
		for (int i = 0; i < array.length; i++) {
			if (i >= positionOfSix && i <= positionOfSeven) 
				continue;
			sum += array[i];
		}
		
		System.out.println(sum);
		
	}

}
