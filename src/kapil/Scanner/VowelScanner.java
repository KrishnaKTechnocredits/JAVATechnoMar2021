package kapil.Scanner;

import java.util.Scanner;

public class VowelScanner {

	public static void main (String[] args ) {
		VowelScanner vowelscanner = new VowelScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Alphabates : ");
		String input = scanner.next();
		char ch = input.charAt(0);
		System.out.println("Alphabate is a vowel : " +ch);
		String input2 = scanner.next();
		char ch1 = input.charAt(1);
		System.out.println("Alphabate is a vowel : "+ch1);
		String input3 = scanner.next();
		char ch2 = input.charAt(2);
		System.out.println("Alphabate is not a vowel : "+ch2);
		
		
		
	}
}
