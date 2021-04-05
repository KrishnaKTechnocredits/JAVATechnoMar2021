package bhavana_assignment_11;

public class BClass {

	void m2() {
		System.out.println("Class B m2 method");
		BClass.m3();
	}
	
	static void m3() {
		System.out.println("Class B m3 method");
		CClass cclass=new CClass();
		cclass.m4();
	}
}
