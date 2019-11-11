package FunctionFI;

import java.util.function.Function;

public class FunctionIntefaceDemo {
	public static void main(String arg[]){
		Function<Integer,Integer> f = i->i*i;
		
		System.out.println(f.apply(5));
		System.out.println(f.apply(9));
		
		Function<String,Integer> f1= s->s.length();
		System.out.println(f1.apply("vikash"));
	}

}
