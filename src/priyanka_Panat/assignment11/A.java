package priyanka_Panat.assignment11;

public class A {
	void m1() {
		System.out.println("In Non-Static Method m1 from Class A");
		B b1=new B();
		b1.m2();
	}
	
	public static void main(String[] args) {
		A a1= new A();
		a1.m1();
	}
}
