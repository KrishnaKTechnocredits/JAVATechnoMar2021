package sourabh.communicationBtwClasses;

public class B {
		void m2() {
		System.out.println("We are in Class B and m2 method");
		B.m3();
	}
	 static void m3() {
		System.out.println("We are in Class B and m3 method");
		C c=new C();
		c.m4();
	 }
}
