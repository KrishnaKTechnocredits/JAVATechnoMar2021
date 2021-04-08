package simmi.communicationBtwClasses;

public class A {
	void m1() {
		B b = new B();
		b.m2();
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println("I am in class A");
		a.m1();
	}
	}

