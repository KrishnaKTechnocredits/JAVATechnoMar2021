package rahul_Hiremath.assignment_11;

public class Class_B {

	void m2() {
		System.out.println("In class B - m2");
		m3();
	}

	static void m3() {
		System.out.println("In class B - m3");
		Class_C class_C = new Class_C();
		class_C.m4();
	}
}
