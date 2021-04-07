package surabhi.assignment11;

public class C {
	void m4() {
		System.out.println("I am inside C-m4 method");
		new C().m5();
	}
	
	void m5() {
		System.out.println("I am inside C-m5 method");
		D.m6();
	}
}
