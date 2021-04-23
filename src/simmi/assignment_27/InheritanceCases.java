package simmi.assignment_27;

public class InheritanceCases {
	public static void main(String[] args) {
		// CASE:1
		A a1 = new A();
		System.out.println("CASE:1 Example");
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z);// Compilation Error, as variable z is not present
		// in A class
		a1.m1();
		a1.m2();
		// a1.m3();// Compilation Error, as method m3 is not present in A class

		// CASE:2
		B b1 = new B();
		System.out.println("");
		System.out.println("CASE:2 Example");
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		b1.m1();
		b1.m2();
		b1.m3();

		// CASE:3--> Dynamic Polymorphism
		A a2 = new B();
		System.out.println("");
		System.out.println("CASE:3 Example");
		System.out.println(a2.x);
		System.out.println(a2.y);
		// System.out.println(a2.z);// Compilation Error, as a2 will call whatever is
		// there in A class
		a2.m1();
		a2.m2();
		// a2.m3();// Compilation Error, as Compiler will always see in the left side(A
		// class)

		// CASE:4
		// B b2 = new A();// Compilation Error, as Parent class is being assigned in
		// Referenced class object, without typecasting

		// CASE:5 ---> Same as CASE:3
		A a3 = new A();
		System.out.println("");
		System.out.println("CASE:5 Example");
		B b3 = new B();
		a3 = b3;
		System.out.println(a3.x);
		System.out.println(a3.y);
		// System.out.println(a3.z);// Compilation Error, as variable z is not present
		// in class A
		a3.m1();
		a3.m2();
		// a3.m3(); // Compilation Error, as method m3 is not present in class A

		// CASE:6
		B b4 = new B();
		System.out.println("");
		System.out.println("CASE:6 Example");
		b4.m1();

		// CASE:7
		/*
		 * B b5 = new A();
		 * B b6 = new B(); 
		 * b5 = b6; 
		 * B b5 = new B();
		 */ // Compilation Error, as we cannot assign Parent class to Child class
	}

}
