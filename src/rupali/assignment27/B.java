package rupali.assignment27;

public class B extends A {
	int y=30;
	int z=40;
	int x=100;
	
	void m2() {
		System.out.println("B m2");
		System.out.println(x);
	}
	
	void m3() {
		System.out.println("B m3");
	}
	
	public static void main(String[] args) {
		//--- CASE 1 ---
		A a1 =new A();
		System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.z); CE parents cannot inherit child class property
		a1.m1();
		a1.m2();
		//a1.m3(); CE parents cannot inherit child class property
		
		//--- CASE2 ---
		//no CE child class can accessparent class property
		B b1=new B();
		System.out.println(b1.x);
		System.out.println(b1.y); //y will take child class value
		System.out.println(b1.z);
		b1.m1();
		b1.m2();
		b1.m3();
		
		//--- CASE3 ---
		A a2 =new B();
		System.out.println(a2.x);
		System.out.println(a2.y);
		// Here as reference is of class A and variables bind at compile time.. value of class A
		// will be assigned to y
		//System.out.println(a2.z); CE
		a2.m1();
		a2.m2(); //as object is of class B it will call m2 method of B
		//a2.m3();  CE
		
		//--- CASE 5---
		
		A a3= new A();
		B b2 =new B();
		a1=b1;// here it will become case 3
		System.out.println(a3.x);
		System.out.println(a3.y);
	//	System.out.println(a3.z);
		a3.m1();
		a3.m2();
		//a3.m3();
		
		//--- CASE6 ---
		A a4= new A();
		A b3= new B();
		b3=a4;// A b3= new A();
		
		//--- CASE 7---
	//	B b4=new A(); child to parent assignment not possible
		
		// --- CASE 8 ---
		
		B b5= new B();
		b5.m1();
		/* when method traverse from parent to child it will carry its own variables and
		 * it will not take childs variable
		 */
		 
		
	}
	
}
