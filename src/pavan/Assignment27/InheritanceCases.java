package pavan.Assignment27;

/*
Assignment - 27 : 21st April'2021

Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent
 */
public class InheritanceCases {
	public static void main(String[] args) {
		// Case1:
		System.out.println("CASE 1 : ");

		A a1 = new A();

		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); //CE bcz z variable is not present in class A
		// System.out.println(a1.m1()); //cant write method in SOP as it doesn't have
		// any return type.So,there is nothing to print.
		a1.m1();
		a1.m2();
		// a1.m3(); // CE bcz z m3() method is not present in class A

		// CASE 2:
		System.out.println("");
		System.out.println("CASE 2 : ");

		B b1 = new B();

		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		b1.m1();
		b1.m2();
		b1.m3();
		System.out.println("");

		// CASE 3:
		System.out.println("");
		System.out.println("CASE 3 : ");

		A a2 = new B(); // it means class B object is created and stored in reference type of class A

		// and it is possible as we are referring child class to parent class and at the
		// time of compilation
		// only those methods and variables which are present in parent class are
		// compiled but at the time of
		// running it methods present in child class are accessed and printed and this
		// change is seen with methods
		// not variables.
		// NOTE: methods present in parent and child class should have same signature
		// means with same parameters
		// and same return type and if methods are same with same parameters but
		// different return type then it will
		// be ambiguity case and compilation error.

		System.out.println(a2.x);
		System.out.println(a2.y);
		// System.out.println(a2.z);
		a2.m1();
		a2.m2();
		// a2.m3();
		System.out.println("");

		// CASE 4:
		System.out.println("");
		System.out.println("CASE 4 : Compilation Error");

		// B b3 = new A(); // CE bcz we cant assign the parent class object to child
		// class reference type.

		// CASE 5:
		System.out.println("");
		System.out.println("CASE 5 : ");

		A a4 = new A();
		B b4 = new B();

		a4 = b4; // it means A a4 = new B(); class B's object is kept in class A's reference
					// type.

		System.out.println(a4.x);
		System.out.println(a4.y);
		// System.out.println(a4.z); //CE bcz z variable is not present in class A
		a4.m1();
		a4.m2();
		// a4.m3(); //CE bcz z m3() method is not present in class A
		System.out.println("");

		// CASE 6:
		System.out.println("");
		System.out.println("CASE 6 : ");

		A a5 = new A();
		A b5 = new B();

		b5 = a5; // it means A b5=new A();

		System.out.println(b5.x);
		System.out.println(b5.y);
		// System.out.println(b5.z); //CE bcz z variable is not present in class A
		b5.m1();
		b5.m2();
		// b5.m3(); //CE bcz z m3() method is not present in class A
		System.out.println("");

		// CASE 7:
		System.out.println("");
		System.out.println("CASE 7 : Compilation Error ");

		// B b6 = new A(); //CE as parent class can't be assigned to child class
		B b7 = new B();
		// b6=b7; // it means B b6= new B();

	}
}
