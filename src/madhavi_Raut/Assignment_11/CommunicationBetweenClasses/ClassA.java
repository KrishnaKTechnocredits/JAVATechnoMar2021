package madhavi_Raut.Assignment_11.CommunicationBetweenClasses;
/*Assignment 11

Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on.

You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence.*/

public class ClassA {

	void m1() {
		ClassB classB = new ClassB();
		classB.m2();
		System.out.println("From ClassA's non-static m1() calling ClassB's non-static m2()");
	}

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.m1();
		System.out.println("From ClassA's main() calling non-static m1()");
	}

}
