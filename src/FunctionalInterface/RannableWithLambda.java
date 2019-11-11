package FunctionalInterface;

/*class Demo implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<5; i++){
			System.out.println("Child Thread:"+i);
		}
	}
	
}
*/
public class RannableWithLambda {
	public static void main(String arg[]){
		Runnable r=()->{
			for(int i=1; i<5; i++){
				System.out.println("Child Thread:"+i);
			}
		};
		Thread t=new Thread(r);
		t.run();
		for(int i=1; i<5; i++){
			System.out.println("Parent Thread:"+i);
		}
	}

}
