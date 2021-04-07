package madhavi_Raut.Assignment_11.CommunicationBetweenClasses;

public class ClassD {

	static void m6() {
		ClassD.m7();
		System.out.println("From ClassD's static m6() calling ClassD's static m7().");
	}

	static void m7() {

		System.out.println("ClassD's static m7().");
	}
}
