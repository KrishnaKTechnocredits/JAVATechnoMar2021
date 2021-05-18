package rikin.assignment11;

public class B {

	void m2() {
		System.out.println("m2 is Non-Static method, in class B.");
		B.m3();
	}

	static void m3() {
		System.out.println("m3 is static method, in class B.");
		C c1 = new C();
		c1.m4();

	}

}
