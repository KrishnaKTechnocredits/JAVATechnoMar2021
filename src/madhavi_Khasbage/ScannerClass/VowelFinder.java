package madhavi_Khasbage.ScannerClass;
import java.util.Scanner;

public class VowelFinder {
	
	void isCharacterVowel(char ch) {	
		ch = Character.toUpperCase(ch);
		switch(ch) {
		case 'A':		
			System.out.println("Given character " + ch + " is a vowel.");
			break;
		case 'E':		
			System.out.println("Given character " + ch + " is a vowel.");
			break;
		case 'I':		
			System.out.println("Given character " + ch + " is a vowel.");
			break;
		case 'O':		
			System.out.println("Given character " + ch + " is a vowel.");
			break;
		case 'U':		
			System.out.println("Given character " + ch + " is a vowel.");
			break;
		default:
			System.out.println("Given character " + ch + " is not a vowel");
		}		
	}
	
	public static void main(String[] args) {
		VowelFinder vowelfinder1=new VowelFinder();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character : ");		
		String str = scanner.next();
		char c=str.charAt(0);	
		vowelfinder1.isCharacterVowel(c);
	}
}
