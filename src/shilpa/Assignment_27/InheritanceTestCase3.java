package shilpa.Assignment_27;

public class InheritanceTestCase3 {
	public static void main(String[] args) {
		InheritanceClassA a1 = new InheritanceClassB();
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); InheritanceClassA do not have variable A and
		// compiler can check only reference.
		a1.m1();
		a1.m2();
		// a1.m3(); InheritanceClassA do not have method m3() and compiler can check
		// only reference.
	}
}
