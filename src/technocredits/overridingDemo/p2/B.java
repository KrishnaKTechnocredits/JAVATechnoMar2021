package technocredits.overridingDemo.p2;

import technocredits.overridingDemo.p1.ATechno;

public class B extends ATechno{
	private int y = 20;
	String x = "Techno";
	
	public void m1() {
		System.out.println("Hi");
		System.out.println(x); //100
		System.out.println(y);
	}
	
	
	static public void m2() {
		 System.out.println("2");
	}
	 
	
	public static void main(String[] args) {
		new B().m1();
		
		/*ATechno a1 = new B();
		System.out.println(a1.x);*/
	}
}
