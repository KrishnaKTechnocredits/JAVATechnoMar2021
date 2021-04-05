package vaibhav.Assignment_11;

public class ClassC {

	void m4() {
		System.out.println("Successfully reached to method m4 of ClassC");
		m5();
	}

	void m5() {
		System.out.println("Successfully reached to method m5 of ClassC");
		ClassD.m6();
	}
}
