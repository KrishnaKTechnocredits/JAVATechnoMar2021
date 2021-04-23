/*
Assignment - 27 : 21st April'2021
Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 
Note : Child extends Parent
*/


package priyanka_Panat.assignment27;

public class Test {

	public static void main(String[] args) {
		// case 1
		Parent a1 = new Parent();
		System.out.println("Output of case 1");
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); // (CE as Variable z is not present in Parent
		// class.)
		a1.m1();
		a1.m2();
		// a1.m3();// (CE as m3 method is not present in class child class.)
		System.out.println("------------------------------------");

		Child c1 = new Child();
		// case 2
		System.out.println("Output of case 2");
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
		c1.m1();
		c1.m2();
		c1.m3();
		System.out.println("------------------------------------");

		// case 3
		Parent a2 = new Child();
		System.out.println("Output of case 3");
		System.out.println(a2.x);
		System.out.println(a2.y);
		// System.out.println(a2.z); // (CE as Variable z is not present in Parent
		// class.)
		a2.m1();
		a2.m2();
		// a2.m3(); // ( CE as m3 method is not present in child class.)
		System.out.println("------------------------------------");

		System.out.println("Output of case 4");
		System.out.println("Compilation error as We cannot assign Parent class object into child class reference. ");
		/*
		 * case 4 //Child c2=new Parent(); // (CE as We cannot fit Parent class object
		 * in child class reference. ) System.out.println(c2.x);
		 * System.out.println(c2.y); System.out.println(c2.z); c2.m1(); c2.m2();
		 * c2.m3();
		 */
		System.out.println("------------------------------------");

		// case 5
		Parent a3 = new Parent();
		Child b1 = new Child();
		System.out.println("Output of case 5");
		a3 = b1;
		System.out.println(a3.x);
		System.out.println(a3.y);
		// System.out.println(a3.z); // (CE as Variable z is not present in Parent
		// class)
		a3.m1();
		a3.m2();
		// a3.m3(); // (CE as method is not present in child class)
		System.out.println("------------------------------------");

		System.out.println("Output of case 6");
		System.out.println("Compilation error as We cannot assign Parent class object into child class reference. ");
		// case 6
		Parent a4 = new Parent();
		Child b2 = new Child();
		// b2=a4; //CE as we cannot assign Parent class object into child class
		// reference.
		System.out.println("------------------------------------");

		System.out.println("Output of case 7");
		System.out.println("Compilation error as We cannot assign Parent class object into child class reference. ");
		// case 7
		/*
		 * Child c3=new Parent(); // CE as we cannot assign Parent class object into
		 * child class reference. Child c4=new Child(); c3=c4;
		 */

	}
}
