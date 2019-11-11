interface Deduction {
	static void deduct() {
		System.out.println("deduct");
	}
}
class Customer implements Deduction {
	public static void deduct() {
		System.out.println("deduction for customer");
	}
}

public class Test {
	public static void main(String[] args) {
		Customer deduction = new Customer();
		deduction.deduct();
	}

}
