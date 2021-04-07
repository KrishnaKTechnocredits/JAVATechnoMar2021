package krati_Jain.Assignment11;

public class Assign11ClassC {

	void m4() {
		System.out.println("In Class C m4 method, called from Class C static m3 method");
		Assign11ClassC assign11Classc = new Assign11ClassC();
		assign11Classc.m5();
	}
	
	void m5() {
		System.out.println("In Class C m5 method, called from Class C non-static m4 method");
		Assign11ClassD.m6();
	}	
	
	public static void main(String[] args) {
	}
}
