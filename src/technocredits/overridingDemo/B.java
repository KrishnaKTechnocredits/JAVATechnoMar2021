package technocredits.overridingDemo;

public class B extends A{

	static void m1() {
		System.out.println("B m1");
	}
	
	public static void main(String[] args) {
		A a1 = new B();
		a1.m1();
	}
}
