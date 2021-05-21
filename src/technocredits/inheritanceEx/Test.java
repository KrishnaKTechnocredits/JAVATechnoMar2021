package technocredits.inheritanceEx;

public class Test {

	public static void main(String[] args) {
		/// case 1 : 
		A a1 = new A();
		System.out.println(a1.x);
		// System.out.println(a1.z); [reason : Class A doesnt have variable z]
		A a2 = new B();
	
		A a = new B();
		B b = new B();
		
		b = (B)a;
		// B b = new B();
		System.out.println(b.x);
		
		B child = (B)new A();
		System.out.println(child.m1(10));
	}
}
