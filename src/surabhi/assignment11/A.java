package surabhi.assignment11;

public class A {
	void m1() {
		System.out.println("I am inside A-m1 method");
		new B().m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.m1();
	}

}
