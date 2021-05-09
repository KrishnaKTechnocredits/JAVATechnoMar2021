package technocredits.superthisDemo;

public class Child extends Parent{
	{
		System.out.println("Child block");
		m1();
	}
	
	String m1() {
		return "Vaibhav";
	}
	
	Child(){
		super();
		System.out.println("Child Default");
		String msg = m1();
	}
	
	Child(int x){
		super();
		System.out.println("Child Default");
		m1();
	}
	
	Child m2() {
		Child c1 = new Child();
		System.out.println("Hi");
		return c1;
	}
	
	public static void main(String[] args) {
		Child child = new Child();
	}
}
