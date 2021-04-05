package sangeeta.StaticNonStaticMethod;

public class C {
	
	void m4() {
		m5();
		System.out.println("This is a m4 method in Class C");
	}
	
	void m5() {
		D.m6();
		System.out.println("This is a m5 method in Class C");
	}


}
