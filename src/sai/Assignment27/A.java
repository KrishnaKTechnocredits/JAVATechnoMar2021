package sai.Assignment27;

/*
 * /*Assignment - 27 : 21st April'2021
Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there.
 */

public class A {

	int x = 10;
	int y = 12;

	void m1() {
		System.out.println("A m1");
	}
	void m2() {
		System.out.println("A m2");
	}
	public static void main(String[] args) {

		//Case1 Example//
		System.out.println("Case1");
		A a1=new A();
		a1.m1(); 
		a1.m2();
		//a1.m3(); //compilation error
		System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.z);//compilation error


		//Case3 Example//
		System.out.println("Case3");
		A a2=new B();
		a2.m1(); //A m1
		a2.m2(); //B_m2
		//a2.m3(); //Compilation error
		System.out.println(a2.x);
		System.out.println(a2.y);
		//System.out.println(a2.z); //Compilation error


		//Case5 Example//
		System.out.println("Case5");
		A a3= new A();
		B b3= new B();
		a3=b3;
		a3.m1(); 
		

		a3.m2(); 
		//a3.m3(); //Compilation error
		System.out.println(a3.x); //10
		System.out.println(a3.y); //12 : //only behaviour changes but not Property
		//System.out.println(a3.z); //Compilation error


		//Case6 Example//
		//Case :- 6
				System.out.println("Case6");
				A a4 = new A();
				A b4 = new B();
				b4 = a4; // ClassA b4 = new ClassA(); // is equivalent to Case 1
				System.out.println(b4.x);
				System.out.println(b4.y);
	}
}
