/*Assignment - 27 : 21st April'2021

Create class Parent and Child. Create a class called Client and execute all 7 inheritance cases there. 

Note : Child extends Parent
 */
package ravindra_J.Assignment_No_27_Inheritance_7_Cases;

public class Client {

	public static void main(String[] args) {
		//*********************Case1************************//
		System.out.println("=========Case1==========");
				Parent parent=new Parent();

				parent.m1(); //A.m1()
				parent.m2("String"); //
		//parent.m3(); //compilation error: property does not flow from child to parent
				System.out.println(parent.x); //10
				System.out.println(parent.y); //20
		//System.out.println(parent.z);//compilation error: property does not flow from child to parent

		//*********************Case2************************//
				System.out.println("=========Case2==========");
				Child child = new Child();

		//		child.x;   CE
				System.out.println(child.x);//
				System.out.println(child.y);//40
				System.out.println(child.z);//30
				child.m1();
				child.m1(20);
				child.m2("Ravindra");
				child.m3();
				child.m3();
				System.out.println(child.m2("class"));//30 or 20
				child.m2("java");//20 or 40

		System.out.println("=========Case3(Dynamic Polymorphism)==========");
		//Changing Runtime behavior provided guarantee of parent
				Parent parent2=new Child();

				parent2.m1(); //Parent m1
				parent2.m2(""); //child.m2
				System.out.println(parent2.m2("") );// 40
				//parent2.m3(); 

		/* As we know, LHS checks by compiler , and RHS validate by JVM, 
		 so, compiler do not see at right side. If Parent class(LHS) has Child class(RHS) methods, then only compiler allows to write code to call it.
		 It only allows the method present at parent class. i.e A a2 : it asks guarantee of reference class.once method is compile then In runtime it
		 will call the Child class method(Called changing the behavior at runtime by JVM) 
		 to prove this, we can write A a1=null, but at run time: it will throw null pointer exception by jvm.*/

		/*properties of parent class does not changes at runtime time. it will remain as it is.. */
				System.out.println(parent2.x); //10 
				System.out.println(parent2.y); //20
				//System.out.println(parent2.z); //CE child class property not accessible

		//-------------------------------------Case4---------------------------------------------//
		System.out.println("=========Case4==========");
		/*		Child child2 = new Parent(); //CE...Large value cannot be stored in small value. It is not allowed without external typecasting.
			  We are trying to assign parent class object into child class reference.
			   child2.m1(); //CE
			   child2.m2(); //CE
			   child2.m3(); //CE
			   System.out.println(child2.x); //CE
			   System.out.println(child2.y); //CE
			   System.out.println(child2.z); //CE
		 */
		//-----------------Case5---------------------//
				System.out.println("=========Case5(same as case 3(DP))==========");
				Parent parent3= new Parent();
				Child child3= new Child();
				parent3=child3; //A a = new B();
				
				parent3.m1(); 
				/*line 74 is nothing but: A a3 = new B
				it is called as dynamic polymorphism
				it always takes guaranty of parent class. compiler will compile things present in A only.
				case 5 is exactly equivalent to case3*/

				parent3.m2(""); //parent m2
				parent3.m3(); //compile from Parent and run with child m3()
				System.out.println(parent3.x); //10
				System.out.println(parent3.y); //12 : variables dono't override[Property does not change, only behavior changes]
				//System.out.println(parent3.z); //CE
				
		//-------------------Case6---------------------//
				System.out.println("=========Case6==========");
				Parent  parent4 = new Parent();
				Parent child4 = new Child();// CE
				//child4=parent4; nothing but Case 1 A a1 = new A();
				
		//------------------Case7------------------//
				System.out.println("=========Case7==========");
				Child child5;
				//child5 = new Parent(); // CE : Cannot assign parent to child
				Child child6 = new Child();
				child5 = child6;
				
			}

	}

