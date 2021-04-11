package ashtha.Assignment16;

import java.util.Scanner;

public class CharacterFrequency {
	
	void frequencyOfCharacter(String input, char targetChar) {
		int count = 0;
		int length = input.length();
		for(int index = 0;index <length;index++)			
			if(input.charAt(index) == targetChar)
				count++;
			System.out.println("The frequency of character "+targetChar +" in "+input +" is "+count);				
	}
	
	public static void main(String[] args) {
		CharacterFrequency charaterFrequency = new CharacterFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputString = scanner.next().toUpperCase();
		System.out.println("Enter the target character");
		char targetCharacter = scanner.next().charAt(0);
		targetCharacter = Character.toUpperCase(targetCharacter);
		charaterFrequency.frequencyOfCharacter(inputString,targetCharacter);
		scanner.close();
	}
}
