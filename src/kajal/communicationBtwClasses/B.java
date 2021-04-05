package kajal.communicationBtwClasses;

public class B {

	void m2(){
		System.out.println("I am in Nonstatic method m2 of class B");
		B.m3();		
		
	}

	static void m3(){
		System.out.println("I am in Static method m3 of class B");
		C c1 = new C();
		c1.m4();		
		
	}
}
