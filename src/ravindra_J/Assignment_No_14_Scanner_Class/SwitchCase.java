package ravindra_J.Assignment_No_14_Scanner_Class;

import java.util.Scanner;

public class SwitchCase {

	
	
	static void findVowel(char ch) {
		
		switch(ch) {
		
		case 'a':
			System.out.println("Given character is vowel");
			break;
		case 'e':
			System.out.println("Given character is vowel");
			break;
		case 'i':
			System.out.println("Given character is vowel");
			break;
		case 'o':
			System.out.println("Given character is vowel");
			break;
		case 'u':
			System.out.println("Given character is vowel");
			break;
		default:
			System.out.println("Given Character is not vowel");
		
		}
	}
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the character : ");
			String str = scanner.next();
		
			char c = str.toLowerCase().charAt(0);
			findVowel(c);
			
	}

}
