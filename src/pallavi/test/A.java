package pallavi.test;

public class A {
	void m1() {
		System.out.println("This is m1 method in class A");
		B b = new B();
		b.m2();
	}
	
	public static void main(String args[]) {
		A a =new A();
		a.m1();
		
	}

}
