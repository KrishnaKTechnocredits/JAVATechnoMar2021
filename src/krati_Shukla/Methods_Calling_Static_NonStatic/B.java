package krati_Shukla.Methods_Calling_Static_NonStatic;

public class B {
	
	void m2(){
		System.out.println("M1 is calling Non Static M2");
		B.m3();
	}
	
	static void m3(){
		System.out.println("M2 is calling Static M3");
		C c = new C();
		c.m4();
	}

}
