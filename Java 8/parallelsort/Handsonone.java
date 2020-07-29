package parallelsort;

import java.util.Arrays;

public class Handsonone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,5,16,7,2,15,5,10,45};
		Arrays.parallelSort(arr);
		System.out.println(arr[0]+arr[9]);
	}

}
