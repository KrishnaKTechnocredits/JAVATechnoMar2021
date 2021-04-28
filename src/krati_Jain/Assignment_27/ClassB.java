package krati_Jain.Assignment_27;

public class ClassB extends ClassA {

	int y = 30;
	int z = 40;
	
	void m2() {
		System.out.println("Class B m2 method");
	}
	
	void m3() {
		System.out.println("Class B m3 method");
	}
	
	public static void main() {
//		ClassA a1 = new ClassA(); //Case1
//		System.out.println(a1.x);
//		System.out.println(a1.y);
//		System.out.println(a1.z);//Case1 = CE
//		a1.m1();
//		a1.m2();
//		a1.m3(); //Case1 = CE
		
		ClassB b1 = new ClassB(); //Case2
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);//Case1 = CE
		b1.m1();
		b1.m2();
		b1.m3(); //Case2 = CE
	}
	
	
}
