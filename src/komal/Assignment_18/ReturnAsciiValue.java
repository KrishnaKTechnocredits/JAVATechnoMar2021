package komal.Assignment_18;

import java.util.Scanner;

/*
Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)

Program 3:  write a method which will print ascii value of A to Z.
Program 4:  write a program which will print characters between ascii value 97 to 122.
*/
public class ReturnAsciiValue {
	int getAsciiValue(char ch) {
		int asciiValue = ch;
		return asciiValue;
	}
	char getAsciiOfChar(int asciiValue) {
		char ch = (char)asciiValue;
		return ch;
	}
	void getAsciiValueFromAtoZ() {
		for(char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			int num = (int) ch1;
			System.out.println("ASCII Value Of " + ch1 + " is : " + num);
		}
	}

	void getAsciiValueForNum() {
		for (int num = 97; num <= 122; num++) {
			char ch1 = (char)num;
			System.out.println("ASCII Value of " + num + " is : " + ch1);
		}
	}
		public static void main(String[] args) {
			ReturnAsciiValue returnAsciiValue = new ReturnAsciiValue();
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter any character to find ASCII Value");
			char character = sc.next().charAt(0);
			int findAsciiValue = returnAsciiValue.getAsciiValue(character);
			System.out.println("ASCII Value of given character is " + findAsciiValue);
			System.out.println("----------------------------------------------------");
			System.out.println("Enter any number to find ASCII Value ");
			int number = sc.nextInt();
			char findChar = returnAsciiValue.getAsciiOfChar(number);
			System.out.println("Character for given ASCII Value is " + findChar);
			System.out.println("------------------------------------------------");
			System.out.println("ASCII Value for character starting from A to Z is");
			returnAsciiValue.getAsciiValueFromAtoZ();
			System.out.println("--------------------------------------------------");
			System.out.println("ASCII Value for numbers starting from 97 to 122 is : ");
			returnAsciiValue.getAsciiValueForNum();
			sc.close();
	}
}
