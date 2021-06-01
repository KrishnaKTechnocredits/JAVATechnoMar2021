package technocredits.inheritanceEx;

public class B extends A{
	
	String x = "Hi" ;
	
	void display() {
		System.out.println(x); // 100
	}
	
	String m1(int y) {
		System.out.println(x);
		return "Hi";
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		b1.display();
	}
	
}
