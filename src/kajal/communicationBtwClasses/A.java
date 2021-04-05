package kajal.communicationBtwClasses;

public class A {

	void m1() {
		System.out.println("I am in Nonstatic method m1 of class A");
		B b = new B();
		b.m2();
		
	}
	
	public static void main(String [] args) {
		
		System.out.println("I am in main method, execution will start from here..");
		A a1 = new A();
		a1.m1();
		}
}
