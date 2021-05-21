package krishna.Assignment_11;
	
public class CommMulClassesB {
	void m2() {
		System.out.println("Calling m2 non static method of class CommMulClassesB from main method");
		System.out.println();
		m3();
		System.out.println("Calling m3 static method of class CommMulClassesB from non static method m2");
		System.out.println();
	}
	
	static void m3() {
		System.out.println("Calling m3 static method of class CommMulClassesB from main method");
		System.out.println();
		CommMulClassesC commMulClassesC = new CommMulClassesC();
		commMulClassesC.m4();
	}
	
	
}
