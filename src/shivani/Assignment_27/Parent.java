package shivani.Assignment_27;

public class Parent {

	int x = 10;
	int y = 50;

	// Case 1
	void m1() {
		System.out.println("its m1");
	}

	void m2() {
		System.out.println("its m2");
	}

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.m1();
		p1.m2();
		// p1.m3();//compile error
		System.out.println(p1.x);
		System.out.println(p1.y);
		// System.out.println(p1.z);//Compile error

		// case 3
		System.out.println("case 3");
		Parent p2 = new Child();
		System.out.println(p2.x);
		System.out.println(p2.y);
		// System.out.println(p2.z);//Compile error
		p2.m1();
		p2.m2();
		// p2.m3();//Compile Error

		// case5

		System.out.println("case 5");
		Parent p3 = new Parent();
		Child c3 = new Child();
		p3 = c3;
		System.out.println(p3.x);
		System.out.println(p3.y);
		// System.out.println(p3.z);//Compile Error
		p3.m1();
		p3.m2();
		// p3.m3();Compile error

		System.out.println("case 6");
		Parent p4 = new Parent();
		Parent p5 = new Child();
		p5 = p4;
		p5.m1();
		p5.m2();

	}

}
