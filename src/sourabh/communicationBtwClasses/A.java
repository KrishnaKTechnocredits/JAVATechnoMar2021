package sourabh.communicationBtwClasses;

public class A {
	void m1() {
		System.out.println("We are in Class A and m1 method");
		B b= new B();
		b.m2();
	}
	public static void main(String[]  args) {
		A a= new A();
		a.m1();
	}
}
