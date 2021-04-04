package aashay.staticNonStaticMethods;
/*class is part of Assignment 11 4th April 2021
 * 
 */
public class C {
	
	void m4() {
		C c= new C();
		c.m5();
	//	System.out.println("You are in m4 non-satic method of class C");
	}
	void m5() {
		D.m6();
	//	System.out.println("You are in m5 non-static method of class C");
	}
}
