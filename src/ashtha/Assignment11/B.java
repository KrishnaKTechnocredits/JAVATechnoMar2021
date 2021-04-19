package ashtha.Assignment11;

public class B {
	void m2() {
		System.out.println("Inside the second method");
		m3();
	}
	
	static void m3() {
		C c = new C();
		System.out.println("Inside the third method");
		c.m4();		
	}
}
