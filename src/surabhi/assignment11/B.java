package surabhi.assignment11;

public class B {
	
	void m2() {
		System.out.println("I am inside B-m2 method");
		B.m3();
	}

	static void m3() {
		System.out.println("I am inside static B.m3 method");
		new C().m4();
	}

}
