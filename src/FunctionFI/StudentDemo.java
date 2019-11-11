package FunctionFI;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	Student(int marks,String name){
		this.marks = marks;
		this.name = name;
	}
	public String toString(){
		return name+" : "+marks;
	}
}

public class StudentDemo {
	public static void main(String arg[]){
		
		Function<Student,String> f = s->{
			int marks = s.marks;
			String grades="";
			if(marks>80) grades =  "A [Dictintion]";
			else if(marks>60) grades  = "B [First Class]";
			else if(marks>45) grades = "C [Second Class]";
			else if(marks>35) grades = "D [Third Class]";
			else grades="F[Failed]";
			return grades ;
		};
		
		Predicate<Student> p = e->e.marks>=60;
		
		ArrayList<Student> std=new ArrayList();
		std.add(new Student(90, "vikash"));
		std.add(new Student(70, "sam"));
		std.add(new Student(23, "john"));
		std.add(new Student(50, "anu"));
		for(Student ss:std){
			if(p.test(ss)){
				System.out.println("Student Name:"+ss.name);
				System.out.println("Student Marks:"+ss.marks);

				System.out.println("Student Grades:"+f.apply(ss));
			}
			
			}
		}
	}


