package krishna.Assignment_11;

public class CommMulClassesA {
	void m1() {
		System.out.println("Calling m1 non static method from main method");
		System.out.println();
		
	}
	public static void main(String[] args) {
		CommMulClassesA commMulClassesA = new CommMulClassesA();
		commMulClassesA.m1();
		CommMulClassesB commMulClassesB = new CommMulClassesB();
		commMulClassesB.m2();
		CommMulClassesB.m3();

	}

}
