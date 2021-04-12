package aashay.Array;

/*
 * 
Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2
 */

import java.util.Scanner;

public class FrequencyOfCharacter {
	
	void frequency(String text, char c) {
		int cnt=0;
		for(int i=0; i < text.length()-1; i++) {
			if(text.charAt(i)== c) {
				cnt++;
			}
		}
		System.out.println("Frequency of char "+c+" is: "+cnt);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text:");
		String text = scan.next();
		System.out.println("Enter the character to find its frequency:");
		char c =  scan.next().charAt(0);
		frequencyOfCharacter.frequency(text, c);
		scan.close();
		

	}

}
