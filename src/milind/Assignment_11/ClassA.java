package milind.Assignment_11;

public class ClassA {
	
	void m1() {
		System.out.println("called Method m1");
		ClassB classB=new ClassB();
		classB.m2();
	}
	
	public static void main(String[] a) {
		ClassA classA=new ClassA();
		classA.m1();
	}

}
