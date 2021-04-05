package shivani.Assignment_11;

public class C {
	void m4() {
		m5();
		System.out.println("inside Class C calling m5 from m4 (non static to non static");
	}
	void m5() {
		D.m6();
		System.out.println("inside class C calling m6 from m5 (static to  non static");
		
		
	}

}
