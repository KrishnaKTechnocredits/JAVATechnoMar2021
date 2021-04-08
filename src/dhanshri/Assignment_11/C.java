package dhanshri.Assignment_11;

public class C {

	void m4() {
		System.out.println("Class C-- Non static method m4");
		m5();

	}

	void m5() {
		System.out.println("Class C-- Non static method m5");
		D.m6();
	}

}
