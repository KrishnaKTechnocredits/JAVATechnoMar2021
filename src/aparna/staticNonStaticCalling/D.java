package aparna.staticNonStaticCalling;

public class D {
	static void m6() {
		System.out.println("I am in m6 method of Class D");
		m7();// m6() and m7() both are static and Static to Static direct calling is possible
	}

	static void m7() {
		System.out.println("I am in m7 method of Class D");
	}
}
