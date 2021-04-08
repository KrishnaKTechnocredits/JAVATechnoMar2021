package priyanka_Panat.assignment11;

public class B {
	void m2() {
		System.out.println("In Non-Static Method m2 from Class B");
		m3();
	}
	
	static void m3() {
		System.out.println("In Static Method m3 from Class B");
		C c1=new C();
		c1.m4();
	}
}
