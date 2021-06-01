package radha.Assignment11;

public class Three {

	void m4() {
		System.out.println("This is method m4 of class Three.");
		m5();
	}
	
	void m5() {
		System.out.println("This is method m5 of class Three.");
		Four.m6();
	}
}
