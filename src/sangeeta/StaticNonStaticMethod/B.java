package sangeeta.StaticNonStaticMethod;

public class B {
	
	void m2() {
		m3();
		System.out.println("This is a m2 method in Class B");
	}
	
	static void m3() {
		C c = new C();
		c.m4();
		System.out.println("This is a m3 method in Class B");
	}

}
