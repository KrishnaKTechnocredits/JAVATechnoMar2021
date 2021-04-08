package sai.assignment_11;

public class B {

	void m2() {
		System.out.println("Class B - m2 method");
		m3();
	}

	static void m3() {
		System.out.println("Class B - m3 method");
		C c1 = new C();
		c1.m4();
	}
}