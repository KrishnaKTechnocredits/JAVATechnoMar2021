package renuka.assignment11;

public class C {
	
	void m4() {
		m5();
		System.out.println("Inside M4 non static method,We are calling M5 non static method of same class");	
	}
	
	void m5() {
		D.m6();
		System.out.println("Inside M5 non static method,We are calling M6 static method of ClassD");
	}

}
