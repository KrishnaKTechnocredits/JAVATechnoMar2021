/* Assignment 11 : 4th April 2021

Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.
*/

package parasAssignment_11;

public class C {
	
	void m4() {
		System.out.println("Non - Static Method of Class C - m4");
		m5(); /* Here Calling Non Static method of Same class Which is m5 from Non Static method of Same class so no object is required, can create with only method name() */
	}
	
	void m5() {
		System.out.println("Non - Static Method of Class C - m5");
		D.m6(); /* Here Calling Static method of Class D Which is m6 from Non Static method of class C so no object is required, can create with classname.methodname() */
	}
}
