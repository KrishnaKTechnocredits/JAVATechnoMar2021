package gauravk.Assignment_11_commBtwnClasses;

public class C {
	static void m3() {
		System.out.println("non-static to static of different class = m2 of class B --> m3 method of class C");
		System.out.println("C.m3()");
		new D().m4();
	}
}
