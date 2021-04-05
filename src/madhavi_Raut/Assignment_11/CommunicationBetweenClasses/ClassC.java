package madhavi_Raut.Assignment_11.CommunicationBetweenClasses;

public class ClassC {

	void m4() {
		ClassC classC = new ClassC();
		classC.m5();
		System.out.println("From ClassC's non-static m4() calling ClassC's non-static m5()");
	}

	void m5() {
		ClassD.m6();
		System.out.println("From ClassC's non-Static m5() calling ClassD's static m6()");
	}
}
