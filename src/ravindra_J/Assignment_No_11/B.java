package ravindra_J.Assignment_No_11;

public class B {
	
	 void m2() {
		// System.out.println("Calling static method m3 directly in non static method m2 of same class ");
		 m3();
		 
	 
	 }
	
	 static void m3() {
		 System.out.println("Calling non static method m4 using object of class of m4 method in static method m3 of different class ");
		 C c = new C();
		 c.m4();
		 
	 }
	
}
