package neha_Rathi.assignment11;

public class B {

	void m2() {
		System.out.println("This is class B m2 method");
		m3();
	}

	static void m3() {
		System.out.println("This is class B m3 method");
		C c1 = new C();
		c1.m4();
	}
}
