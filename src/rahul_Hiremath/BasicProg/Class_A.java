package rahul_Hiremath.BasicProg;

public class Class_A {
	void m1()
	{
		System.out.println("In class-A, m1");
		Class_B class_b = new Class_B();
		class_b.m2();
	}
	
	public static void main(String[] args) {
		Class_A class_A = new Class_A();
		class_A.m1();
	}

}
