/*
 WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
 
 input: globant india test automation engineer
 
 output: glbnt nd tst tmtn ngnr
 */
package radha.CodingTest3;

import java.util.Scanner;

public class StringWithoutVowels {
	
	String getStringWithoutVowels(String str) {
		String temp = "";
		for(int index=0; index < str.length();index++) {
			if(!isVowel(Character.toLowerCase(str.charAt(index)))){
				temp += str.charAt(index);
			}
		}
		return temp;
	}
	
	boolean isVowel(char ch) {
		String vowel = "aeiou";
		for(int i=0; i < 5; i++) {
			if(ch == vowel.charAt(i)) {
				return true;
			}
		}	
		return false;
	}

	public static void main(String[] args) {
		StringWithoutVowels stringWithoutVowels = new StringWithoutVowels();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String input = sc.nextLine();
		
		String output = stringWithoutVowels.getStringWithoutVowels(input);
		System.out.println("String without vowels is \n"+output);
		sc.close();
	}
}
