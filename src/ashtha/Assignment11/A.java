package ashtha.Assignment11;

public class A {

	void m1() {
		System.out.println("Inside the first method");
		new B().m2();
	}
	
	public static void main(String[] args) {
		new A().m1();
	}
}
