package krishna.Assignment_18;

import java.util.Scanner;
/*
Program 1: Write a method which will return ASCII value of given character.
Hint: Method signature should be int getAsciiOfChar(char ch).
*/
public class AsciiValueReturn {

	int getAsciiOfChar(char ch) {
		int value = ch;
		return value;
	}

	public static void main(String[] args) {
		AsciiValueReturn asciiValueReturn = new AsciiValueReturn();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to enter the character:");
		int count = scanner.nextInt();
		
		for(int index=0;index<count;index++) {
		char ch;
		System.out.println("Enter the char :");
		
		ch = scanner.next().charAt(0);
		int value = asciiValueReturn.getAsciiOfChar(ch);
		System.out.println("Ascii value is of "+ch+" is " + value);
		System.out.println("--------------------------------");
		}
	}

}
