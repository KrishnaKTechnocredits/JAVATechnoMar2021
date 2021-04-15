package kangan.assignments.assignment_11;

public class ClassB {

	void m2() {
		ClassB.m3();
		System.out.println("m3 is called in m2");
	}
	static void m3() {
		ClassC classC = new ClassC();
		classC.m4();
		System.out.println("m4 is called in m3");
	}
}
