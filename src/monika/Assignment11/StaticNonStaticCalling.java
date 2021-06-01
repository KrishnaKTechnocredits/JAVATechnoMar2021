package monika.Assignment11;
/*Assignment 11 : 4th April 2021

Write a code based on the given figure, 
[create 4 classes and different methods as per given figure]. 
from the main method, you will call the m1 method of calls A as mentioned in the figure. 
From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or 
anything which can help you to understand which methods are being called in sequence.
with acPR number please attach screenshot of output.

Please complete this assignment by Today EOD.*/
public class StaticNonStaticCalling {
	void m1() {
		System.out.println("Calling m1 method of class StaticNonStaticCalling ");
		B_NonStatic_Static b = new B_NonStatic_Static();
		b.m2();
	}
	public static void main(String[] args) {
		System.out.println("Calling main method of class StaticNonStaticCalling ");
		StaticNonStaticCalling s = new StaticNonStaticCalling();
		s.m1();
	}
}
