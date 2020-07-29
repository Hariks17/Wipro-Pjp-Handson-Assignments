package forEach;

import java.util.ArrayList;

class Employee{
	
	int id;
	String name;
	String address;
	long salary;
	
	Employee(int id,String name,String address,long salary){
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
}
public class Handsontwo {
public static void main(String args[])
{
	ArrayList<Employee> emp=new ArrayList<Employee>();
	emp.add(new Employee(17,"Hari","Salem",300000));
	emp.add(new Employee(1,"A","Namakal",30000));
	emp.add(new Employee(2,"Hariharan","US",100000));
	emp.add(new Employee(3,"Harish","UK",300000));
	emp.add(new Employee(4,"Hariks","UAE",300000));
	emp.forEach(x->System.out.println("Id:"+x.id+" Name:"+x.name+" Address:"+x.address+" Salary:"+x.salary));
}
}
