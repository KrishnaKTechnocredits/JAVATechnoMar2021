package mayur.assignment14;
import java.util.Scanner;

public class Vowels{
	
	void isAVowel(String ch) {
		
		switch(ch) {
		case "A":
		case "a":
			System.out.println(ch + " is a Vowel");
			break;
		case "E":
		case "e":
			System.out.println(ch + "is a Vowel");
			break;
		case "I":
		case "i":
			System.out.println(ch + "is a Vowel");
			break;
		case "O":
		case "o":
			System.out.println(ch + "is a Vowel");
			break;
		case "U":
		case "u":
			System.out.println(ch + "  is a Vowel");
			break;
		default :
			System.out.println(ch + " is not a Vowel");
		}
	}
		public static void main(String[] args) {
			
			Vowels vowels =new Vowels();
			System.out.println("Enter the Alphabet: ");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.next();
			vowels.isAVowel(str);
			
		}
	
}
	


