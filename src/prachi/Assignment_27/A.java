package prachi.Assignment_27;


/*Assignment - 27 : 21st April'2021
Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 
Note : Child extends Parent*/

public class A {
	int x = 10;
	int y = 12;

	void m1() {
		System.out.println("A_m1");
	}
	void m2() {
		System.out.println("A_m2");
	}
	public static void main(String[] args) {

		//-------------------------------------Case1---------------------------------------------//
		System.out.println("=========Case1==========");
		A a1=new A();
		a1.m1(); //A_m1
		a1.m2(); //A_m2
		//a1.m3(); //compilation error: property doesnot flow from child to parent
		System.out.println(a1.x); //10
		System.out.println(a1.y); //12
		//System.out.println(a1.z);//compilation error: property doesnot flow from child to parent


		//-------------------------------------Case3---------------------------------------------//
		System.out.println("=========Case3==========");
		A a2=new B();
		a2.m1(); //A_m1
		a2.m2(); //B_m2
		//a2.m3(); 
		/* compiler do not see at right side. If A has right hand side element, then only compiler allows.
	 it only allows the elements present at left hand side. i,e. A a2 : it asks garenty of reference class.
	 to prove this, we can write A a1=null, but at run time: it will throw null pointer exception by jvm.*/
		System.out.println(a2.x); //10
		System.out.println(a2.y); //12
		//System.out.println(a2.z); //CE


		//-------------------------------------Case5---------------------------------------------//
		System.out.println("=========Case5==========");
		A a3= new A();
		B b3= new B();
		a3=b3; //A a
		a3.m1(); 
		/*combination of line 1,2 and 3 is nothing but: A_a3 = new B
		it is called as dynamic polymorphism
		it always takes guaranty of parent class. compiler will compile things present in A only.
		case 5 is exactly equivalent to case3*/

		a3.m2(); //A_m2
		//a3.m3(); //CE
		System.out.println(a3.x); //10
		System.out.println(a3.y); //12 : variables dono't override[Property does not change, only behavior changes]
		//System.out.println(a3.z); //CE


		//-------------------------------------Case6---------------------------------------------//
		System.out.println("=========Case6==========");
		A a4= new A();
		//A b3= new B();// CE
		//	b3=a4 //CE
		//It is nothing but case 1
	}
}
