package neha_Patil.Neha_Assignment_11;

public class B {
	void m2(){
		System.out.println("This is the O/p of  method m2 of class B");
		B.m3();
	}
	public static void  m3() {
		System.out.println("This is the O/p of  method m3 of class B");
		C c= new C();
		c.m4();
	}

}
