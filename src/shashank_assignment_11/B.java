package shashank_assignment_11;


public class B {

	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public static void  m3() {
		System.out.println("m3 method");
		C c =new C();
		c.m4();
	}
}
