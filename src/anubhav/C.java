package anubhav;

public class C{
	
	void m4(){
		System.out.println("C- Method m4");
		m5();
	}

	void m5(){
		System.out.println("C- Method m5");
		D.m6();
	}
}
