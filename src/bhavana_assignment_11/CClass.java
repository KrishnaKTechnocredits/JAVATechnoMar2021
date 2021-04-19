package bhavana_assignment_11;

public class CClass {

	void m4() {
		System.out.println("Class C m4 method");
		m5();
	}
	
	void m5() {
		System.out.println("Class C m5 method");
		DClass.m6();
	}
}
