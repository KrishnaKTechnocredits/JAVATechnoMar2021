package krishna.Assignment_14;
import java.util.Scanner;
public class VowelExampleScanner {

	public void vowelIdentify(char ch) {
		switch (ch) {

		case 'A':
		case 'a':
			System.out.println(ch + " is the vowel");
			break;
		case 'E':
		case 'e':
			System.out.println(ch + " is the vowel");
			break;
		case 'I':
		case 'i':
			System.out.println(ch + " is the vowel");
			break;
		case 'O':
		case 'o':
			System.out.println(ch + " is the vowel");
			break;
		case 'U':
		case 'u':
			System.out.println(ch + " is the vowel");
			break;

		default:
			System.out.println(ch + " is not the vowel");

		}
	}

	public static void main(String[] args) {
		VowelExampleScanner vowelExampleScanner = new VowelExampleScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = scanner.next().charAt(0);
		System.out.println("You have entered "+ch);
		vowelExampleScanner.vowelIdentify(ch);
		scanner.close();
	}

}
