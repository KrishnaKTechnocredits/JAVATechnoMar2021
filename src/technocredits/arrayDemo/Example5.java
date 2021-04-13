package technocredits.arrayDemo;

public class Example5 {
	
	void m1(int x) {
		x = 10;
		System.out.println(x); //10
	}
	
	void m2(int[] num) {
		num[0] = 100;
	}
	
	public static void main(String[] args) {
		Example5 example5 = new Example5();
		int x = 1;
		example5.m1(x);
		System.out.println(x); // 1
		
		int[] num = {10,20};
		example5.m2(num);
		System.out.println(num[0]); //
	}
}
