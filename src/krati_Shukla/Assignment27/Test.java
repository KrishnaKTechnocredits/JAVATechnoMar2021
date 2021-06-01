package krati_Shukla.Assignment27;

public class Test {
	
	public static void main(String[] a) {
		//Case 1:
		A a1 = new A();
		System.out.println("*************Case 1*************");
		System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.z); [Z does not belong to class A]
		a1.m1();
		a1.m3();
		//a1.m2();[m2() does not belong to class A]
		
		//Case 2:
				B b1 = new B();
				System.out.println("*************Case 2*************");
				System.out.println(b1.x);
				System.out.println(b1.y);
				System.out.println(b1.z); 
				b1.m1();
				b1.m3();
				b1.m2();
		//Case 3:
				System.out.println("*************Case 3*************");
				A a2 = new B(); // Dynamic Polymorphism
				System.out.println(a2.x);
				System.out.println(a2.y);
				//System.out.println(a2.z); [A class does not gives guarentee for Z]
				a2.m1(); // At runtime a.m1() will print
				a2.m3();// At runtime b.m3() will print
				//a2.m2(); [A class does not gives guarentee for m3()]
		//Case 4:
				System.out.println("*************Case 4*************");
				/*B b2 = new A(); // Can not convert Parent to Child. A is parent so B can not hold its value
				System.out.println(b2.x);
				System.out.println(b2.y);
				System.out.println(b2.z); 
				b2.m1(); 
				b2.m3();
				b2.m2();*/
		//Case 5:	
				System.out.println("*************Case 5*************");
				A a3 = new A();
				B b3 = new B();
				a3 = b3; // This is case 4. Dynamic Polymosrphism
				System.out.println(a3.x);
				System.out.println(a3.y);
				//System.out.println(a3.z); [A class does not gives guarentee for Z]
				a3.m1(); // At runtime a.m1() will print
				a3.m3();// At runtime b.m3() will print
				//a3.m2(); [A class does not gives guarentee for m3()]
		//Case 6:	
				System.out.println("*************Case 6*************");
				A a4 = new A();
				A b4 = new B();
				b4 = a4; // This is case 1
				System.out.println(b4.x);
				System.out.println(b4.y);
				//System.out.println(b4.z);
				b4.m1();
				b4.m3();
				//b4.m2();
		//Case 7:	
				System.out.println("*************Case 7*************");
				/*B b5 = new A();// This is case 4. Can not convert Parent to Child. A is parent so B can not hold its value
				B b6 = new B();
				b5 = b6; 
				System.out.println(b4.x);
				System.out.println(b4.y);
				System.out.println(b4.z);
				b4.m1();
				b4.m3();
				b4.m2();	*/	
				
	}

}
