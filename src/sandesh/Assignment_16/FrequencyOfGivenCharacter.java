package sandesh.Assignment_16;

import java.util.Scanner;

public class FrequencyOfGivenCharacter {

	int getCharacterFrequencyFromString(String strProcessing, char chProcessing) {
		int countOfChar = 0;
		for(int index=0; index<strProcessing.length(); index++) {
			if(Character.toLowerCase(chProcessing) == strProcessing.toLowerCase().charAt(index))
				countOfChar++;
		}
		return countOfChar;
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter any string --> ");
		String strInput = sc1.nextLine();
		System.out.print("Enter character for finding it's frequency--> ");
		char chInput = sc1.next().charAt(0);
		int frequencyOfChar = new FrequencyOfGivenCharacter().getCharacterFrequencyFromString(strInput, chInput);
		System.out.println("Character '" + chInput + "' appears " + frequencyOfChar + " times in string '" + strInput + "'");
		sc1.close();
	}
}
