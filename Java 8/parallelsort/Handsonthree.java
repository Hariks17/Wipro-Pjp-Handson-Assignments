package parallelsort;

import java.util.Arrays;

public class Handsonthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,1,5,16,7,2,15,5,10,45};
		Arrays.parallelSort(arr,0,5);
		System.out.println(Arrays.toString(arr));
	}

}
