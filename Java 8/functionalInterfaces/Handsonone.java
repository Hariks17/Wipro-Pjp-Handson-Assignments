package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;


class Employee {
	int	id;
	String name;
	String location;
	int salary;
	Employee(int id, String name,String location,int salary) {
		this.id = id;
		this.name = name;
		this.location=location;
		this.salary = salary;
	}

}
public class Handsonone {

	public static void main(String[] args) {
		List<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(1,"A","Salem",10000));
		al.add(new Employee(2,"B","Pune",10000));
		al.add(new Employee(3,"C","Delhi",10000));
		al.add(new Employee(4,"D","Mumbai",10000));
		al.add(new Employee(5,"E","Pune",10000));
		
		Function<Employee,String> f=e->e.location;
		
		List<String> nl=new ArrayList<String>();
		for(Employee emp:al)
		{
			nl.add(f.apply(emp));
		}
		nl.forEach(x->System.out.println(x));
		}
	

}
