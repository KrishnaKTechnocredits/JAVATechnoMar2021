/*
 Assignment - 27 : 21st April'2021

Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent
 */

package ankit.assignment_27;

public class ClassB extends ClassA {
	int y = 30;
	int z = 40;

	void M2() {
		System.out.println("Class B M2 Method Called");
	}

	void classBM3() {
		System.out.println("Class B M3 Method Called");
	}

	public static void main(String[] args) {
		System.out.println("Case 1 Output---->");
		ClassA a1 = new ClassA();
		System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.z); Reason : Derived class(class B) properties can't be accessible to parent class(Class A)
		a1.classAM1();
		a1.M2();
		//a1.classBM3(); This will give CE Reason : Derived class(class B) properties can't be accessible to parent class(Class A)

		System.out.println("");
		System.out.println("Case 2 OUTPUT--->"); 
		// All cases will work as Child Class(ClassB) will acquire all properties of Parent Class(ClassA)
		ClassB b1 = new ClassB();
		System.out.println(b1.x); // As X is not available in child class so it will take value from parent class
		System.out.println(b1.y); // Priority given to Class B variable as object is created of Class B 
		System.out.println(b1.z);
		b1.classAM1();
		b1.M2(); // Exactly same method available in Parent class but priority give to method available in derived class of which object is created
		b1.classBM3();

		System.out.println("");
		System.out.println("Case 3 OUTPUT--->"); 
		ClassA a3 = new ClassB(); // Example of Dynamic Polymorphism
		System.out.println(a3.x);
		System.out.println(a3.y); // it will consider x value from ClassA as property will not change in dynamic polymorphism concept
		//System.out.println(a3.z); // This is CE - Reason :  class A can only gurantee for variables and Methods that are available in classA
		a3.classAM1();
		a3.M2(); // Here Class A m2 method is considered in compilation so no CE, but on run time execution class B is called because behaviour will change at run time.
		//a3.classBM3(); //compiler will only look to left side and check if any method present in ClassA

		System.out.println("");
		System.out.println("Case 4 OUTPUT--->"); 
		System.out.println("Nothing will execute for case 4");
		//ClassB b4 = new ClassA(); // CE at object creation as we are trying to create object of child class with property of parent class
		//System.out.println(b4.x);
		//System.out.println(b4.y);
		//System.out.println(b4.z);  
		//b4.classAM1();
		//b4.M2();
		//b4.classBM3();

		System.out.println("");
		System.out.println("Case 5 OUTPUT--->"); 
		ClassA a5 = new ClassA();
		ClassB b5 = new ClassB();
		a5=b5;
		// trick  
		//a5 left side is : ClassA a5 (Line 67)
		//b5 right side is New ClassB() ( line 68)
		//So final statement will work like Class a5 = new ClassB();
		//which is similar to case 3
		System.out.println(a5.x);
		System.out.println(a5.y);
		//System.out.println(a5.z);  
		a5.classAM1();
		a5.M2();
		//a5.classBM3();

		System.out.println("");
		System.out.println("Case 6 OUTPUT--->"); 
		ClassA a6 = new ClassA(); 
		ClassA a61 = new ClassB();
		a61 = a6;
		// Use Trick : refer line 70 to 73
		// final statement will become Class a61 = new ClassA();
		//This is similar to case 1
		System.out.println(a61.x);
		System.out.println(a61.y);
		//System.out.println(a61.z);  
		a61.classAM1();
		a61.M2();
		//a61.classBM3();	
	}
}
