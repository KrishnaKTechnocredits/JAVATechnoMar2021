package aparna.staticNonStaticCalling;

public class C {
	void m4() {
		System.out.println("I am in m4 method of Class C");
		m5();// m4() and m5() both are non static and in same class , from non static method
				// to non static method direct calling is allowed.
	}

	void m5() {
		System.out.println("I am in m5 method of Class C");
		D.m6();// m5() is Non static of class C and m6() is static method of class D, from non
				// static method to static method direct calling is allowed.

	}
}
