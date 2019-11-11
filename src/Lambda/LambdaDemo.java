package Lambda;

@FunctionalInterface
interface Interf{
	public void show();
	
}

public class LambdaDemo {
	public static void main(String arg[]){
		Interf i=()-> System.out.print("hello");
		i.show();
	}

}
