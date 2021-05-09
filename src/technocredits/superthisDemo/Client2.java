package technocredits.superthisDemo;

public class Client2 {
	int x = 10;
	
	void m1() {
		System.out.println(this); // MA
	}
	
	public static void main(String[] args) {
		Client2 c1 = new Client2();
		//System.out.println(c1); // MA
		Client2 c2 = new Client2();
		//System.out.println(c2); // MA
		c2.m1();
		c1.m1();
	}
}
