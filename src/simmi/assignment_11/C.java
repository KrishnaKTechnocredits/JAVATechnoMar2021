package simmi.assignment_11;

public class C {
	
	void m4() {
		System.out.println("C class m4 method");
		C c = new C();
		c.m5();
	}
	
	 void m5() {
		System.out.println("C class m5 method");
		D.m6();
	}

}
