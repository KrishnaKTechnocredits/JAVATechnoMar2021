package technocredits.exception;

public class TernaryOperatorDemo {

	String m1(int num) {
		if(num > 10)
			return "Hi";
		else
			return "Hello";
	}
	
	void m2(int num) {
		String temp = num > 10 ? "Hi" : "Hello";
		System.out.println(temp);
	}
	
	
	
}
