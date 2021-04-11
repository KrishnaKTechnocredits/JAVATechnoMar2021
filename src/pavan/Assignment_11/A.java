package pavan.Assignment_11;

public class A{
	void m1(){
		System.out.println("This is the O/p of non static Method m1 of class A");
		B method2= new B();
		method2.m2();
	}
	public static void main(String[]Args){
		A a= new A();
		a.m1();	
	}
}
