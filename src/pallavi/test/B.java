package pallavi.test;

public class B {
	
	public void m2() {
		System.out.println("This is m2 method of class B");
		B.m3();
		
	}
	
	static void m3() {
		System.out.println("This is m3 method of class B");
		C c = new C();
		c.m4();
	}

	
	

}
