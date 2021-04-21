package shilpa.Assignment_27;

public class InheritanceTestCase7 {
	public static void main(String[] args) {
		// InheritanceClassB b1 = new InheritanceClassA(); CE as parent class cannot fit
		// into child class
		InheritanceClassB b2 = new InheritanceClassB();
		// b1=b2; compilation error parent class cannot fit into child class
		System.out.println(b2.x);
		System.out.println(b2.y);
		System.out.println(b2.z);
		b2.m1();
		b2.m2();
		b2.m3();
	}
}
