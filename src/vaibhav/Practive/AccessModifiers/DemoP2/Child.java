package vaibhav.Practive.AccessModifiers.DemoP2;

import vaibhav.Practive.AccessModifiers.DemoP1.GParent;
import vaibhav.Practive.AccessModifiers.DemoP1.Parent;

public class Child extends Parent {

	void display2() {
		GParent gParent = new GParent();
		Parent parent = new Parent();
		Child child = new Child();

		System.out.println("Parent & Child class in different package");
		System.out.println("*******************************************************");
		System.out.println("");

		// --------------------------------------------//
		// ** Private methods can't go outside class **//
		// --------------------------------------------//
		System.out.println("GParent private m1 calling from Child");
		System.out.println("The method m1() form the type GParent is not visible");
		// gParent.m1();
		// parent.m1();
		// child.m1();
		// m1();
		System.out.println("========================================================");

		// -------------------------------------------------------//
		// **default methods can go outside class of same package //
		// -------------------------------------------------------//
		System.out.println("GParent default m2 calling from Child");
		System.out.println("The method m1() form the type GParent is not visible");
		// gParent.m2();
		// parent.m2();
		// child.m2();
		// m2();
		System.out.println("========================================================");

		// -------------------------------------------------------//
		// **protected methods can go outside class of same package //
		// -------------------------------------------------------//

		System.out.println("GParent protected m3 calling from Child");
		System.out.println("Protected methods can be called through the child class object or dictect calling");
		System.out.println("Protected methods cannt be called through parent class / Gparent class object");
		System.out.println("");
		// gParent.m3();
		// parent.m3();
		System.out.println("Child class object calling");
		System.out.println("--------------------------");
		child.m3();
		System.out.println("direct calling");
		System.out.println("--------------------------");
		m3();
		System.out.println("========================================================");

		// -------------------------------------------------------//
		// **public methods can go outside class of same package //
		// -------------------------------------------------------//

		System.out.println("GParent public m4 calling from Parent");
		gParent.m4();
		parent.m4();
		child.m4();
		m4();
		System.out.println("========================================================");

	}

	public static void main(String[] args) {
		Child child = new Child();
		child.display2();
	}
}
