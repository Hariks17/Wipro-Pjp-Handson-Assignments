package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.*;

class Employees {
	private int	id;
	private String name;
	private int salary;
	
	Employees(int id, String name,int salary) {
		this.id = id;
		this.setName(name);
		this.setSalary(salary);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
public class Handsonfour {
	public static void main(String args[])
	{
	Predicate<Employees> p=e->{return e.getSalary()<10000;};
	List<Employees> al=new ArrayList<Employees>();
	al.add(new Employees(1,"A",10000));
	al.add(new Employees(2,"B",10000));
	al.add(new Employees(3,"C",5000));
	al.add(new Employees(4,"D",7000));
	al.add(new Employees(5,"E",20000));
	for(Employees emp:al)
	if(p.test(emp))
	{
		System.out.println(emp.getName());		
	}
	}

}
