package purva.StaticNonStatic.Assignment_11;

public class B {
 
	void m2() {
		System.out.println("In non static method m2");
		m3();
	}
	
	static void m3() {
		System.out.println("In static method m3");
		C c = new C();
		c.m4();
	}
}
