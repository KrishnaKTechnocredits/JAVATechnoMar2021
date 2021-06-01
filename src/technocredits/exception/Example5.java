package technocredits.exception;

public class Example5 {
	void m1() {
		System.out.println("Hi"); //2
		new Example6().m2(); //3
		System.out.println(5);
	}

	public static void main(String[] args) throws ArithmeticException{
		try {
			new Example5().m1(); // 1
		}catch(NullPointerException ae) {
		}
		System.out.println("End");
	}
}
