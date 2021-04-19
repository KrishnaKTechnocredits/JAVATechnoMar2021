package krati_Shukla.Methods_Calling_Static_NonStatic;

public class A {
	
	void m1(){
		System.out.println("Nonstatic : M1 called");
		B b = new B();
		b.m2();
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
}
