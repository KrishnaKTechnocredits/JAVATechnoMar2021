package dipali;

import java.util.Scanner;

public class Assignment14P1 {
	
	public void VerifyVowel(char sVowel) {
		sVowel=Character.toUpperCase(sVowel);
		switch (sVowel) {
		case 'A' :
			System.out.println(sVowel + " is a vowel");
			break;
		case 'E' :
			System.out.println(sVowel + " is a vowel");
			break;
		case 'O' :
			System.out.println(sVowel + " is a vowel");
			break;
		case 'I' :
			System.out.println(sVowel + " is a vowel");
			break;
		case 'U' :
			System.out.println(sVowel + " is a vowel");
			break;
		default :
			System.out.println(sVowel + " is not a vowel");
			
		}
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Assignment14P1 assignment14p1=new Assignment14P1();
			String input1=scanner.next();
			char ch=input1.charAt(0);
			assignment14p1.VerifyVowel(ch);
			String input2=scanner.next();
			char ch2=input2.charAt(0);
			assignment14p1.VerifyVowel(ch2);
			String input3=scanner.next();
			char ch3=input3.charAt(0);
			assignment14p1.VerifyVowel(ch3);
			
		}
	}

}
