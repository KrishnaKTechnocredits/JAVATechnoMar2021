package upasana.assignment_11;

public class C {
	void m4() {
		System.out.println("Inside Class C -> m4() method");
		m5();
	}

	void m5() {
		System.out.println("Inside Class C -> m5() method");
		D.m6();
	}
}
