package kangan.assignments.assignment11;

public class ClassC {

	void m4() {
		m5();
		System.out.println("m5 is called in m4");
	}
	void m5() {
		ClassD classD = new ClassD();
		classD.m6();
		System.out.println("m6 is called in m5");
	}
}
