package shilpa.Assignment_27;

public class InheritanceTestCase1 {

	public static void main(String[] args) {
		InheritanceClassA a1 = new InheritanceClassA();
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); z is not available with class InheritanceClassA
		a1.m1();
		a1.m2();
		// a1.m3(); m3 method is not available with class InheritanceClassA
	}
}
