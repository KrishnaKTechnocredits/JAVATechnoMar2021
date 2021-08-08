package gauravk.Assignment_11_commBtwnClasses;
/*
 * Assignment 11 : 4th April 2021
Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on.
You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.
Please complete this assignment by Today EOD.
 */
public class A {
	
	void m1(){
		System.out.println("static to non-static = main of class A --> m1 method of same class A");
		System.out.println("new (A).m1()");
		new B().m2();
	}
	
	public static void main(String[] a) {
		new A().m1();
	}
	
	static void m6() {
		System.out.println("static to static of different class = m5 of class D --> m6 method of class A");
		System.out.println("A.m6()");
	}

}
