package priyanka_Kamble.assignment_20;
/* ---------------------------------------------------------------------
Assignment 20: 14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

 */
import java.util.Scanner;
public class CountValues {
	
	void count(String input) {
		int cntU=0,cntL=0,cntC=0;
		for (int indexU=0 ; indexU<input.length(); indexU++) {
			if(input.charAt(indexU)>=65 && input.charAt(indexU)<=90)
				cntU++;
		}	
		System.out.println("upper Case Count = " +cntU);	
		
		for (int indexL=0 ; indexL<input.length(); indexL++) {
			if(input.charAt(indexL)>=97 && input.charAt(indexL)<=122)
				cntL++;
		}
		System.out.println("Lower case Count = "+cntL);
		
		int Sum =cntU + cntL;
		System.out.println("Letters Count = "+Sum);
		
		for (int indexC=0 ; indexC<input.length(); indexC++) {
			if(input.charAt(indexC)>=48 && input.charAt(indexC)<=57)
				
				cntC++;
		}	
		System.out.println("Digit Count = " +cntC);	
		
	}
	
	
	public static void main(String[] args) {
		CountValues character = new CountValues();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1) Enter the String - ");
		String input = scanner.nextLine(); // char ch = input.charAt(0);
		character.count(input);
		scanner.close();
	}
}
