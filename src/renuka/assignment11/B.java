package renuka.assignment11;

public class B {
	
	void m2() {	
		m3(); //ClassB.m3; can also use
		System.out.println("Inside M2 non static method,We are calling M3 static method of same Class");
		
	}
	
	static void m3() {
		C c1 = new C();
		c1.m4();
		System.out.println("Inside M3 static method,We are calling M4 non static method of ClassC");	
	}

}
