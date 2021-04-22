/*
Assignment - 27 : 21st April'2021

Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent
 */
package paras.Assignment_27;

public class ClassA {
	
	int x = 10;
	int y = 12;
	
	void m1() {
		System.out.println("Class A m1 Method");
	}
	
	void m2() {
		System.out.println("Class A m2 Method");
	}
	
	public static void main(String[] args) {
		
		// Case :- 1
		System.out.println("Case 1 Output");
		ClassA a1 = new ClassA();
		System.out.println(a1.x);
		System.out.println(a1.y);
	//	System.out.println(a1.z); // Variable Z is present in Class B, that can't be access by Class A.
		a1.m1();
		a1.m2();
	//	a1.m3(); // Method m3 is present in Class B, that can't be access by Class A.
		
		//Case :- 3
		System.out.println("\nCase 3 Output");
		ClassA a2 = new ClassB();
		System.out.println(a2.x);
		System.out.println(a2.y); // Properties can not be changed, that means variable value can't be change from compile time to run time. 
	//	System.out.println(a2.z); // Variable Z is present in Class B, that can't be access by Class A. At compile time z need to present in Class A.
		a2.m1();
		a2.m2(); // It will execute m2() from child class that is Class B.Because when parent and child class is having same method signature then it changes from compile to runtime. This behavior is called as Dynamic Polymorphism. 
	//	a2.m3(;) // Method m3 is present in Class B, that can't be access by Class A.
		
		//Case :- 5
		System.out.println("\nCase 5 Output");
		ClassA a3 = new ClassA();
		ClassB b3 = new ClassB();
		a3 = b3; // ClassA a3 = new ClassB(); // is equivalent to Case 3
		System.out.println(a3.x);
		System.out.println(a3.y); // Properties can not be changed, that means variable value can't be change from compile time to run time.
	//	System.out.println(a3.z); // Variable Z is present in Class B, that can't be access by Class A. At compile time z need to present in Class A.
		a3.m1();
		a3.m2(); // It will execute m2() from child class that is Class B.Because when parent and child class is having same method signature then it changes from compile to runtime. This behavior is called as Dynamic Polymorphism.
	//	a3.m3(); // Method m3 is present in Class B, that can't be access by Class A.
		
		//Case :- 6
		System.out.println("\nCase 6 Output");
		ClassA a4 = new ClassA();
		ClassA b4 = new ClassB();
		b4 = a4; // ClassA b4 = new ClassA(); // is equivalent to Case 1
		System.out.println(b4.x);
		System.out.println(b4.y);
	//	System.out.println(b4.z); Variable Z is present in Class B, that can't be access by Class A.
		b4.m1();
		b4.m2();
	//	b4.m3(); Method m3 is present in Class B, that can't be access by Class A.
	}
}
