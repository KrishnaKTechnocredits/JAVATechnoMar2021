package gauravk.Assignment_11_commBtwnClasses;

public class B {
	void m2() {
		System.out.println("non-static to non-static of different class = m1 of class A --> m2 method of class B");
		System.out.println("new B().m2()");
		C.m3();
	}

}
