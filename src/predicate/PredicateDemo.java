package predicate;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String arg[]){
		
		String arr[] = {"vikash","anu","anuradha","sanjeet","san"};
		
		Predicate<Integer> p=i->i%2==0;
		Predicate<String> s1=s-> s.length()>5;
		Predicate<String> s2=s-> s.length()%2==0;
		
		for(String ss:arr){
			if(s2.test(ss)){
				System.out.println(ss);
				
			}
		}
		System.out.println("----------------");
		for(String ss:arr){
			if(s1.test(ss)){
				System.out.println(ss);
			
			}
		}
		System.out.println("----------------");
		System.out.println(p.test(10));
		System.out.println(p.test(11));
		System.out.println(s1.test("vikash"));
		System.out.println(s1.test("vih"));
		
	}

}
