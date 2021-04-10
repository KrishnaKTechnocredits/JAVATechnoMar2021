package priyanka_Panat.assignment14;

	import java.util.Scanner;

	public class VowelScanner {
		
		void isVowel(char ch) {
			ch = Character.toUpperCase(ch);
			switch(ch) {
			case 'A':		
				System.out.println("Entered character " + ch + " is a vowel.");
				break;
			case 'E':		
				System.out.println("Entered character " + ch + " is a vowel.");
				break;
			case 'I':		
				System.out.println("Entered character " + ch + " is a vowel.");
				break;
			case 'O':		
				System.out.println("Entered character " + ch + " is a vowel.");
				break;
			case 'U':		
				System.out.println("Entered character " + ch + " is a vowel.");
				break;
			default:
				System.out.println("Entered character " + ch + " is Consonent");
			}		
		}

		public static void main(String[] args) {
			VowelScanner vowelscanner=new VowelScanner();
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a character : ");		
			String str = scanner.next();
			char character=str.charAt(0);	
			vowelscanner.isVowel(character);
		}
}
