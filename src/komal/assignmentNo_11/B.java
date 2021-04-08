package komal.assignmentNo_11;

public class B {
	void m2() {
		System.out.println("Inside method m2 of class B, calling static method m3 of same class");
		m3();
	}

	static void m3() {
		System.out.println("Inside static method m3 of class B, calling method m4 of class C");
		C c = new C();
		c.m4();
	}	
}
