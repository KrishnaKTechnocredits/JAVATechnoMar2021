package sandesh.Assignment_11;

public class B {

	void m2() {
		B.m3();
		System.out.println("Calling class B's static method m3() from class B's non-static m2().");
	}

	static void m3() {
		C c1 = new C();
		c1.m4();
		System.out.println("Calling class C's non-static method m4() from class B's static method m3().");
	}

}
