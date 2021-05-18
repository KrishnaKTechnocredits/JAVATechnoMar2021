package mayur.assignment27;

public class TestCase6 {
	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		ClassB b1 = new ClassB();
		// b1=a1; compilation error parent class cannot fit into child class
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); compilation error as ClassA do not have
		// variable z
		a1.m1();
		a1.m2();
		// a1.m3(); compilation error as method is inheriting from ClassB
	}
}
