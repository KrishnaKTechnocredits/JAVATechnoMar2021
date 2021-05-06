package rikin.assignment11;

public class C {

	void m4() {
		System.out.println("m4 is Non-static method, in class C.");
		m5();
	}

	void m5() {
		System.out.println("m5 is Non-static method, in class C.");
		D.m6();
	}

}
