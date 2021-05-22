package technocredits.exception;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Pub {

	void isEntryAllowed(int age) throws AgeNotValidateException {
		if(age >=18)
			System.out.println("Welcome sir");
		else {
			System.out.println("let me call you momma !!!");
			throw new AgeNotValidateException("User age is " + age + ", minimum required age is 18."); 
		}
	}
	
	void loadUrl(String url) {
		if(url.startsWith("http"))
			System.out.println("Load");
		else
			throw new NullPointerException();
	}
	
	int getNumber(int num) throws FileNotFoundException{
		int x = 1000;
		if(num > 0)
			x = x/num;
		else {
			throw new ArithmeticException();
		}
		return x;
	}

	void m1() {
		throw new InputMismatchException();
	}
	
	public static void main(String[] args) {
		Pub pub = new Pub();
		try {
			pub.isEntryAllowed(14);
		} catch (AgeNotValidateException e) {
			System.out.println(e);
		}
		
	}
}
