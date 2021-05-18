package technocredits.accessModifierDemo;

public class A {

	private int x = 10;
	int y = 20;
	
	private void m1() {
		System.out.println("This is m1");
		int sum = 0;
	}
	
	void m2() {
		System.out.println("This is m2");
	}
	
	void m3() {
		A a = new A();
		a.m1();
	}
}
