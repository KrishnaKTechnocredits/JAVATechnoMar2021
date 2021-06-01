//Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 
//You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.

package prashant.Assignment_11;

public class Class_B {

	void m2() {
		System.out.println("This is m2 Non Static Method ,Call Static method to non Static in same Class B ");
		m3();
	}

	static void m3() {
		System.out.println("This is m3 Static Method ,Call Non Static Method of Class C to Static Method of Class B");
		Class_C classc = new Class_C();
		classc.m4();
		
	}
}
