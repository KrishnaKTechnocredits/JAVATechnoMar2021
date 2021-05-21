package sandesh.Assignment_11;

public class C {

	void m4() {
		C c1 = new C();
		c1.m5();
		System.out.println("Calling class C's non-static method m5() from class C's non-static method m4().");
	}

	void m5() {
		D.m6();
		System.out.println("Calling class D's static method m6() from class C's non-static method m5().");
	}
}