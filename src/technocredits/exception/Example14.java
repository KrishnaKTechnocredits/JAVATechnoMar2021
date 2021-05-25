package technocredits.exception;

public class Example14 {

	static void m1() {
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		try {
			m1();
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
	}
}
