package priyanka_Kamble.Assignment_16;

/*
 * Assignment - 16 : 9th April'2021
 * 
Find the frequency of character from a given String array.
Note: Take String and character from the user using scanner class.

Input : technocredits
char : e
 */
import java.util.Scanner;

public class FrequencyOfChar {
	static String str;
	static char ch;

	String inputString(String str) {
		//str = str.toUpperCase();
		// str.length();
		System.out.println("Input String Name : " + str.toUpperCase());
		return str;
	}

	static void compare(String str, char character) {
		//character = Character.toUpperCase(character);
		System.out.println("Character to be searched : " + Character.toUpperCase(character));
		int count=0;
		for (int index=0; index<str.length();index++) {
			if (String.valueOf(character).equals(String.valueOf(str.charAt(index)))) 
				count++;
		}
		System.out.println(character +" occurs " +count+ " time/times in String " +str);
	}
	
	public static void main(String[] args) {
		FrequencyOfChar fr = new FrequencyOfChar();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the String - ");
		str = fr.inputString(sc.nextLine());
		System.out.println("Enter the character you want to Search - ");
		char character =sc.next().charAt(0);
		FrequencyOfChar.compare(str, character);
		sc.close();
	}
}
