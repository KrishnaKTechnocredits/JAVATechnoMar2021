package mayur.assignment27;

public class TestCase3 {
	public static void main(String[] args) {
	ClassA a1 = new ClassB();
	System.out.println(a1.x);
	System.out.println(a1.y);
	// System.out.println(a1.z); ClassA do not have variable A and compiler can check only reference.
	a1.m1();
	a1.m2();
	// a1.m3(); ClassA do not have any method name m3() and compiler can check it only for reference.
}
}
