package radha.Inheritance7Cases.Assignment27;

public class Client {

	public static void main(String[] args) {
		System.out.println("*****Output of Case 1*****");
		Parent p = new Parent();
		System.out.println(p.x);
		System.out.println(p.y);
		// System.out.println(p.z); reason -Child class properties are not accessible to
		// Parent class.
		p.m1();
		p.m2();
		// p.m3(); CE. reason - Child class methods are not accessible to Parent class.

		System.out.println("\n*****Output of Case 2*****");
		Child c = new Child();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		c.m1();
		c.m2();
		c.m3();

		System.out.println("\n*****Output of Case 3*****");
		Parent p1 = new Child();
		System.out.println(p1.x);
		System.out.println(p1.y);
		// System.out.println(p1.z);
		// CE. Reason - At compile time, left hand side is looked upon by compiler and
		// can only access members which are guaranteed by parent class. This is Dynamic
		// polymorphism.
		p1.m1();
		p1.m2();
		// p1.m3();
		// CE. Reason - At compile time, left hand side is looked upon by compiler and
		// can only access members which are guaranteed parent class. This is Dynamic
		// polymorphism.

		System.out.println("\n*****Output of Case 4*****");
		/*
		 * Child c1 = new Parent(); //CE System.out.println(c1.x);
		 * System.out.println(c1.y); System.out.println(c1.z); c1.m1(); c1.m2();
		 * c1.m3();
		 */
		System.out.println("Compilation error, as we are assigning parent class obj into child class reference");

		System.out.println("\n*****Output of Case 5*****");
		Parent p2 = new Parent();
		Child c2 = new Child();
		p2 = c2; // Parent p2 = new Child();
		// So now same as Case 3.
		System.out.println(p2.x);
		System.out.println(p2.y);
		// System.out.println(p2.z);
		p2.m1();
		p2.m2();
		// p2.m3();

		System.out.println("\n*****Output of Case 6*****");
		Parent p3 = new Parent();
		Parent c3 = new Child();
		c3 = p3; // parent c3 = new Parent(); which becomes same as Case1.
		System.out.println(c3.x);
		System.out.println(c3.y);
		// System.out.println(c3.z);
		c3.m1();
		c3.m2();
		// c3.m();

		System.out.println("\n*****Output of Case 7*****");
		//Child c4 = new Parent(); //same as case 4
		/*Child c5 = new Child();
		c4 = c5;
		System.out.println(c4.x);
		System.out.println(c4.y);
		System.out.println(c4.z);
		c4.m1();
		c4.m2();
		c4.m3();*/
		System.out.println("Compilation error, as we are assigning parent class obj into child class reference");


	}

}
