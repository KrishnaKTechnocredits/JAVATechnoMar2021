package Dipali_Assignment11;

public class ClassC {
	
	public void m4() {
		System.out.println("We are in ClassC non-static m4 method ");
		m5();
	}
	
	public void m5() {
		System.out.println("We are in ClassC non-static m5 method ");
		ClassD.m6();
	}
}
