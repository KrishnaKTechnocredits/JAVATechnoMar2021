package technocredits.arrayDemo;

public class Example7 {

	void m1(int x) {
		x = x + 10;
		System.out.println(x); // 110
	}
	
	public static void main(String[] args) {
		Example7 example7 = new Example7();
		int x = 100;
		example7.m1(x);
		System.out.println(x); //100
	}
}
