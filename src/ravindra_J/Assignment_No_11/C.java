package ravindra_J.Assignment_No_11;

public class C {
	
	 void m4() {
		 System.out.println("Calling non static method m5 directly in non static method m4 of same class ");
		 m5();
	 }
	
	 void m5() {
		 System.out.println("Calling static method m6 by class name in non static method m5 of different class ");
		 D.m6();
	 }
}
