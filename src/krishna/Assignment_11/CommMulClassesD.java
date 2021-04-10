package krishna.CommMulClasses;

public class CommMulClassesD {
	static void m6() {
		System.out.println("calling static method m6 of class CommMulClassesD from non static method m5 from class CommMulClassesC");
		System.out.println();
		m7();
	}
	
	static void m7() {
		System.out.println("calling m7 method from m6 of same class CommMulClassesD");
		System.out.println();
		CommMulClassesA commMulClassesA= new CommMulClassesA();
		System.out.println("calling static method m1 of class CommMulClassesA from non static method m7 from class CommMulClassesD");
		System.out.println();
		commMulClassesA.m1();
		
	}
}
