package krati_Jain.Assignment11;

public class Assign11ClassB {

	void m2() {
		System.out.println("In Class B m2 method, called from Class A m1 method");
		Assign11ClassB.m3();
	}
	
	static void m3() {
		System.out.println("In Class B m3 method, called from Class B ns m2 method");
		Assign11ClassC assign11Classc = new Assign11ClassC();
		assign11Classc.m4();
	}
	
	public static void main(String[] args) {
	}
	
}
