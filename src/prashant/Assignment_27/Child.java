/*Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent
*/
package prashant.Assignment_27;

public class Child extends Parent {
	int x = 78;
	int y = 90;
	int z = 68;

	@Override
	void m1() {
		System.out.println(" This is child m1 method");
	}

	@Override
	void m2() {
		System.out.println(" This is child m2 method");
	}

	void m3() {
		System.out.println(" This is child m3 method");
	}
}
