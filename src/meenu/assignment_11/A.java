package meenu.assignment_11;

public class A {
	
	void m1() {
		System.out.println("Inside method m1 of class A, calling method m2 of class B");
		B b = new B();
		b.m2();
	}

	public static void main(String[] args) {
		System.out.println("Calling method m1");
		A a = new A();
		a.m1();
	}

}
