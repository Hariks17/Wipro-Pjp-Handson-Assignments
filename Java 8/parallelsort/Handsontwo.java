package parallelsort;

import java.util.Arrays;

public class Handsontwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hariharan";
		char ch[]=name.toCharArray();
		Arrays.parallelSort(ch);
		System.out.println(String.valueOf(ch));
	}
}
