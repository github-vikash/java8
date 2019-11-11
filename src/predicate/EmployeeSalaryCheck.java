package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	double salary;
	String name;
	Employee(double salary,String name){
		this.name=name;
		this.salary=salary;
	}
	public String toString(){
		return name+" : "+salary;
	}
}


public class EmployeeSalaryCheck {
	public static void main(String arg[]){
		ArrayList<Employee> ar=new ArrayList<Employee>();
		ar.add(new Employee(100000, "vikash"));
		ar.add(new Employee(50000, "anu"));
		ar.add(new Employee(40000, "sanjeet"));
		ar.add(new Employee(30000, "san"));
		ar.add(new Employee(20000, "john"));
		Predicate<Employee> p = e->e.salary>29000;
		Predicate<Employee> p1 = e->e.name.length()>=3;
		for(Employee ee:ar){
			if(p.and(p1).test(ee)){
				System.out.println(ee);
			}
		}
	}
	

}

