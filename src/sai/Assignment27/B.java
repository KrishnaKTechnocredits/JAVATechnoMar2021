package sai.Assignment27;

public class B extends A{

	int y = 30;
	int z = 40;

	void m2() {
		System.out.println("B m2");
	}
	void m3() {
		System.out.println("B m3");
	}


	public static void main(String[] args) {

		//Case2 Example//
		System.out.println("Case2");
		B b1 = new B();
		b1.m1(); 
		b1.m2(); 
		b1.m3(); 
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);


		//Case4 Example//
		System.out.println("Case4");
		//B b2 = new A(); //Compilation Error
	   //b2.m1(); //Compilation Error
	   //b2.m2(); //Compilation Error
	   //b2.m3(); //Compilation Error
	   //System.out.println(b2.x); //Compilation Error
	   //System.out.println(b2.y); //Compilation Error
	   //System.out.println(b2.z); //Compilation Error
		 

		//Case7 Example//
		System.out.println("Case7");
		/*B b5=new A(); // CE : Cannot assign parent to child
		B b6= new B();
		b5=b6;*/
	}
}
