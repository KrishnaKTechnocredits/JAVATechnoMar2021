/*Assignment 11 : 4th April 2021

Write a code based on the given figure, 
[create 4 classes and different methods as per given figure]. 
from the main method, you will call the m1 method of calls A as 
mentioned in the figure. From m1 method call m2 method of class B and so on.*/


package sandesh.Assignment_11;

public class A {

	void m1() {
		B b1 = new B();
		b1.m2();
		System.out.println("Calling class B's non-static method m2() from class A's non-static method m1()");
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
		System.out.println("Calling class A's non-static method m1() from class A's main() method.");
	}

}
