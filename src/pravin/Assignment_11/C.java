package pravin.Assignment_11;

public class C {
	void m4() {
		System.out.println("This is nonstatic method m4 in C class");
		C c = new C();
		c.m5();
	}
	void m5() {
		System.out.println("This is nonstatic method m5 in C class");
		D.m6();
	}
}
