package shilpa.Assignment_11;

public class StaticNonstaticMethods_B {
	void m2() {
		System.out.println("Non static Method - B.m2");
		StaticNonstaticMethods_B.m3();
	}

	static void m3() {
		System.out.println("static Method - B.m3");
		StaticNonstaticMethods_C c = new StaticNonstaticMethods_C();
		c.m4();
	}

}
