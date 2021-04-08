package amruta.communicationBtwnClasses;

public class A {
	B b;
	String name;
	void m1() {
		name = "Amruta";
	    b = new B();
		System.out.println("I am in A m1");
		b.m2();
	}
	
	void m3() {
		System.out.println("A m3");
		System.out.println(name);
		if(b==null) {
			b = new B();
		}
		b.m2();
	}
	public static void main(String[] args) {
		A a = new A();//1
		a.m1();//2
		a.m3();
	}
}
