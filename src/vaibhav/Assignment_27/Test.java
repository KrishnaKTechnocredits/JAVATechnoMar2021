package vaibhav.Assignment_27;

public class Test {

	void case_1() {
		A a1 = new A();

		System.out.println("Case 1 --> A a1 = new A()");
		System.out.println("");
		System.out.println("    a) a1.x  = " + a1.x);
		System.out.println("    b) a1.y  = " + a1.y);
		// System.out.println(" c) a1.z = " + a1.z);
		System.out.println("  * c) a1.z  = CE       --> " + "z cannot be resolved or is not a field ");
		System.out.print("    d) a1.m1 = ");
		a1.m1();
		System.out.print("    e) a1.m2 = ");
		a1.m2();
		// a1.m3();
		System.out.println("  * f) a1.m3 = CE       --> " + "The method m3() is undefined for the type A");
		System.out.println("=============================================================================");
	}

	void case_2() {
		B b1 = new B();

		System.out.println("Case 2 --> B b1 = new B()");
		System.out.println("");
		System.out.println("    a) b1.x  = " + b1.x);
		System.out.println("    b) b1.y  = " + b1.y);
		System.out.println("    c) b1.z  = " + b1.z);
		System.out.print("    d) b1.m1 = ");
		b1.m1();
		System.out.print("    e) b1.m2 = ");
		b1.m2();
		System.out.print("    d) b1.m3 = ");
		b1.m3();
		System.out.println("=============================================================================");
	}

	void case_3() {
		A a1 = new B();

		System.out.println("Case 3 --> A a1 = new B()");
		System.out.println("");
		System.out.println("    Dynamic Polymorphism");
		System.out.println("    ====================");
		System.out.println("");
		System.out.println("    a) a1.x  = " + a1.x);
		System.out.println("    b) a1.y  = " + a1.y);
		// System.out.println(" c) a1.z = " + a1.z);
		System.out.println("  * c) a1.z  = CE       --> " + "z cannot be resolved or is not a field ");

		System.out.print("    d) a1.m1 = ");
		a1.m1();
		System.out.print("    e) a1.m2 = ");
		a1.m2();
		// a1.m3();
		System.out.println("  * f) a1.m3 = CE       --> " + "The method m3() is undefined for the type A");
		System.out.println("=============================================================================");
	}

	void case_4() {
		// B b1 = new A();

		System.out.println("* Case 4 --> B b1 = new A()    --> Type mismatch: cannot convert from A to B ");
		System.out.println("");
		System.out.println("    a) b1.x  = ");
		System.out.println("    b) b1.y  = ");
		System.out.println("    c) b1.z  = ");
		System.out.println("    d) b1.m1 = ");
		// b1.m1();
		System.out.println("    e) b1.m2 = ");
		// b1.m2();
		System.out.println("    d) b1.m3 = ");
		// b1.m3();
		System.out.println("=============================================================================");
	}

	void case_5() {
		A a1 = new A();
		B b1 = new B();
		a1 = b1;

		System.out.println("Case 5 --> A a1 = new A()");
		System.out.println("           B b1 = new B()");
		System.out.println("             a1 = b1");
		System.out.println("    i.e.   A a1 = new B()  <-- Case 3");
		System.out.println("");
		System.out.println("    Case 3 --> Dynamic Polymorphism");
		System.out.println("    ===============================");
		System.out.println("");
		System.out.println("    a) a1.x  = " + a1.x);
		System.out.println("    b) a1.y  = " + a1.y);
		// System.out.println(" c) a1.z = " + a1.z);
		System.out.println("  * c) a1.z  = CE       --> " + "z cannot be resolved or is not a field ");
		System.out.print("    d) a1.m1 = ");
		a1.m1();
		System.out.print("    e) a1.m2 = ");
		a1.m2();
		// a1.m3();
		System.out.println("  * f) a1.m3 = CE       --> " + "The method m3() is undefined for the type A");
		System.out.println("=============================================================================");
	}

	void case_6() {
		A a1 = new A();
		A b1 = new B();
		b1 = a1;

		System.out.println("Case 6 --> A a1 = new A()");
		System.out.println("           A b1 = new B()");
		System.out.println("             b1 = a1");
		System.out.println("    i.e.   A b1 = new A()  <-- Case 1");
		System.out.println("");
		System.out.println("    a) b1.x  = " + b1.x);
		System.out.println("    b) b1.y  = " + b1.y);
		// System.out.println(" c) b1.z = " + b1.z);
		System.out.println("  * c) b1.z  = CE       --> " + "z cannot be resolved or is not a field ");
		System.out.print("    d) b1.m1 = ");
		b1.m1();
		System.out.print("    e) b1.m2 = ");
		b1.m2();
		// b1.m3();
		System.out.println("  * f) b1.m3 = CE       --> " + "The method m3() is undefined for the type A");
		System.out.println("=============================================================================");
	}

	void case_7() {
		// B b1 = new A();
		// B b2 = new B();
		// b1 = b2;

		// System.out.println("* Case 4 --> B b1 = new A() --> Type mismatch: cannot
		// convert from A to B ");
		// System.out.println("");

		System.out.println("* Case 7 --> B b1 = new A()    --> Type mismatch: cannot convert from A to B ");
		System.out.println("             B b2 = new B()");
		System.out.println("               b1 = b2");
		System.out.println("");

		System.out.println("    a) b1.x  = ");
		System.out.println("    b) b1.y  = ");
		System.out.println("    c) b1.z  = ");
		System.out.println("    d) b1.m1 = ");
		// b1.m1();
		System.out.println("    e) b1.m2 = ");
		// b1.m2();
		System.out.println("    d) b1.m3 = ");
		// b1.m3();
		System.out.println("=============================================================================");
	}

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Class 'A' & Class 'B' are in same package");
		System.out.println("");
		// ********************************************//
		// ******___________ Case 1 _____________******//
		// ******_________ A a1 = new A() _______******//
		// ********************************************//

		test.case_1();

		// ********************************************//
		// ******___________ Case 2 _____________******//
		// ******_________ B b1 = new B() _______******//
		// ********************************************//

		test.case_2();

		// ********************************************//
		// ******___________ Case 3 _____________******//
		// ******_________ A a1 = new B() _______******//
		// ********************************************//

		test.case_3();

		// ********************************************//
		// ******___________ Case 4 _____________******//
		// ******_________ B b1 = new A() _______******//
		// ********************************************//

		test.case_4();

		// ********************************************//
		// ******___________ Case 5 _____________******//
		// ******_________ A a1 = new A() _______******//
		// ******_________ B b1 = new B() _______******//
		// ******___________ a1 = b1 ____________******//
		// ********************************************//

		test.case_5();

		// ********************************************//
		// ******___________ Case 6 _____________******//
		// ******_________ A a1 = new A() _______******//
		// ******_________ A b1 = new B() _______******//
		// ******___________ b1 = a1 ____________******//
		// ********************************************//

		test.case_6();

		// ********************************************//
		// ******___________ Case 7 _____________******//
		// ******_________ B b1 = new A() _______******//
		// ******_________ B b2 = new B() _______******//
		// ******___________ b1 = b2 ____________******//
		// ********************************************//

		test.case_7();

	}

}
