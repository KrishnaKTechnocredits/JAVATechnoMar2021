package vaibhav.Assignment_11;

public class ClassB {

	void m2() {
		System.out.println("Successfully reached to method m2 of ClassB");
		ClassB.m3();
	}

	static void m3() {
		System.out.println("Successfully reached to method m3 of ClassB");
		ClassC classC = new ClassC();
		classC.m4();
	}
}
