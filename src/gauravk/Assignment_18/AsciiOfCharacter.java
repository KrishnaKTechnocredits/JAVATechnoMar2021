package gauravk.Assignment_18;
import java.util.Scanner;
/*
 * After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment 18 : 14th April'2021
Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
 */
public class AsciiOfCharacter {
	
	int getAsciiOfChar(char ch) {
		return (int)ch;
	}
	
	public static void main(String [] a) {
		System.out.println("Type below any character to find out its actual ASCII number.");
		int asciiNum = new AsciiOfCharacter().getAsciiOfChar(new Scanner(System.in).next().charAt(0));
		System.out.println("The ASCII value is "+asciiNum);
	}

}
