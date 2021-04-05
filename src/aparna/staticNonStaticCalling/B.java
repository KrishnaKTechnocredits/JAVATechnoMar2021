package aparna.staticNonStaticCalling;

public class B {
	void m2() {
		System.out.println("I am in m2 method of Class B");
		m3();// m3() is static and m2() is Non static method of class D, from non static
				// method to static method direct calling is allowed.
	}

	static void m3() {
		System.out.println("I am in m3 method of Class B");
		C c = new C();
		c.m4();// from static method m3() to non static method m4() of Class C direct calling
				// is not allowed.we have to create object of class C and on reference variable
				// we have to access non static method m4().

	}
}
