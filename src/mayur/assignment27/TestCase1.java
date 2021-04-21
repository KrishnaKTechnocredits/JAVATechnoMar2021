package mayur.assignment27;

public class TestCase1 {
	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); as z is not available with  ClassA
		a1.m1();
		a1.m2();
		// a1.m3(); as m3 method is not available with ClassA
	}
}
