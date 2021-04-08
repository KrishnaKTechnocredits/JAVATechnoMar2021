package renuka.assignment11;

public class A {
	
	void m1() {
		B b1 = new B();
		b1.m2();
		System.out.println("Inside M1 non static method,we are calling M2 non static method of same ClassB");
	}
	  
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
	}

}
