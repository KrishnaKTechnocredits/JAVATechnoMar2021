package anubhav.asciivalueprograms;

import java.util.Scanner;

public class ReturnAsciiValue{
	
/*Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)*/
	
	
	int getAsciiOfChar(String input){
		char ch= input.charAt(0);
		int ascii1= (int)ch;
		return ascii1;
	}
	
/*Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)*/
	
	char getCharOfAscii(int input){
		char character= (char)input;
		return character;
	}

	public static void main (String[] args){
		
		ReturnAsciiValue asciiValue = new ReturnAsciiValue();
		Scanner scanner= new Scanner(System.in);
		
		// Char to ASCII
		System.out.println("Enter character   :");
		String inputCharacter = scanner.next();
		int number= asciiValue.getAsciiOfChar(inputCharacter);
		System.out.println("The ASCII value of entered character is  : "+ number);
		
		//ASCII to Char
		System.out.println("Enter ASCII Value : ");
		int ascii = scanner.nextInt();
		char ch= asciiValue.getCharOfAscii(ascii);
		System.out.println("The character for entered ASCII value is : "+ ch);
		scanner.close();
	}
}
