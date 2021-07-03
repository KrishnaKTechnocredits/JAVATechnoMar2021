package gauravk.Assignment_11_commBtwnClasses;

public class D {
	void m4() {
		System.out.println("static to non-static of different class = m3 of class C --> m4 method of class D");
		System.out.println("new D().m4()");
		m5();
	}
	
	static void m5() {
		System.out.println("non-static to static of same class = m4 of class D --> m5 method of class D");
		System.out.println("m5()");
		A.m6();
	}
}
