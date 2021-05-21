package shashank.assignment_27;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Case 1
		System.out.println("Case 1 -------> Parent p1 = new Parent();");
		Parent p1 = new Parent();
		System.out.println(p1.x); // 10
		System.out.println(p1.y); // 12
		// System.out.println(p1.z); // [CE as z is not present in Parent ]
		p1.m1(); // Parent m1
		p1.m2(); // Parent m2
		// p1.m3(); // m3 method is not defined for parent
		System.out.println("\n\n");

		// Case 2
		System.out.println("Case 2 -------> Child c1 = new Child();");
		Child c1 = new Child();
		System.out.println(c1.x); // 10
		System.out.println(c1.y); // 30
		System.out.println(c1.z); // 40
		c1.m1(); // Parent m1
		c1.m2(); // Child m2
		c1.m3(); // Child m3
		System.out.println("\n\n");

		// Case 3
		System.out.println("Output of Case 3 -------> Parent p1 = new Child();");
		Parent p2 = new Child();
		System.out.println(p2.x); // 10
		System.out.println(p2.y); // 12
		// System.out.println(p2.z); // [CE as z is not present in Parent and hence
		// cannot be guaranteed]
		p2.m1(); // Parent m1
		p2.m2(); // Child m2
		// p2.m3(); //Child m3 // [CE as z is not present in Parent and hence cannot be
		// guaranteed]
		System.out.println("\n\n");

		// Case 4
		System.out.println("Case 4 -------> Child c1 = new Parent();");
		System.out.println("Cannot fit Parent into Child");
		// Child c2 = new Parent(); // Cannot fit Parent into Child
		// System.out.println(c2.x); //
		// System.out.println(c2.y); //
		// System.out.println(c2.z); //
		// c2.m1(); //
		// c2.m2(); //
		// c2.m3(); //
		System.out.println("\n\n");

		// Case 5 equivalent to Case 3
		System.out.println("Output of Case 5 -------> p3 = c3");
		Parent p3 = new Parent();
		Child c3 = new Child();
		p3 = c3; // Parent p3 = new Child()
		System.out.println(p3.x); // 10
		System.out.println(p3.y); // 12
		// System.out.println(p3.z); // [CE as z is not present in Parent and hence
		// cannot be guaranteed]
		p3.m1(); // Parent m1
		p3.m2(); // Child m2
		// p3.m3(); //Child m3 // [CE as m3 is not present in Parent and hence cannot be
		// guaranteed]
		System.out.println("\n\n");

		// Case 6 equivalent to Case 1
		System.out.println("Output of Case 6 -------> c4 = p4");
		Parent p4 = new Parent();
		Parent c4 = new Child();
		c4 = p4; // Parent c4 = new Parent();
		System.out.println(c4.x); // 10
		System.out.println(c4.y); // 12
		// System.out.println(c4.z); // [CE as z is not present in Parent and hence
		// cannot be guaranteed]
		c4.m1(); // Parent m1
		c4.m2(); // Child m2
		// c4.m3(); // [CE as m3 is not present in Parent and hence cannot be
		// guaranteed]
		System.out.println("\n\n");

		// Case 7 equivalent to Case 4
		System.out.println("Output of Case 7 -------> c4 = p4");
		System.out.println("Cannot fit Parent into Child");
		// Child c5 = new Parent();
		// Child c6 = new Child();
		// c5 = c6; // Parent c4 = new Parent();
		// System.out.println(c5.x);
		// System.out.println(c5.y);
		// System.out.println(c5.z);
		// c5.m1();
		// c5.m2();
		// c5.m3();
		System.out.println("\n\n");

	}

}
