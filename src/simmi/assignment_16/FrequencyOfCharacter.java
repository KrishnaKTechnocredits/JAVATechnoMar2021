/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2*/


package simmi.assignment_16;

import java.util.Scanner;

public class FrequencyOfCharacter {
	String str;
	char ch;
	int count =0;
	
	void getFrequencyOfCharacter(String str,char ch) {
		//int length = str.length();
		//str = str.toUpperCase();
		//targetChar = Character.toUpperCase(targetChar);
		for(int index = 0; index<str.length();index++) {
			if(str.charAt(index)==ch)
				count++;
		}
		System.out.println(ch + " in " +str+ " is " + count + " times");
	}
	
	public static void main(String[] args) {
		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the string");
		String str = scanner.nextLine();
		System.out.println(" Enter the character to check the repetition");
		char ch = scanner.next().charAt(0);
		frequencyOfCharacter.getFrequencyOfCharacter(str,ch);
		scanner.close();
	}

}
