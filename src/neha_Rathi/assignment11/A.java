package neha_Rathi.assignment11;

public class A {

	void m1() {
		System.out.println("This is class A m1 method");
		B b1 = new B();
		b1.m2();
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
	}

}
