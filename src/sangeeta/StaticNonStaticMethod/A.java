package sangeeta.StaticNonStaticMethod;

public class A {
	
	void m1() {
		B b = new B();
		b.m2();
		System.out.println("This is a m1 method of Class A");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
}
