package gauravk;

import java.util.Scanner;

public class FrequencyOfCharacter {
	
	//String word;
	//char c;
	
	void frequencyCheck(String name, char ch) {
		int counter = 0;
		for (int i=0; i<name.length(); i++) {
			if(ch==name.charAt(i)) {
				counter = counter + 1;
			}
		}
		if(counter != 0)
			System.out.println("Character "+ch+ " appeared "+counter+" times in the word "+name);
		else System.out.println("Character "+ch+" does not appear anywhere in the word "+name);
	}
	
	public static void main(String[] args) {
		System.out.println("Type any word: ");
		String word = new Scanner(System.in).nextLine();
		System.out.println("Type a character to find its frequency in the word:");
		String str = new Scanner(System.in).nextLine();
		char c = str.charAt(0);
		FrequencyOfCharacter frequencyOfCharacter1 = new FrequencyOfCharacter();
		frequencyOfCharacter1.frequencyCheck(word, c);
	}
}
