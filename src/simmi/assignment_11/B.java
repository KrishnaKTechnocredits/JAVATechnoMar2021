package simmi.assignment_11;

public class B {
	
	void m2() {
		System.out.println("B class m2 method");
		B.m3();
	}
	
	static void m3() {
		System.out.println("B class m3 method");
		C c = new C();
		c.m4();
	}

}
