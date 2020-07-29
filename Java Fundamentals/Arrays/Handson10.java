package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Handson10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,0,1,0,0,1,1};
		Vector v1=new Vector();
		Vector v2=new Vector();
		int index=0;
		for(int i=0;i<array.length;i++)
			if(array[i]%2==0)
				v1.add(array[i]);
			else
				v2.add(array[i]);
		
		for(index=0;index<v1.size();index++)
			array[index]=(int) v1.get(index);
		
		
		for(int i=0;i<v2.size();i++)
			array[index++]=(int) v2.get(i);
			
		
		System.out.println(Arrays.toString(array));
		
		
	}

}