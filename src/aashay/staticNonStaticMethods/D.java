package aashay.staticNonStaticMethods;
/*class is part of Assignment 11 4th April 2021
 * 
 */
public class D {
	
	static void m6() {
		//System.out.println("You are in m6 satic method of class D");
		D.m7();
	}
	static void m7() {
		System.out.println("You are in m7 satic method of class D");
	}
	

}
