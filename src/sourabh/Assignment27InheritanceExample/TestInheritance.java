////Inheritance-main method

package sourabh.Assignment27InheritanceExample;

public class TestInheritance {
	
	public static void main(String[] args) {
	//----------------------------Case1--------------------------	
		System.out.println("Case1:");
		A a=new A();
		System.out.println(a.x);//10
		System.out.println(a.y);//12
		//System.out.println(a.z);// [CE Reason: Class A doesn't have Z variable]
		a.m1();//Calling A m1.
		a.m2();//Calling A m2.
		//a.m3();// [CE Reason: Class A doesn't have m3 method]
	//----------------------------Case2--------------------------	
		System.out.println("Case2:");
		B b=new B();
		System.out.println(b.x);//10 // It will take the Value of X which is in Class A. 
		System.out.println(b.y);//30 // Priority given to Class B variable as object is created of Class B
		System.out.println(b.z);//40
		b.m1();// It will call the method of m1 which is in Class A.// Calling A m1.
		b.m2();// Exactly same method m2 available in Parent class A but priority give to method available in child class B of which object is created
		b.m3();// Calling B m3.
	//----------------------------Case3(Dynamic Polymorphism)--------------------------	
		System.out.println("Case3:");
		A a1=new B();
		System.out.println(a1.x);//10 It will take the Value of X which is in Class A. 
		System.out.println(a1.y);//12 // As per Dynamic Polymorphism rules properties(variables) will not change in runtime. So it will take class A variables.
		//System.out.println(a1.z);//CE Reason: Class A doesn't have Z variable.
		a1.m1();// It will call the method of m1 which is in Class A.// Calling A m1.
		a1.m2();// As per Dynamic Polymorphism rules behaviour(methods) will change in runtime and it will take current class B methods. It will take class B method m2.
		//a1.m3();//CE Reason: Class A doesn't have m3 method.	
	//----------------------------Case4(Invalid Case)--------------------------	
		System.out.println("Case4: X");
		//B b1 =new A(); //CE Reason: We can't assign parent Class A in Child Class B.
/*		System.out.println(b1.x); 
		System.out.println(b1.y);
		System.out.println(b1.z);
		b1.m1();
		b1.m2();
		b1.m3();
*/		
	//----------------------------Case5(Same as Case 3)--------------------------	
		System.out.println("Case5:");
		A a2= new A();
		B b2= new B();
		a2= b2;// A a2= new B();
		System.out.println(a2.x); 
		System.out.println(a2.y);
		//System.out.println(a2.z);
		a2.m1();
		a2.m2();
		//a2.m3();
		//**Same as Case 3**		
	//----------------------------Case6(Same as Case 1)-----------------------------------------
		System.out.println("Case6:");
		A a3= new A();
		A b3= new B();
		b3= a3; //A b3= new A();
		System.out.println(b3.x); 
		System.out.println(b3.y);
		//System.out.println(a3.z);
		b3.m1();
		b3.m2();
		//a2.m3();
		//**Same as Case 1**
	}
}
