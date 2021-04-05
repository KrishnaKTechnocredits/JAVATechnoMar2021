package priyanka_Kamble.ExampleOfStaticNonStatic;

public class StaticNonStaticC {

	void methodM4() {
		System.out.println("\t non Static Method M4 of Class C ");
		// Calling m5 of same class
		methodM5();// non static method of same class no need of object creation

	}
	void methodM5() {
		System.out.println("\t non Static Method M5 of Class C ");
		// Calling m6 of Class D
		StaticNonStaticD.methodM6();// className. MethodName - because static method he

	}
}
