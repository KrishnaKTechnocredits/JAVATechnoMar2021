package anubhav;

public class B{
	
	void m2(){
		System.out.println("B- Method m2");
		m3();
	}
	
	static void m3(){
		System.out.println("B- Static method m3");
		C c= new C();
		c.m4();
	}

}
