package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*class Mycomparator implements Comparator<Integer>{

	
	public int compare(Integer I1, Integer I2) {
		if(I1<I2)
			return -1;
		else if(I1>I2)
			return +1;
		else
			return 0;
		return (I1<I2)?-1:(I1>I2)?+1:0;
	}
	
	//lambda expression
	//(I1,I2)->(I1<I2)?-1:(I1>I2)?+1:0;
	
}
*/
public class CollectionWithLambda {
	public static void main(String arg[]) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(100);
		ar.add(10);
		ar.add(70);
		ar.add(90);
		ar.add(30);
		ar.add(9);
		System.out.println(ar);
		//Collections.sort(ar,new Mycomparator())
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?+1:0;
		//Collections.sort(ar,c);
		ar.sort(Comparator.naturalOrder());
		System.out.println(ar);
		
		
		// with Lambda Expression
		
		
		
	}

}
