package ashtha.Assignment11;

public class C {
	void m4() {
		System.out.println("Inside the fourth method");
		m5();
	}
	
	void m5() {
		System.out.println("Inside the fifth method");
		D.m6();
	}
}
