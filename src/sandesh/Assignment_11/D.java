package sandesh.Assignment_11;

public class D {

	static void m6() {
		D.m7();
		System.out.println("Calling class D's static method m7() from class D's static method m6().");
	}

	static void m7() {
		System.out.println("Inside class D's static method m7().");
	}
}
