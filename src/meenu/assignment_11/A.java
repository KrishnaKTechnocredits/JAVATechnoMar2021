package meenu.assignment_11;

/*
Write a code based on the given figure, [create 4 classes and different methods as per given figure]. 
from the main method, you will call the m1 method of calls A as mentioned in the figure. 
From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can 
help you to understand which methods are being called in sequence. with acPR number please attach 
screenshot of output.
*/

public class A {
	
	void m1() {
		System.out.println("Inside method m1 of class A, calling method m2 of class B");
		B b = new B();
		b.m2();
	}

	public static void main(String[] args) {
		System.out.println("Calling method m1");
		A a = new A();
		a.m1();
	}

}
