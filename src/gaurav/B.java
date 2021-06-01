package gaurav;

public class B {
	public void m2(){
		System.out.println("B method m2");
		B.m3();
	}
	
	public static void m3(){
		System.out.println("B method m3");
		C objC = new C();
	    objC.m4();
	}
     
}
