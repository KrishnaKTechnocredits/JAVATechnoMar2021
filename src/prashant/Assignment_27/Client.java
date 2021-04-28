/*Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent
*/
package prashant.Assignment_27;

public class Client {
	public static void main(String[] args) {
		// Case-1
		Parent P = new Parent();
		System.out.println("This is Case 1 Static Polymorphism   Parent P = new Parent();");
		P.m1();
		P.m2();
		P.m4();
		// Child method can't be accessed from Parent
		// P.m3();
		System.out.println("This is Parent Properties   " + P.x);
		System.out.println("This is Parent Properties   " + P.y);
		// Below CE child class properties can't be accessed from Parent
		// System.out.println(P.Z);

		// Case-2
		Child C = new Child();
		System.out.println("This is Case 2 Static Polymorphism Child C = new Child();");
		// Child method
		C.m1();
		C.m2();
		C.m3();
		// Parent method traverse in to child Class
		C.m4();
		// Child Properties
		System.out.println("This is Child Properties  " + C.x);
		System.out.println("This is Child Properties  " + C.y);
		System.out.println("This is Child Properties  " + C.z);

		// Case -3
		// Dynamic Polymorphism
		Parent P1 = new Child();
		System.out.println("This is Case 3 Dynamic Polymorphism Parent P1 = new Child();");
		// Properties will be Parent Class only at Run time
		System.out.println("This is Parent Properties Value 90 " + P1.x);
		System.out.println("This is Parent Properties Value 100 " + P1.y);
		// Below CE Parent does not guarentee of child Properties
		// System.out.println("This is Parent Properties Value 100 " +P1.Z);
		// Run time Guarantee of Child
		P1.m1();
		P1.m2();
		// Below CE Parent does not guarentee of child method
		// P1.m3();

		// Case -4
		Parent P2 = new Parent();
		Child C1 = new Child();
		P2 = C1;
		System.out.println("This is Case 4 Dynamic Polymorphism using assigment Operator P2=C1  ");
		// Below CE Parent does not guarentee of child Properties
		// System.out.println("This is Parent Properties Value 100 " +P1.Z);
		// Properties will be Parent Class only at Run time
		System.out.println("This is Parent Properties Value  " + P2.x);
		System.out.println("This is Parent Properties Value  " + P2.y);
		P2.m1();
		P2.m2();
		P2.m4();
		// Below CE Parent does not guarentee of child method
		// P1.m3();

		// Case -5
		// Child C3 = new Parent();
		System.out.println("This is Case 5 Parent can't fit in to Child Child C3 = new Parent(); ");

		// Case -6
		Parent P3 = new Parent();
		Parent P4 = new Child();
		P4 = P3;
		System.out.println(
				"This is Case 6 Static Polymorphism using assigment Operator  P4=P3; Parent P4= new Parent() ");
		P4.m1();
		P4.m2();
		// Child method can't be accessed from Parent
		// P4.m3();
		System.out.println("This is Parent Properties Value " + P3.x);
		System.out.println("This is Parent Properties Value " + P3.y);
		// Below CE child class properties can't be accessed from Parent
		// System.out.println(P3.Z);

		// Case -7
		//Child C4 = new Child();
		//Parent P5 = new Child();
		// CE at below line . Type mismatch
		// C4=P5;
		System.out.println("This is Case 7 Parent can't fit in to Child using assigment Operator C4=P5");

	}

}
