package stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Handsonone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Hari","Clark","Bellamy","Murphy","Monty");
		StringJoiner s1=new StringJoiner(", ","{","}");
		list.forEach(x->s1.add(x));
		System.out.println(s1);
		
	}
}
