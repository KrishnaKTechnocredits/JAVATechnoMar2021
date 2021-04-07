package Dipali_Assignment11;

public class ClassB {
	
	public void m2() {
		System.out.println("We are in ClassB non-static m2 method ");
		ClassB.m3();
	}
	
	static void m3() {
		System.out.println("We are in ClassB static m3 method ");
		ClassC c=new ClassC();
		c.m4();
	}	
}
