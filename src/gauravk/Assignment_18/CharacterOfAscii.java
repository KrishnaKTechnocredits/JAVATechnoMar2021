package gauravk.Assignment_18;
import java.util.Scanner;
/*
 * After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment 18 : 14th April'2021
Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
 */
public class CharacterOfAscii {

	char getAsciiOfChar(int asciiValue) {
		return (char)asciiValue;
	}
	
	public static void main(String [] a) {
		System.out.println("Type below any ASCII value to find out its actual character.");
		char asciiChar = new CharacterOfAscii().getAsciiOfChar(new Scanner(System.in).nextInt());
		System.out.println("The character value is "+asciiChar);
	}
}
