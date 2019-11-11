package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int eno;
	String name;
	public Employee(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
	public String toString(){
		return eno+":"+name;
	}
}

class Mycomparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.eno<o2.eno)
		return -1;
		else if(o1.eno>o2.eno)
			return +1;
		else
			return 0;
	}
	
}

public class SortingEmpByIdUsingCamparatorWithLambda {
	public static void main(String arg[]){
		ArrayList<Employee> emp =new ArrayList<Employee>();
		emp.add(new Employee(102,"vikash"));
		emp.add(new Employee(100,"anu"));
		emp.add(new Employee(2,"sam"));
		emp.add(new Employee(1002,"sanjeet"));
		emp.add(new Employee(90,"jon"));
		System.out.println(emp);
		
		// with Lambda Expresion
		//Collections.sort(emp,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?+1:0);
		emp.sort((e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?+1:0);
		// without lambda Expression
		//Collections.sort(emp,new Mycomparator());  
		
		//sorting based on employee alphabatical order
		
	//	Collections.sort(emp,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(emp);
	}

}
