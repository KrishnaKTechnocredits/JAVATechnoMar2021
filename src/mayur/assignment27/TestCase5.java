package mayur.assignment27;

public class TestCase5 {
	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		ClassB b1 = new ClassB();
		a1 = b1;
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); compilation error as inheriting from class
		// InheritanceClassB
		a1.m1();
		a1.m2();
		// a1.m3(); compilation error as inheriting from class InheritanceClassB

	}
}
