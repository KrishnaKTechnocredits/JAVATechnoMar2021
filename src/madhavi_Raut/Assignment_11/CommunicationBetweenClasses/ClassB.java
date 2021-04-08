package madhavi_Raut.Assignment_11.CommunicationBetweenClasses;

public class ClassB {

	void m2() {
		ClassB.m3();
		System.out.println("From ClassB's non-static m2() calling ClassB's static m3().");
	}

	static void m3() {
		ClassC classC = new ClassC();
		classC.m4();
		System.out.println("From ClassB's static m3() calling ClassC's non-static m4().");
	}

}
