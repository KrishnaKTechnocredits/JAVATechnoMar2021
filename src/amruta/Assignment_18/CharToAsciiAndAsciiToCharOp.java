/*  Assignment 18 : 14th April'2021

Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
 
Program 3: write a method which will print ascii value of A to Z.

Program 4: write a program which will print characters between ascii value 97 to 122.

*/

package amruta.Assignment_18;

import java.util.Scanner;

class CharToAsciiAndAsciiToCharOp{
	
//--------- Write a method which will return ascii value of given character.-----------------//
	
	int getAsciiValue(char ch){
				
		System.out.println("------------------------------------------------");
		
		int asciichar = (int)ch; 	// Type Casting converting char to int,  so int value will compare with ascii values
		
		if (asciichar >= 97 && asciichar <= 122)
			System.out.println("You have entered Lower Case Character '" + ch +"'" + " ASCII Value is - " + asciichar);
		else if (asciichar >= 65 && asciichar <= 90)
			System.out.println("You have entered Upper Case Character '" + ch +"'"+ " ASCII Value is - " + asciichar);
		else
			System.out.println("You have entered Special Character or Interger '" + ch +"'"+ " ASCII Value is - " + asciichar);
		
		return asciichar;	

	} 

//---------Write a method which will return character of given Ascii value.-----------------//	
	
	char getCharacter(int num){
		
		System.out.println("------------------------------------------------");
		
		char character = (char)num;  // Type Casting converting int to char, so char value will compare with ascii values
		
		if (character >= 65 && character <= 90 || character >= 97 && character <= 122) {
			
			System.out.println("For " + num + " Ascii value corresponding Character is - " + character);
		} else {
			System.out.println(" Please enter Value in between Range of (65- 90) OR (97-122) ");
			System.out.println(" Entered value is not a ascii value  for characters ");

		}
		
		return character;	
	} 
	
//--------- write a program which will print characters between ascii value 97 to 122.-----------------//
	
	void getCharacterof97to122(){	
		for(int num = 97; num <= 122; num++){	
			char ch = (char)num;
			System.out.println("Ascii value of character "+num+ " is : " +ch);
		}
	} 
	
//---------write a method which will print ascii value of A to Z.-----------------//
	
	void getAsciivalueofChar(){
		for(char ch = 'A'; ch <= 'Z'; ch++){	
			int num = (int)ch;
			System.out.println("Ascii value of character "+ch+ " is : " +num);
		}
	} 
	
	public static void main(String[] args){
		CharToAsciiAndAsciiToCharOp value = new CharToAsciiAndAsciiToCharOp();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1) Enter Character to know the ASCII Value - "); 
		 
		String	 input = scanner.next(); 
		char ch = input.charAt(0);
		 
		int no = value.getAsciiValue(ch);
		// value.getAsciiValue(input.charAt(0));// instead of ch
		//System.out.println("Corresponding Asci Value is - " +no);
		 
		System.out.println("\n2) Enter any Ascii value to know the Character - "); 
		int asciInt = scanner.nextInt(); 
		char charvalue = value.getCharacter(asciInt); //
		//System.out.println("Corresponding Asci Char is - " +charvalue);
		
		System.out.println("\n---------Character of Ascii Values from 97 to 122--------------\n");
		value.getCharacterof97to122();
		System.out.println("\n---------Ascii values of Character from A to Z--------------\n");
		value.getAsciivalueofChar();
		scanner.close();	
	}
}

