package anubhav.scannerexamples;

import java.util.Scanner;

public class VowelsCheckScanner {

	char ch;
	
	public void vowels(){
		switch (ch) {
			case 'A': 
			case 'a':
				System.out.println(ch + " - Entered character is a vowel");
				break;
			case 'E':
			case 'e':
				System.out.println(ch + " - Entered character is a vowel");
			case 'I':
			case 'i':
				System.out.println(ch + " - Entered character is a vowel");
				break;
			case 'O':
			case 'o':
				System.out.println(ch + " - Entered character is a vowel");
				break;
			case 'U':
			case 'u':
				System.out.println(ch + " - Entered character is a vowel");
				break;
			default:
				System.out.println(ch + " - Entered character is not a vowel");
		}
	}	
	
	public static void main (String[] args) {
		VowelsCheckScanner vowelsCheckScanner= new VowelsCheckScanner();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the alphabet: ");
		
		String alphabet1= scanner.next();
		char ch1= alphabet1.charAt(0);
		vowelsCheckScanner.ch= ch1;
		vowelsCheckScanner.vowels();
		
		String alphabet2= scanner.next();
		char ch2= alphabet2.charAt(0);
		vowelsCheckScanner.ch= ch2;
		vowelsCheckScanner.vowels();
		
		String alphabet3= scanner.next();
		char ch3= alphabet3.charAt(0);
		vowelsCheckScanner.ch= ch3;
		vowelsCheckScanner.vowels();
		
		String alphabet4= scanner.next();
		char ch4= alphabet4.charAt(0);
		vowelsCheckScanner.ch= ch4;
		vowelsCheckScanner.vowels();
		
		String alphabet5= scanner.next();
		char ch5= alphabet5.charAt(0);
		vowelsCheckScanner.ch= ch5;
		vowelsCheckScanner.vowels();
	}	
}
