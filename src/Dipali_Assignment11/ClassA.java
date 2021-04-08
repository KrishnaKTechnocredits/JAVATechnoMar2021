package Dipali_Assignment11;

public class ClassA {
	
	public void m1() {
		System.out.println("We are in ClassA non-static m1 method ");
		ClassB b=new ClassB();
		b.m2();
	}

	public static void main(String[] args) {
		ClassA a=new ClassA();
		a.m1();

	}	
}
