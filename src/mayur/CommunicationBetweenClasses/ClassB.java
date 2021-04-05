package mayur.CommunicationBetweenClasses;

public class ClassB {
	void m2() {
		System.out.println("This is Static m2 method of Class B");
		m3();
	}

	static void m3() {
		System.out.println("This is Static m3 method of Class B");
		ClassC c=new ClassC();
		c.m4();
	}	

}

