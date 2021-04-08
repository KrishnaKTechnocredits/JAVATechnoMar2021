package rahul_Hiremath.assignment_11;

public class Class_C {

	void m4() {
		System.out.println("In class C - m4");
		m5();
	}

	void m5() {
		System.out.println("In class C - m5");
		Class_D.m6();
	}
}
