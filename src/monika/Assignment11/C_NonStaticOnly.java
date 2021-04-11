package monika.Assignment11;

public class C_NonStaticOnly {
	void m4() {
		System.out.println("Calling m4 method of class C_NonStaticOnly");
		m5();
	}
	void m5() {
		System.out.println("Calling m5 method of class C_NonStaticOnly");
		D_StaticOnly.m6();
	}
}
