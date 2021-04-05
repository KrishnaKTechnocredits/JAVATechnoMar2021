package aashay.staticNonStaticMethods;
/* class is part of Assignment 11 4th April 2021
 */


public class B {
	
	void m2() {
		//System.out.println("You are in m2 non-static method of class B");
		m3();
	}
	static void m3() {
		C c = new C();
			c.m4();
	//	System.out.println("You are in m3 static method of class B");
	}
	
}
