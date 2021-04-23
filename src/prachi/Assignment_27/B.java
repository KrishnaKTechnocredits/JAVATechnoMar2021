package prachi.Assignment_27;

public class B extends A {
	int y = 30;
	int z = 40;

	void m2() {
		System.out.println("B_m2");
	}
	void m3() {
		System.out.println("B_m3");
	}


	public static void main(String[] args) {

		//-------------------------------------Case2---------------------------------------------//
		System.out.println("=========Case2==========");
		B b1 = new B();
		b1.m1(); //A_m1
		b1.m2(); //B_m2
		b1.m3(); //B_m3
		System.out.println(b1.x); //10
		System.out.println(b1.y); //30
		System.out.println(b1.z); //40


		//-------------------------------------Case4---------------------------------------------//
		System.out.println("=========Case4==========");
		/*B b2 = new A(); //CE
	  large value cannot be stored in small value. It is not allowed without external typecasting.
	  We are trying to assign parent class object into child class reference.

	   b2.m1(); //CE
	   b2.m2(); //CE
	   b2.m3(); //CE
	   System.out.println(b2.x); //CE
	   System.out.println(b2.y); //CE
	   System.out.println(b2.z); //CE
		 */

		//-------------------------------------Case7---------------------------------------------//
		System.out.println("=========Case7==========");
		/*B b5=new A(); // CE : Cannot assign parent to child
		B b6= new B();
		b5=b6;*/
	}
}
