package priyanka_Kamble.ExampleOfStaticNonStatic;

public class StaticNonStaticA {
	void methodM1() {
		System.out.println("\t Method M1 of Class A ");

		// Calling m2 method of Class B
		StaticNonStaticB b1 = new StaticNonStaticB(); // need to creat obj as we are calling non-Static method to
														// non-static method
		b1.methodM2();
	}

	public static void main(String[] args) {
		StaticNonStaticA a = new StaticNonStaticA();
		a.methodM1();
	}

}
