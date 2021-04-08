package ravindra_J.Assignment_No_11;

public class A {
	
	 void m1() {
		 System.out.println("Calling non static method m2 using object of m2 method class in non static method m1 of different class");
		 B b = new B();
		 b.m2();
		 
	 }
	
	public static void main(String []args) {
		
		A a = new A();
		a.m1();
		

	}
}
