package radha.Assignment14;

import java.util.Scanner;

public class SwitchScanner {
		char alphabet;
		
		void isVowel() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter an alphabet to check if it is a vowel or not: ");
			String str =scanner.next();
			char input = str.charAt(0);
			switch(input) {
			case 'A':
			case 'a':
				System.out.println(input+" is a vowel");
				break;
				
			case 'E':
			case 'e':
				System.out.println(input+" is a vowel");
				break;
				
			case 'I':
			case 'i':
				System.out.println(input+" is a vowel");
				break;
			
			case 'O':
			case 'o':
				System.out.println(input+" is a vowel");
				break;
				
			case 'U':
			case 'u':
				System.out.println(input+" is a vowel");
				break;
				
			default:
				System.out.println(input+" is not a vowel.");
			}
		}
		
		public static void main(String[] args) {
			SwitchScanner switchScan = new SwitchScanner();
			switchScan.isVowel();

		}

}
