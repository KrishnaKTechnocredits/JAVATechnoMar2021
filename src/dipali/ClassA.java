package dipali;

import MultipleClasses.ClassB;

public class ClassA {
	
	public void m1() {
		System.out.println("I am in m1 of class A");
		ClassB b= new ClassB();
		b.m2();
	}

	public static void main(String[] args) {
		ClassA a=new ClassA();
		a.m1();

	}

}
