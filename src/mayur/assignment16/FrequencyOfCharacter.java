package mayur.assignment16;

import java.util.Scanner;

public class FrequencyOfCharacter {
	
	void getCharFrequency(String str, char letter) {
		int count = 0;
		str = str.toLowerCase();
		char ch = Character.toLowerCase(letter);
		for(int index = 0; index<str.length();index++) {
			if(str.charAt(index)==letter) {
				count++;
			}
		}
		System.out.println("Frequency of " + "letter" + "is: " +count );
	
	}
	
	public static void main(String[] args) {
		FrequencyOfCharacter frequencyOfChar = new FrequencyOfCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.nextLine();
		System.out.println("Enter the character  ");
		char letter = scanner.next().charAt(0);
		frequencyOfChar.getCharFrequency(str, letter);
		scanner.close();
		
	}
}
