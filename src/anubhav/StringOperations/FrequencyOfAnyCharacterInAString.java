package anubhav.StringOperations;

import java.util.Scanner;

/*a) Find one character frequency from given name.
     Input: name - technocredits
     character - e
     Output : e -> 2 time in technocredits*/

public class FrequencyOfAnyCharacterInAString {
	
	String input;
	char targetCharacter;
	
	void freqOfChar () {
		int freqOfCharacter= 0;
		int length= input.length();
		for (int index=0; index<length; index++) {
			char z= input.charAt(index);
			if (targetCharacter==z)
				freqOfCharacter++;
		}
		System.out.println("Frequency of character " + targetCharacter + " in string " + input + " is : " +freqOfCharacter);
	}

	public static void main(String[] args) {
		FrequencyOfAnyCharacterInAString frequencyOfAnyCharacterInAString = new FrequencyOfAnyCharacterInAString();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the string :");
		String str= scanner.nextLine();
		str= str.toUpperCase();		
		System.out.println("Enter character to check frequency :");
		String charToCheck= scanner.next();
		charToCheck=charToCheck.toUpperCase();
		char ch= charToCheck.charAt(0);
		frequencyOfAnyCharacterInAString.input=str;
		frequencyOfAnyCharacterInAString.targetCharacter= ch;
		frequencyOfAnyCharacterInAString.freqOfChar();	
		//int frequency= frequencyOfAnyCharacterInAString.freqOfChar();
		//System.out.println("Frequency of character " + frequencyOfAnyCharacterInAString.targetCharacter + " in string " + frequencyOfAnyCharacterInAString.input + " is : " +frequencyOfAnyCharacterInAString.freqOfChar());
		scanner.close();
	}
}
