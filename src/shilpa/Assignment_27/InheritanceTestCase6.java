package shilpa.Assignment_27;

public class InheritanceTestCase6 {
	public static void main(String[] args) {
		InheritanceClassA a1 = new InheritanceClassA();
		InheritanceClassB b1 = new InheritanceClassB();
		// b1=a1; compilation error parent class cannot fit into child class
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); compilation error as InheritanceClassA do not have
		// variable Z
		a1.m1();
		a1.m2();
		// a1.m3(); compilation error as inheriting from class InheritanceClassB
	}
}
