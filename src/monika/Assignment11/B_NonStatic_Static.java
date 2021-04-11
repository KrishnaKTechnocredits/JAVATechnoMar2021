package monika.Assignment11;

public class B_NonStatic_Static {
	void m2() {
		System.out.println("Calling m2 method of class B_NonStatic_Static");
		m3();
	}
	static void m3() {
		System.out.println("Calling m3 method of class B_NonStatic_Static");
		C_NonStaticOnly c = new C_NonStaticOnly();
		c.m4();
	}
}
