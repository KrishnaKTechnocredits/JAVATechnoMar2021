package renuka.assignment14;

import java.util.Scanner;

public class Vowel {
	
void switchCase(char ch) {
		
		switch(ch) {
		
		case 'A':
		case 'a':
			System.out.println(ch+" is a vowel");
			break;
		case 'E':
		case 'e':		
			System.out.println(ch+" is a vowel");
			break;	
		case 'I':
		case 'i':
		    System.out.println(ch+" is a vowel");
			break;
		case 'O':
		case 'o':	
			System.out.println(ch+" is a vowel");
			break;	
		case 'U':
		case 'u':	
			System.out.println(ch+" is a vowel");
			break;	
		default:
			System.out.println(ch+ " is not a vowel");
		}
		
	}

    public static void main(String[] args) {
	   Vowel sc1 = new Vowel();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a character to check Vowel: ");
	   String input = sc.next();
	   //input = input.toLowerCase();
		//input = input.toUpperCase();
	   //int inputlength = input.length();
	   char ch = input.charAt(0);
	   sc1.switchCase(ch);
	   sc.close();
}
}
