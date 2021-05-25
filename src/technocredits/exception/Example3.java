package technocredits.exception;

import java.util.InputMismatchException;

public class Example3 {

	void exceptionEx() {
		try {
			System.out.println("1");
			int[] num = {1,2};
			System.out.println(num[2]);
		}catch(StringIndexOutOfBoundsException ae) {
			
		}catch(RuntimeException se) {
			
		}/*catch(ArrayIndexOutOfBoundsException re) {
			
		}*/ // CE : It should follow child parent hierarchy
	}
	
	
	public static void main(String[] args) {
		
	}
}

