package krati_Shukla.Methods_Calling_Static_NonStatic;

public class D {
	
	static void m6(){
		System.out.println("Non Static M5 is calling Static M6");
		D.m7();
	}
	
	static void m7(){
		System.out.println("This is END");
	}

}
