/*
 Assignment - 27 : 21st April'2021

Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent
 */

package ami.Assignment_27;

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
		// System.out.println(a1.z); Reason : Derived class(class B) properties can't be
		// accessible to parent class(Class A)
		a1.classAM1();
		a1.M2();

		System.out.println("");
		System.out.println("Case 2 OUTPUT--->");
		ClassB b1 = new ClassB();
		System.out.println(b1.x);
		System.out.println(b1.y); //
		System.out.println(b1.z);
		b1.classAM1();
		b1.M2();
		b1.classBM3();

		System.out.println("");
		System.out.println("Case 3 OUTPUT--->");
		ClassA a3 = new ClassB();
		System.out.println(a3.x);
		System.out.println(a3.y);
		a3.classAM1();
		a3.M2();

		System.out.println("");
		System.out.println("Case 4 OUTPUT--->");
		System.out.println("Nothing will execute for case 4");
		// ClassB b4 = new ClassA(); // CE at object creation as we are trying to create
		// object of child class with property of parent class
		// System.out.println(b4.x);
		// System.out.println(b4.y);
		// System.out.println(b4.z);
		// b4.classAM1();
		// b4.M2();
		// b4.classBM3();

		System.out.println("");
		System.out.println("Case 5 OUTPUT--->");
		ClassA a5 = new ClassA();
		ClassB b5 = new ClassB();
		a5 = b5;
		System.out.println(a5.x);
		System.out.println(a5.y);
		a5.classAM1();
		a5.M2();

		System.out.println("");
		System.out.println("Case 6 OUTPUT--->");
		ClassA a6 = new ClassA();
		ClassA a61 = new ClassB();
		a61 = a6;
		System.out.println(a61.x);
		System.out.println(a61.y);
		// System.out.println(a61.z);
		a61.classAM1();
		a61.M2();
	}
}
