package radha.Assignment14;

import java.util.Scanner;

public class SwitchScanner {
		char alphabet;
		
		void isVowel(char input) {
			input = Character.toUpperCase(input);
			switch(input) {
			case 'A':
				System.out.println(input+" is a vowel");
				break;
				
			case 'E':
				System.out.println(input+" is a vowel");
				break;
				
			case 'I':
				System.out.println(input+" is a vowel");
				break;
			
			case 'O':
				System.out.println(input+" is a vowel");
				break;
				
			case 'U':
				System.out.println(input+" is a vowel");
				break;
				
			default:
				System.out.println(input+" is not a vowel.");
			}
		}
		
		public static void main(String[] args) {
			SwitchScanner switchScan = new SwitchScanner();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter an alphabet to check if it is a vowel or not: ");
			char input = scanner.next().charAt(0);
			switchScan.isVowel(input);
			scanner.close();
		}
}
