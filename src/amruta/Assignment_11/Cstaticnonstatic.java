package amruta.Assignment_11;

public class Cstaticnonstatic {

	void methodM4() {
		System.out.println("Non Static Method M4 of Class C ");
		// Calling m5 of same class
		methodM5();

	}
	void methodM5() {
		System.out.println("Non Static Method M5 of Class C ");
		// Calling m6 of Class D
		Dstaticnonstatic.methodM6();

	}
}
