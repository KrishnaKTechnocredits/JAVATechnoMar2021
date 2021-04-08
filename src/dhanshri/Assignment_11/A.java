package dhanshri.Assignment_11;

public class A {
	void m1() {
		System.out.println("Class A-- Non static method m1");
		B b = new B();
		b.m2();

	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();

	}

}
