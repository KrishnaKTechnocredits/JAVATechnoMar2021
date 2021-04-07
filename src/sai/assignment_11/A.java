package sai.assignment_11;

public class A {

	void m1() {
		System.out.println("Class A - m1 method");
		B b1 = new B();
		b1.m2();
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
	}
}
