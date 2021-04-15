package kajal.ScannerExamples;

import java.util.Scanner;

public class Assignment16 {


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
		
		Assignment16 frequencyOfCharacter = new Assignment16();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text:");
		String text = scanner.next();
		System.out.println("Enter the character to find its frequency:");
		char c =  scanner.next().charAt(0);
		frequencyOfCharacter.frequency(text, c);
	}
}