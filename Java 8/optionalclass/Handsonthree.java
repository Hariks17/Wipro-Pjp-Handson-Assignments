package optionalclass;

import java.util.Optional;

class Employee{  
      int id;  
      String name;
      int salary;  
      Employee(int id,String name,int salary){  
       this.id=id;  
       this.name=name;  
       this.salary=salary;  
      }  
    }

public class Handsonthree {

    public static void main(String[] args) throws Exception {
        Employee e= new Employee(0, null, 0);
        Optional<String> n = Optional.ofNullable(e.name); 
        System.out.print( n.orElseThrow(()->new Exception("InvalidEmployeeException")));
    }

}