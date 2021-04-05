package dhanshri.Assignment_11;

public class B {

	void m2() {
		System.out.println("Class B-- Non static method m2");
		B.m3();

	}

	static void m3() {
		System.out.println("Class B-- static method m3");
		C c = new C();
		c.m4();

	}

}
