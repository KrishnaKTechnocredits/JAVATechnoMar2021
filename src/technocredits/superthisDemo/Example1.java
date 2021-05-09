package technocredits.superthisDemo;

public class Example1 {
	//static int x = 10;
	static {
		System.out.println(1);
	}
	
	{
		System.out.println(2);
	}
	
	Example1(){
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		Example1 example2 = new Example1();
		
	}
}
