package gaurav;

public class C {
	public void m4()
	{
		System.out.println("c method m4");
		C objC = new C();
		objC.m5();
	}
	
	public void m5()
	{
		System.out.println("c method m5");
		D.m6();
	}

}
