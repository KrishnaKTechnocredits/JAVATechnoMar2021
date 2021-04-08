package pallavi.test;

public class C {
	
	void m4() {
		System.out.println("This is m4 method of class C");
		C c =new C();
		c.m5();
	}
	
	 void m5() {
		System.out.println("This is m5 method of class C");
		D.m6();
	}

}
