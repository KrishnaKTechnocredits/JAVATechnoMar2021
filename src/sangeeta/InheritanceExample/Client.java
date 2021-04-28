/*Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent*/

package sangeeta.InheritanceExample;

public class Client {

	public static void main(String[] a) {
		// Case 1
		Parent p1 = new Parent();
		System.out.println(p1.x);
		System.out.println(p1.y);
		// System.out.println(p1.z);[CE][As z is not accessible in class Parent, hence
		// CE]
		p1.m1();
		p1.m2();
		// p1.m3();[CE][As method m3 is not accessible in class Parent, hence CE]

		// Case 2:
		Child c1 = new Child();
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
		c1.m1();
		c1.m2();
		c1.m3();

		// Case 3:
		Parent p2 = new Child();
		System.out.println(p2.x);
		System.out.println(p2.y);
		// System.out.println(p2.z);[As z is not accessible in class Parent, hence CE]
		p2.m1();
		p2.m2();
		// p2.m3();[As method m3 is not accessible in class Parent, hence CE]

		// Case 4:CE at line no 38 because we can not assign parent class to child class
		// because Parent class is bigger than child class.
		/*
		 * Child c2 = new Parent(); System.out.println(c2.x); System.out.println(c2.y);
		 * System.out.println(c2.z); c2.m1(); c2.m2(); c2.m3();
		 */

		// Case 5:
		Parent p3 = new Parent();
		Child c3 = new Child();
		p3 = c3;
		System.out.println(p3.x);
		System.out.println(p3.y);
		// System.out.println(p3.z);[As z is not accessible in class Parent, hence CE]
		p3.m1();
		p3.m2();
		// p3.m3(); [As method m3 is not accessible in class Parent, hence CE]

		// Case 6:
		Parent p4 = new Parent();
		Parent p5 = new Child();
		p5 = p4;
		System.out.println(p3.x);
		System.out.println(p3.y);
		// System.out.println(p3.z);[As z is not accessible in class Parent, hence CE]
		p3.m1();
		p3.m2();
		// p3.m3(); [As method m3 is not accessible in class Parent, hence CE]

		// Case 7: CE at line no 69 because we can not assign parent class to child
		// class because Parent class is bigger than child class.
		/*
		 * Child c4 = new Parent(); Child c5 = new Child(); c4 = c5;
		 * System.out.println(p3.x); System.out.println(p3.y); System.out.println(p3.z);
		 * p3.m1(); p3.m2(); p3.m3();
		 */

	}

}
