package monika.Assignment14;

import java.util.Scanner;
public class FindVowelUsingScanner {

	void isVowel(String s) {
		String inputValue = s.toUpperCase();
		switch(inputValue) {
		case "A":
			System.out.println(inputValue+" is a vowel");
			break;
		case "E":
			System.out.println(inputValue+" is a vowel");
			break;
		case "I":
			System.out.println(inputValue+" is a vowel");
			break;
		case "O":
			System.out.println(inputValue+" is a vowel");
			break;
		case "U":
			System.out.println(inputValue+" is a vowel");
			break;
		default:
			System.out.println(inputValue+" is not a vowel");
			break;
		}	
	}
	public static void main(String[] args) {
		FindVowelUsingScanner obj = new FindVowelUsingScanner();
		Scanner sc = new Scanner(System.in);
		//String inputValue = sc.next();
		obj.isVowel((sc.next()));
		sc.close();
	}
}
