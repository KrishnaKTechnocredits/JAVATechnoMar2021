/*Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch).*/
package ravindra_J.Assignment_No_18_AsciiValueOperations;

import java.util.Scanner;

public class CharOfAsciiValue {

	static int getAsciiOfChar(char c) {
		return c;
	}
	public static void main(String[] args) {
		
		Scanner	scanner = new Scanner(System.in);
		System.out.println("Please enter the character");
		String str =scanner.next();
		char ch = str.charAt(0);
		System.out.println(getAsciiOfChar(ch)+ " : is the ASCII value representing given character :"+ch);
		scanner.close();
		}
	

}
