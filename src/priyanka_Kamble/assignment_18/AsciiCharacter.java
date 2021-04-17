package priyanka_Kamble.assignment_18;

import java.util.Scanner;

public class AsciiCharacter {
	
	int getAsciiOfChar(char character) {
		System.out.println("---------------------  Ascii Value for given Character --------------------- ");
		int ascii = (int) character; // TypyCasting converting Character Value to Integer
		if (ascii >= 97 && ascii <= 122)
			System.out.println("You have entered Lower Case Character '" + character +"'" + " ASCII Value is - " + ascii);
		else if (ascii >= 65 && ascii <= 90)
			System.out.println("You have entered Upper Case Character '" + character +"'"+ " ASCII Value is - " + ascii);
		else
			System.out.println("You have entered Special Character or Interger '" + character +"'"+ " ASCII Value is - " + ascii);
		return ascii;
	}

	char getChar(int asciiValue) {
		System.out.println("--------------------- Ascii Values for given Integer --------------------- ");
		char character = 'd';
		if (asciiValue >= 65 && asciiValue <= 90 || asciiValue >= 97 && asciiValue <= 122) {
			 character = (char) asciiValue; // typeCast
			System.out.println("For " + asciiValue + " Corresponding Asci Char is - " + character);
			return character;
		} else {
			System.out.println(" Please enter Value in Range (65- 90) OR (97-122) ");
			System.out.println(" Entered value is not a ascii value  for characters ");
			return character;
		}
	}

	void asciiOfAToZ() {
		System.out.println("---------------------  Asci Values from A to Z are --------------------- "); 
		for (int i = 65; i <= 90; i++)
			System.out.println((char) i + " - " + i);
	}

	void asciiLowerCase() {
		System.out.println("--------------------- Asci Values from 97 to 122 are --------------------- "); 
		for (int i = 97; i <= 122; i++)
			System.out.println( i + " - " +(char) i);
	}

	public static void main(String[] args) {
		AsciiCharacter ascii = new AsciiCharacter();
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("1) Enter Character to know the ASCII Value - "); String
		 input = scanner.next(); // char ch = input.charAt(0);
		 System.out.println("Character is -  " + input.charAt(0));
		 ascii.getAsciiOfChar(input.charAt(0));// ch
		 
		 System.out.println("2) Enter any Ascii value  - "); 
		 int asciInt = scanner.nextInt(); 
		 char ch= ascii.getChar(asciInt); //
		 //System.out.println("Corresponding Asci Char is - " +ch);
		
		ascii.asciiOfAToZ();
		ascii.asciiLowerCase();
		scanner.close();
	}
}
