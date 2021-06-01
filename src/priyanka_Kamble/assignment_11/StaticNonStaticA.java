package priyanka_Kamble.assignment_11;

/*
 * Assignment 11 : 4th April 2021

Write a code based on the given figure, [create 4 classes and different methods as per given figure]. 
from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence.
 with acPR number please attach screenshot of output.

 */
public class StaticNonStaticA {
	void methodM1() {
		System.out.println("\t Method M1 of Class A ");

		// Calling m2 method of Class B
		StaticNonStaticB b1 = new StaticNonStaticB(); // need to creat obj as we are calling non-Static method to
														// non-static method
		b1.methodM2();
	}

	public static void main(String[] args) {
		StaticNonStaticA a = new StaticNonStaticA();
		a.methodM1();
	}

}
