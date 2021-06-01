package surabhi.assignment14;

import java.util.Scanner;

public class VowelUsingScanner {
	
	void isVowel(char ch) {
		//ch=Character.toLowerCase(ch);
		switch(ch) {
		case 'a':
		case 'A':
			System.out.println(ch+" is a vowel");
			break;
		case 'e':
		case 'E':
			System.out.println(ch+" is a vowel");
			break;
		case 'i':
		case 'I':
			System.out.println(ch+" is a vowel");
			break;
		case 'o':
		case 'O':
			System.out.println(ch+" is a vowel");
			break;
		case 'u':
		case 'U':
			System.out.println(ch+" is a vowel");
			break;
		default :
			System.out.println(ch+" is not a vowel");
			break;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelUsingScanner vowelUsingScanner=new VowelUsingScanner();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter any charecter to check for vowels :");
		char ch1=scanner.next().charAt(0);
		char ch2=scanner.next().charAt(0);
		vowelUsingScanner.isVowel(ch1);
		vowelUsingScanner.isVowel(ch2);
		

	}

}
