package FunctionalInterface;

interface SquareRoot{
	public int data(int a);
}

public class FunctionDemo {
	public static void main(String arg[]){
		SquareRoot sqrt=(b)->b*b;
		
		System.out.println(sqrt.data(10));
	}

}
