package radha.Assignment11;

public class Two {
	
	void m2() {
		System.out.println("This is method m2 of class Two.");
		Two.m3();
	}
	
	static void m3() {
		System.out.println("This is static method m3 of class Two.");
		Three three = new Three();
		three.m4();
	}
}
