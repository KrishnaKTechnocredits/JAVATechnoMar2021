/* Assignment 11 : 4th April 2021

Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.
*/

package parasAssignment_11;

public class A {

	void m1() {
		System.out.println("Non - Static Method of Class A - m1");
		B b1 = new B(); /* Here Calling Non Static method of Class B Which is m2 from Non Static method of class A so required to create object of class B */
		b1.m2();
	}
	
	public static void main(String[] args) {
		
		A a1 = new A(); /* Here Calling Non Static method Which is m1 from Static method of same class so required to create object of same class */
		a1.m1();
	}
}
