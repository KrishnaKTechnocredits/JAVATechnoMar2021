package milind.Assignment_11;

public class ClassB {
	void m2() {
		System.out.println("called Method m2");
		ClassB.m3();
	}
	
	static void m3() {
		System.out.println("Called static Method m3");
		ClassC classC=new ClassC();
		classC.m4();
	}
}
