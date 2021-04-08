package krati_Jain.Assignment11;

public class Assign11ClassD {

	static void m6() {
		System.out.println("In Class D m6 method, called from Class C ns m5 method");
		Assign11ClassD.m7();
	}
	
	static void m7() {
		System.out.println("In Class D m7 method, called from Class D static m6 method");
	}
	
	
}
