/*
Assignment - 27 : 21st April'2021

Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent
 */
package paras.Assignment_27;

public class ClassB extends ClassA{
	
	int y = 30;
	int z = 40;
	
	void m2() {
		System.out.println("Class B m2 Method");
	}
	
	void m3() {
		System.out.println("Class B m3 Method");
	}
	
	public static void main(String[] args) {
		
		//Case :- 2
		System.out.println("Case 2 Output");
		ClassB b1 = new ClassB();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		b1.m1();
		b1.m2();
		b1.m3();
		
		//Case :- 4
	//	ClassB b2 = new ClassA(); // We can not fit parent class "ClassA" into child class "ClassB" reference.this can be possible with type casting.It will throw a compile error on first line itself.
		
		//Case :- 7
	//	ClassB b5 = new ClassA(); // We can not fit parent class "ClassA" into child class "ClassB" reference. it will give a compile error.
	//	ClassB b6 = new ClassB();
	//	b5 = b6;
	}
}
