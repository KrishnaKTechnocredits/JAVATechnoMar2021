package aashay.Inheritance_Assignment_27;
/*
 * Assignment - 27 : 21st April'2021

Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent
 */

public class ClientMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Here Class A & Class B are in same Package, no need to import both the classes
		
		System.out.println("Case 1:");
		A a1 = new A();
		System.out.println("Case 1:");
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); Compilation error, cannot access variable Z is not available in Class A");
		a1.m1();
		a1.m2();
		// a1.m3();Compilation error, method m3 is not available in Class A,Parent class cannot access method from child class");

		
		System.out.println("Case 2:");
		B b2 = new B();
		System.out.println(b2.x);// 10
		System.out.println(b2.y);// 30
		System.out.println(b2.z);// 40
		b2.m1();// b2.m1 from class A method will get traversed
		b2.m2();// b2.m2.. m2() has same method signature in Class A & B, however here Child
				// class has priority
		b2.m3();// b2.m3
		System.out.println("Case 2: No compilation error");

		
		
		System.out.println("Case 3:");
		A a3 = new B(); // This is the example of Dynamic polymorphism. Here Class A is a Parent class &
						// Class B is a child class
		System.out.println(a3.x);// 10
		System.out.println(a3.y);// 12
		// System.out.println(a1.z); Z is the variable and its a property(Variable) of
		// Class B and properties are binded to the reference of the class. Also
		// properties are not changes during compile time to run time . So Class A
		// cannot access variable Z.
		a3.m1();
		a3.m2(); // Here Class A & Class has same method m2() [same method signature, i.e. return
					// type, no parameter & body].
					// In Dynamic polymorphism behavior(method) changes at compile time to run time.
					// So here method from class B will get executed.
		// a1.m3(); m3() method is not present in Class A, so A cannot take guarantee of
		// method m3(). Hence compile error.

		
		System.out.println("Case 4:");
		// B b = new A(); Here CE will be reflected. We cannot assign the Parent class
		// object in to the reference of child class B. Hence CE. It will require Type
		// casting.
		// Below code will not be execute due to above CE
		/*
		 * System.out.println(b.x); System.out.println(b.y); System.out.println(b.z);
		 * b.m1(); b.m2(); b.m3();
		 */

		System.out.println("Case 5:");
		A a5 = new A();
		B b5 = new B();
		a5 = b5; // Here reference variable 'a' will point to the object assigned to reference
					// variable 'b'
		// so this case is similar to case 3, Dynamic Polymorphism. Class A can access
		// its own properties(variables), its own unique methods and the methods from
		// Class B who has same signature of the methods present in Class A
		System.out.println(a5.x);// 10
		System.out.println(a5.y);// 12
		// System.out.println(a1.z); Z is the variable and its a property(Variable) of
		// Class B and properties are binded to the reference of the class. Also
		// properties are not changes during compile time to run time . So Class A
		// cannot access variable Z.
		a5.m1();
		a5.m2();
		// a5.m3();m3() method is not present in Class A, so A cannot take guarantee of
		// method m3(). Hence compile error.

		System.out.println("Case 6:");
		A a6 = new A();
		A b6 = new B();
		b6 = a6; // here on right side of '=' is a6 i.e. "new A()" and left hand side of '=' is
					// b6 i.e. "A b6". So it means A b6 = new A();. This is similar to Case 1.
					// Reference variable 'b6' can access its own properties and methods only
		
		System.out.println("Case 7:");
	//	B b7 = new A(); // CE . Cannot assign parent class object in to child class reference object
		//Below code will not get compiled
	/*	B b = new B();
		b7 = b;
	 */
	}

}
