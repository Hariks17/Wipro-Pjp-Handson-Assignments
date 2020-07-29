package Set;

import java.util.Set;
import java.util.TreeSet;

class Employee{
	int empId;
	String name;
	float salary;
	Employee(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	
	
}
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> empset=new TreeSet<Employee>();
		TreeSetDemo demo=new TreeSetDemo();
		
		empset.add(new Employee(17,"EmpA",1000));
		empset.add(new Employee(23,"EmpB",2000));
		empset.add(new Employee(42,"EmpC",3000));
		empset.add(new Employee(73,"EmpD",500));
	
		for(Employee e:empset)
		{
			System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getSalary());
		}
	
}}
