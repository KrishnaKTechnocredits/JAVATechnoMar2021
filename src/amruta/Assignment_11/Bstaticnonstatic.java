package amruta.Assignment_11;


public class Bstaticnonstatic {

	void methodM2() {
		System.out.println("Method M2 of Class B ");
		// Calling m3 of Same Class
		methodM3(); 
	}

	static void methodM3() {
		System.out.println("Method M3 of Class B ");
		// Calling m4 method from class D
		Cstaticnonstatic c = new Cstaticnonstatic(); 
		c.methodM4();

	}

	public static void main(String[] args) {
		Bstaticnonstatic b = new Bstaticnonstatic();
		b.methodM2();
		methodM3(); 
		Bstaticnonstatic.methodM3();
	}
}

