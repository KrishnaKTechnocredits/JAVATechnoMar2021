package anubhav.StringOperations;

import java.util.Scanner;

/*Find the frequency of character from a given String array.
Note: Take String and character from the user.
Input : technocredits
char : e
output : e -> 2*/

public class FrequencyOfCharacters {

int count;

	String originalString;
	char targetCh;
	void frequency() {
		count=0;
		int originalStringLength=originalString.length();
		
		for (int index=0; index<originalStringLength; index++) {
			if (originalString.charAt(index)== targetCh)
				count++;
		}
			System.out.println("Frequency of character " + targetCh + " in the string " + originalString + " is : " + count);	
	}
	
	public static void main (String[] args) {
		
		FrequencyOfCharacters frequencyOfCharacters= new FrequencyOfCharacters();
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String inputString= scanner.nextLine();
		inputString=inputString.toUpperCase();
		
		System.out.println("Enter character to check frequency : ");
		String charaterToCheckFreq= scanner.next();
		charaterToCheckFreq=charaterToCheckFreq.toUpperCase();
		char targetChar=charaterToCheckFreq.charAt(0);
		
		frequencyOfCharacters.originalString= inputString;
		frequencyOfCharacters.targetCh=targetChar;
		frequencyOfCharacters.frequency();
		scanner.close();
	}
}
