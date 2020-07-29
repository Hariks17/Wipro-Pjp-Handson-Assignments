package stream;

import java.util.ArrayList;
import java.util.List;

class Student{
	int rollno;
	String name;
	int mark;
	Student(int rollno, String name, int mark) {
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
}
public class Handsonthree {
	public static void main(String args[])
	{
		List<Student> al=new ArrayList<Student>();
		al.add(new Student(10,"A",67));
		al.add(new Student(11,"B",87));
		al.add(new Student(12,"C",45));
		al.add(new Student(13,"D",50));
		al.add(new Student(14,"E",66));
		
		System.out.println(al.stream().filter(x -> x.mark>=50).count());
		
		
	}

}
