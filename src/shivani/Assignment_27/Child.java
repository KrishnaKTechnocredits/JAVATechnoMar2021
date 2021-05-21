package shivani.Assignment_27;

public class Child extends Parent {

	int y = 20;
	int z = 30;

	void m2() {
		System.out.println("its m2");
	}

	void m3() {
		System.out.println("its m3");
	}

	public static void main(String[] args) {
		System.out.println("case2");
		Child c1 = new Child();
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
		c1.m1();
		c1.m2();
		c1.m3();

		System.out.println("case 4");
		/*
		 * Child c2 = new Parent(); 
		 * c2.m1();
		 *  c2.m2(); 
		 *  c2.m3(); 
		 *  System.out.println(c2.x);
		 * System.out.println(c2.y); System.out.println(c2.z);
		 */

		System.out.println("case 7");

		// Child c4 = new Parent();//cant assign parent to child
		Child c5 = new Child();
		// c4=c5;

	}

}
