package sourabh.communicationBtwClasses;

public class C {
	void m4() {
		System.out.println("We are in Class C and m4 method");
		C c= new C(); 
		c.m5();
	}
	void m5() {
		System.out.println("We are in Class C and m5 method");		
		D.m6();
	}
}
