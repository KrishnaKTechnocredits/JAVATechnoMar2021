package anubhav;

public class A{
	
	void m1(){
		System.out.println("A- Method m1");
	}

	public static void main (String[] args) {
		A a=new A();
		a.m1();
		B b = new B();
		b.m2();
		B.m3();
		C c= new C();
		c.m4();
		c.m5();
		D.m6();
		D.m7();
	}
}
