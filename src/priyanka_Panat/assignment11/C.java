package priyanka_Panat.assignment11;

public class C {
	void m4() {
		System.out.println("In Non-Static Method m4 from Class C");
		m5();
	}
	
	void m5(){
		System.out.println("In Non-Static Method m5 from Class C");
		D.m6();
	}
}
