package renuka.assignment14;

import java.util.Scanner;

//Program 1:  Write Assignment- 13 Using scanner class. 

public class ScannerVowel {
	
	void vowel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to check Vowel: ");
		String input = sc.next();
		input = input.toLowerCase();
		//input = input.toUpperCase();
		int inputlength = input.length();
		sc.close();
		
		for(int i = 0; i<inputlength; i++) {
			char ch = input.charAt(i);
			//char ch1 = input.charAt(i);

			if ((ch == 'a') ||(ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
				System.out.println(ch + " is a vowel");
			}	
			//else if ((ch1 == 'A') ||(ch1 == 'E') || (ch1 == 'I') || (ch1 == 'O') || (ch1 == 'U')) {
				//System.out.println(ch1 + " is a vowel");
			//}	
			else
				System.out.println(ch + " is not a vowel");
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerVowel scan = new ScannerVowel();
		scan.vowel();

	}

}
