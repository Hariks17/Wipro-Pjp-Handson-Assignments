package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class Employee {
	int	empNo;
	String name;
	int age;
	String location;
	Employee(int empNo, String name, int age,String location) {
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location=location;
	}

}
public class Handsontwo {

	public static void main(String[] args) {
		List<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(1,"A",21,"Salem"));
		al.add(new Employee(2,"B",21,"Pune"));
		al.add(new Employee(3,"C",21,"Delhi"));
		al.add(new Employee(4,"D",21,"Mumbai"));
		al.add(new Employee(5,"E",21,"Pune"));
		List<Employee> nl=
				 al.stream()
				.filter(x->x.location.equals("Pune"))
				 .collect(Collectors.toList());
		
		for(Employee emp:nl)
		{
			System.out.println("Id : "+emp.empNo+" Name : "+emp.name+" Age : "+emp.age+" Location : "+emp.location);
		}
		
	}

}
