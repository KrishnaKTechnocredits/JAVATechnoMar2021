/*Inheritance related all 7 Cases when Parent and Child class 
 * both are present into same package
 * 
 */
package aparna.inheritance;

public class ChildClass extends ParentClass {
	int y = 30;
	int z = 40;

	public void m2() {
		System.out.println("Class child m2 Method");
	}

	public void m4() {
		System.out.println("Class child m4 Method");
	}

	public static void main(String[] args) {
		System.out.println("Case 1 RESULT---->");
		// Variables and Methods which are not present in Parent Class (ParentClass)
		// will not be accessible on Parent Class Object
		ParentClass parent = new ParentClass();
		System.out.println(parent.x);// 10
		System.out.println(parent.y);// 12
		// System.out.println(parent.z); Reason : As Parent class don't have variable z
		// is present
		parent.m1();// Class parent m1 Method
		parent.m2();// Class parent m2 Method
		parent.m3();// Class Parent's m3 method whose return type is String
		// parent.m4();//Reason : As Parent class don't have method m4() is present

		System.out.println("");
		System.out.println("Case 2 RESULT--->");
		// All cases will work properly as Child Class(ChildClass) will acquire all
		// properties(variables) and override bahaviours(methods) of Parent
		// Class(ParentClass)
		ChildClass child = new ChildClass();
		System.out.println(child.x); // 10, As X is not available in child class so it will take value from parent
										// class
		System.out.println(child.y); // 30, Priority given to Class B variable as object is created of Class B
		System.out.println(child.z);// 40 , As Z is only available in child class so it will take value of z as 40
		child.m1();// Class parent m1 Method
		child.m2();// Class child m2 Method // Exactly same method available in Parent class and
					// Child Class both but priority given to method available in child class as
					// object is created of Child Class
		child.m3();// Class Parent's m3 method whose return type is String
		child.m4();// Class child m4 Method
		// Exactly same method available in Parent class but priority give to method
		// available in derived class of which object is created

		System.out.println("");
		System.out.println("Case 3 RESULT--->");
		ParentClass parent1 = new ChildClass(); // Example of Dynamic Polymorphism
		System.out.println(parent1.x);// 10//it will consider x value from Parent Class
		System.out.println(parent1.y); // 12// it will consider x value from Parent class as property(Variables) will
										// not change in dynamic polymorphism concept
		// System.out.println(parent1.z); // This is CE - Reason : parent Class can only
		// give guarantee of variables and Methods which all are present in parent class
		parent1.m1();// Class parent m1 Method
		parent1.m2();// Class child m2 Method// Here Child class m2() method is considered in
						// compilation so no Compile error found, but on run time execution Child class
						// is called because behaviour will change from compile time to run time.
		parent1.m3();// Class Parent's m3 method whose return type is String
		// parent.m4()//CE as compiler will only look to left side and check if any
		// method present in parent class or not and method m4 is not present in parent
		// class

		System.out.println("");
		System.out.println("Case 4 RESULT--->");
		System.out.println("Nothing will execute for case 4");
		// ChildClass child1 = new ParentClass ();//CE as Parent is big than child class
		// and we can't save bigger value into smaller one
		// System.out.println(child1.x);
		// System.out.println(child1.y);
		// System.out.println(child1.z);
		// child1.m1();
		// child1.m2();
		// child1.m3();
		// child1.m4();

		System.out.println("");
		System.out.println("Case 5 RESULT--->");
		ParentClass parent2 = new ParentClass();
		ChildClass child2 = new ChildClass();
		parent2 = child2;
		// shortcuts or Trick :-
		// see "parent2" left hand side is : "ParentClass parent2" (Line 68)
		// see "child2" right hand side is "new ChildClass()" ( line 69)
		// So final statement will work like ParentClass parent2 = new ChildClass();
		// which is similar to CASE 3
		System.out.println(parent2.x);// 10
		System.out.println(parent2.y);// 12
		// System.out.println(parent2.z); //CE as parent Class can only give guarantee
		// of variables and Methods which all are present in parent class
		parent2.m1();// Class parent m1 Method
		parent2.m2();// Class child m2 Method// Here Child class m2() method is considered in
						// compilation so no Compile error found, but on run time execution Child class
						// is called because behaviour will change from compile time to run time.
		parent2.m3();// Class Parent's m3 method whose return type is String
		// parent2.m4();//CE as compiler will only look to left side and check if any
		// method present in parent class or not and method m4 is not present in parent
		// class

		System.out.println("");
		System.out.println("Case 6 RESULT--->");
		// Variables and Methods which are not present in Parent Class (ParentClass)
		// will not be accessible on Parent Class Object
		ParentClass parent3 = new ParentClass();
		ParentClass parent4 = new ChildClass();
		parent4 = parent3;
		// shortcuts or Trick :-
		// see "parent4" left hand side is : "ParentClass parent4"
		// see "parent3" right hand side is "new ParentClass()"
		// So final statement will work like ParentClass parent4 = new ParentClass();
		// which is similar to CASE 1

		System.out.println(parent4.x);// 10
		System.out.println(parent4.y);// 12
		// System.out.println(parent4.z);//CE as variable z is not present in parent
		// class
		parent4.m1();// Class parent m1 Method
		parent4.m2();// Class parent m2 Method
		parent4.m3();// Class Parent's m3 method whose return type is String
		// parent4.m4();//CE as method m4() is not present in parent class

		System.out.println("");
		System.out.println("Case 7 RESULT--->");

		// ChildClass child4 = new ParentClass(); //CE as Parent is big than child class
		// and we can't save bigger value into smaller one
		// ChildClass child5 = new ChildClass();
		// child4=child5;
		System.out.println("Nothing will execute for case 7");

	}
}