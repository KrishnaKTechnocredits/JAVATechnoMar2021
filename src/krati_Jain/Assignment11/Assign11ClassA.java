/**Write a code based on the given figure,* [create 4 classes and different methods as per given figure].
 * from the main method, you will call the m1 method of calls A as mentioned in the figure.
 * From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can help you
to understand which methods are being called in sequence. with acPR number please attach screenshot of output.*/


package krati_Jain.Assignment11;

public class Assign11ClassA {

	void m1() {
		Assign11ClassB assign11ClassB = new Assign11ClassB();
		assign11ClassB.m2();
	}
	
	public static void main(String[] args) {
		Assign11ClassA assign11ClassA = new Assign11ClassA();
		assign11ClassA.m1();
		System.out.println("Called all the required methods and back in Class A main method");
	}
}
