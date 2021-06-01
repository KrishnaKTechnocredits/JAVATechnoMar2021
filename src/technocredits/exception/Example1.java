package technocredits.exception;

public class Example1 {

	void m1(int y) {
		System.out.println(1);
		int x = 0;
		try {
			System.out.println(2);
			x = 10 / y;
			System.out.println(x);
		} 
		catch (ArrayIndexOutOfBoundsException ae) {
			x = 10 / (y + 10);
		}
		finally{
			System.out.println("techno");
		}
		System.out.println(x);

		try {
			int[] num = { 10, 20 };
			System.out.println(num[num.length]);
		} catch (ArithmeticException ae) {
			System.out.println("Hi");
		}
		System.out.println("Hello");
	}

	void m2(int y) {
		m1(y);
	}
	
	public static void main(String[] args) {
		new Example1().m2(0);
	}
} // stacktrace
