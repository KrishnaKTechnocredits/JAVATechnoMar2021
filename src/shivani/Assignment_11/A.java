package shivani.Assignment_11;

/*Write a code based on the given figure,
[create 4 classes and different methods as per given figure]. 
from the main method, you will call the m1 method of calls A as mentioned in the figure.
From m1 method call m2 method of class B and so on. 
You should write one print statement in every method like Inside First method or 
anything which can help you to understand which methods are being called in sequence. 
with acPR number please attach screenshot of output*/

public class A {

	void m1() {
		System.out.println("inside class A m1");

		B b = new B();
		b.m2();

		System.out.println("inside class A calling class B  m2 from m1 (non static to non static diff class ");
	}

	public static void main(String[] args) {

		A a = new A();
		a.m1();

	}

}
