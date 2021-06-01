package priyanka_Kamble.assignment_11;

public class StaticNonStaticD {
	static void methodM6() {
		System.out.println(" \t  Static Method M6 of Class D ");
		// Calling m7 of same Class
		StaticNonStaticD.methodM7();// Best practice is to call the Static method by Class name.
		// methodM7();// aaise chalega

	}

	static void methodM7() {
		System.out.println(" \t Static Method M7 of Class D ");

	}

}
