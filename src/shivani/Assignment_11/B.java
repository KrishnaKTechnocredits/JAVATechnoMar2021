package shivani.Assignment_11;

public class B {
	
	void m2() {
        B.m3();
		System.out.println("inside class B calling M3 from M2 (non static to static same class)");
	}

	static void m3() {
		C c = new C();
		c.m4();
        System.out.println("inside class B calling m4 from M3 (static to non static )");

	}

}
