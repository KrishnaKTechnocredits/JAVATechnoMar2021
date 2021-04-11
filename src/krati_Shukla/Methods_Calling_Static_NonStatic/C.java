package krati_Shukla.Methods_Calling_Static_NonStatic;

public class C {
	
	void m4(){
		System.out.println("Static M3 is calling Non Static M4");
		m5();
	}
	
	void m5(){
		System.out.println("Non Static M4 fis calling Non Static M5 from same class");
		D.m6();
	}

}
