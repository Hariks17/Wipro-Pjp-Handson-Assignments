package Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Handson7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {12,34,12,45,67,89,89};
		List<Integer> list=new ArrayList<Integer>();
		for(int i:array)
			if(!list.contains(i))
				list.add(i);
		int[] newarray=new int[list.size()];
		
		for(int i=0;i<list.size();i++)
		{
			newarray[i]=list.get(i);
		}
		
		
		
		System.out.println(Arrays.toString(newarray));
		
		
		
		
	}

}
