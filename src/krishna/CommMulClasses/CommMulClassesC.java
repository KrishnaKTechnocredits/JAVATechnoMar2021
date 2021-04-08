package krishna.CommMulClasses;

public class CommMulClassesC {
	void m4() {
		System.out.println("Calling m4 non static method of class CommMulClassesC from static method m3 of class CommMulClassesB");
		System.out.println();
		m5();
	}
	
	void m5() {
		System.out.println("Calling m5 non static method  from non static method m4 of same class CommMulClassesC");
		System.out.println();
		CommMulClassesD.m6();
	}
}
