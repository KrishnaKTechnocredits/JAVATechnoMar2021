package krishna.Assignment_18;

import java.util.Scanner;
/*Program 2:  Write a method which will return character of given ASCII value.
Hint: Method signature should be char getAsciiOfChar(int asciiValue). 
*/
public class CharReturnAsciiValue {
	char getAsciiOfChar(int asciiValue) {
		char ch = (char) asciiValue;
		return ch;
	}

	public static void main(String[] args) {
		CharReturnAsciiValue charReturnAsciiValue = new CharReturnAsciiValue();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to enter the value for ASCII char :");
		int count = scanner.nextInt();
		
		for (int index = 0; index < count; index++) {
			int asciiValue;
			System.out.println("Enter the value for ASCII char :");
			int Value = scanner.nextInt();
			char ch = charReturnAsciiValue.getAsciiOfChar(Value);
			System.out.println("Ascii character for value "+Value+" is " +ch);
			System.out.println("--------------------------------");
		}
		
	}
}
