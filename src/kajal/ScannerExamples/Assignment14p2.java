package kajal.ScannerExamples;

import java.util.Scanner;

public class Assignment14p2 {

		void Vowels(char alpha) {
		
		switch(alpha) {
		
			case 'a':
			case 'A':
				System.out.println("entered character is vowel");
				break;
				
			case 'e':
			case 'E':
				System.out.println("entered character is vowel");
				break;
				
			case 'i':
			case 'I':
				System.out.println("entered character is vowel");
				break;
				
			case 'o':
			case 'O':
				System.out.println("entered character is vowel");
				break;
				
			case 'u':
			case 'U':
				System.out.println("entered character is vowel");
				break;
				
			default:
				System.out.println("Invalid input, please enter valid input");
		
		}
	}
	
		public static void main(String [] args) {
		Assignment14p2 a = new Assignment14p2();
		
		System.out.println("Enter charachter to check whether it is vowel: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		a.Vowels(ch);
		
		System.out.println("Enter 2nd charachter to check whether it is vowel: ");
		char ch1 = sc.next().charAt(0);
		a.Vowels(ch1);
		
		}	
}		
	

