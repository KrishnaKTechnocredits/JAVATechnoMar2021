package komal.assignmentNo_11;

public class C {
	void m4() {
		System.out.println("Inside method m4 of class C, calling method m5 of same class");
		m5();
	}

	void m5() {
		System.out.println("Inside method m5 of class C, calling static method m6 of class D");
		D.m6();
	}
}
