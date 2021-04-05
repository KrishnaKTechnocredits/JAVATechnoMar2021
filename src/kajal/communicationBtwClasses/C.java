package kajal.communicationBtwClasses;

public class C {

	void m4(){
		System.out.println("I am in Nonstatic method m4 of class C");
		m5();		
		
	}

	void m5(){
		System.out.println("I am in Nonstatic method m5 of class C");
		D.m6();		
		
	}
}
