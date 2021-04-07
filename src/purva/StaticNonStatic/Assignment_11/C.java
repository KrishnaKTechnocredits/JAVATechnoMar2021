package purva.StaticNonStatic.Assignment_11;

public class C {
	
	void m4() {
		System.out.println("In non static method m4");
		m5();
	}
	
	void m5() {
		System.out.println("In non static method m5");
		D.m6();
	}

}
