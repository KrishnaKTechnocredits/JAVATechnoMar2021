package priyanka_Kamble.assignment_11;

public class StaticNonStaticB {

	void methodM2() {
		System.out.println("\t Method M2 of Class B ");
		// Calling m3 of Same Class
		methodM3(); // Static method from same class from non static method Direct chal jayega
	}

	static void methodM3() {
		System.out.println("\t Method M3 of Class B ");
		// Calling m4 method from class D
		StaticNonStaticC c = new StaticNonStaticC(); // Need to creat object as calling non static method from Static
														// method
		c.methodM4();

	}

	public static void main(String[] args) {
		StaticNonStaticB b = new StaticNonStaticB();
		b.methodM2();
		methodM3(); // Static to static - obj not required
		StaticNonStaticB.methodM3();// Best practice is to call a Static method by Class name
	}
}
