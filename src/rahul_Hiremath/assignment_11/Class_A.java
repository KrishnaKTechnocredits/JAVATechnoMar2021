package rahul_Hiremath.assignment_11;

public class Class_A {

	void m1() {
		System.out.println("In Class A - m1");
		Class_B class_B = new Class_B();
		class_B.m2();
	}

	public static void main(String[] args) {

		Class_A class_A = new Class_A();
		class_A.m1();
	}
}
