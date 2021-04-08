package gaurav;

public class A{
	void m1(){
		System.out.println("A method m1");
		B objB = new B();
		objB.m2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = new A();
		objA.m1();
	}

}
