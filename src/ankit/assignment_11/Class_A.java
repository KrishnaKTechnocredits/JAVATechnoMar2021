/*
 Assignment 11 : 4th April 2021
Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 
You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.
 */
package ankit.assignment_11;

public class Class_A {

	void methodM1() {
		System.out.println("You Printed this statement from Class A method M1(Non-Static)");
		/*
		Now here we are going to call methodM2 from class_B which is a non static here caller method is also non static so object is required 
		*/
		Class_B cB = new Class_B();
		cB.methodM2();
	}
	public static void main(String[] args) {
		
		Class_A class_A = new Class_A(); // We need to create object because the caller method is static and called method is non static
		class_A.methodM1(); 

	}
}
