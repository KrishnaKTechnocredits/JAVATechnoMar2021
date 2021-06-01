/* Assignment 11 : 4th April 2021

Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.
*/

package parasAssignment_11;

public class D {
	
	static void m6() {
		System.out.println("Static Method of Class D - m6");
		D.m7();/* Here Calling Static method of same class Which is m7 from Static method of same class so on object is required, can create with classname.methodname() */
	}
	
	static void m7(){
		System.out.println("Static Method of Class D - m7");
	}

}
