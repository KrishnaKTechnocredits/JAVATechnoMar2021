package vaibhav.Practive.AccessModifiers.DemoP1;

public class Parent extends GParent {

	void display1() {
		GParent gParent = new GParent();
		Parent parent = new Parent();

		System.out.println("GParent & Parent class in same package");
		System.out.println("*******************************************************");
		System.out.println("");

		// --------------------------------------------//
		// ** Private methods can't go outside class **//
		// --------------------------------------------//
		System.out.println("GParent private m1 calling from Parent");
		System.out.println("The method m1() form the type GParent is not visible");
		// gParent.m1();
		// parent.m1();
		// m1();
		System.out.println("========================================================");

		// -------------------------------------------------------//
		// **default methods can go outside class of same package //
		// -------------------------------------------------------//
		System.out.println("GParent default m2 calling from Parent");
		gParent.m2();
		parent.m2();
		m2();
		System.out.println("========================================================");

		// -------------------------------------------------------//
		// **protected methods can go outside class of same package //
		// -------------------------------------------------------//

		System.out.println("GParent protected m3 calling from Parent");
		gParent.m3();
		parent.m3();
		m3();
		System.out.println("========================================================");

		// -------------------------------------------------------//
		// **public methods can go outside class of same package //
		// -------------------------------------------------------//

		System.out.println("GParent public m4 calling from Parent");
		gParent.m4();
		parent.m4();
		m4();
		System.out.println("========================================================");

	}

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.display1();
	}
}
