/* Assignment 11 : 4th April 2021

Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.
*/

package parasAssignment_11;

public class B {
	
	void m2() {
		System.out.println("Non - Static Method of Class B - m2");
		B.m3(); /* Here Calling Static method of same class Which is m3 from Non Static method of same class so no object is required, can create with classname.methodname() */
	}
	
	static void m3() {
		System.out.println("Static Method of Class B - m3");
		C c1 = new C(); /* Here Calling Non Static method of Class C Which is m4 from Static method of class B so required to create object of class in which method is exist that is class C */
		c1.m4();
	}
}
