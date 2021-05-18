/*Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent
*/
package ravindra_J.Assignment_No_27_Inheritance_7_Cases;

public class Parent {

	int x = 10;
	int y = 20;
	int b;
	void m1() {
		System.out.println("Parent.m1()");
	}
	
	int m2(String str) {
		int x = 50;
		System.out.println("Parent.m2(str) : "+x);
		return y+b;
	}
	
	void m3() {
		System.out.println("parent.m3");
		b = x;
	}
}
