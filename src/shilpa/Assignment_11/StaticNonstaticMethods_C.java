package shilpa.Assignment_11;

public class StaticNonstaticMethods_C {
	void m4() {
		System.out.println("Non static Method - c.m4");
		m5();
	}

	void m5() {
		System.out.println("Non static Method - c.m5");
		StaticNonstaticMethods_D.m6();
	}

}
