package rashmi.Assignment_11;

public class B {
	
	void m2() {
		System.out.println("In class B m2 method....");
		B.m3();
	}
	
	static void m3() {
		System.out.println("In class B m3 method...");
		C c = new C();
		c.m4();
	}

}
