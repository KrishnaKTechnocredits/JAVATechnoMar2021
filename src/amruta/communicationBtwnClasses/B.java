package amruta.communicationBtwnClasses;

public class B {
	void m2() {
		System.out.println("I am in B");
		System.out.println();
		C c1 = new C();
		c1.name= "Sonali";
		c1.m3();
	}
}
