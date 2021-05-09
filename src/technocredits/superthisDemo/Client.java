package technocredits.superthisDemo;

import java.util.Arrays;

public class Client {
	int x = 10;
	
	
	void m1() {
		System.out.println(this); // MA
	}
	
	static void m2() {
		//System.out.println(this);
	}
	
	public static void main(String[] args) {
		Client c1 = new Client();
		/*//System.out.println(c1); // MA
		Client c2 = new Client();
		//System.out.println(c2); // MA
		c2.m1();
		c1.m1();*/
		System.out.println(10);
		c1.m1();
		
		int[] x = {10,20,30};
		String temp = Arrays.toString(x);
		System.out.println(temp.charAt(0));
		
	}
}
