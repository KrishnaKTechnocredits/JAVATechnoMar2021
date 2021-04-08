package bhavana_assignment_11;

public class AClass {

	void m1() {
		
		System.out.println("Class A m1 method");
		BClass bclass=new BClass();
		bclass.m2();
	}
	
	public static void main(String[] args) {
		AClass aclass=new AClass();
		aclass.m1();
	}
}


