package simmi.assignment_11;

public class A {
	
	void m1() {
		System.out.println("A class m1 method");
		B b = new B();
		b.m2();
	}
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
}
