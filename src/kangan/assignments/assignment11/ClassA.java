package kangan.assignments.assignment11;

public class ClassA {

	void m1() {
		ClassB classB = new ClassB();
		classB.m2();
		System.out.println("m2 is called in m1");
	}
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.m1();
		
	}
}
