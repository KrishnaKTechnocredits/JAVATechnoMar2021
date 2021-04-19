/*
Assignment - 14 : Program 1 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case and scanner Class.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
*/

package paras.Assignment_14;

import java.util.Scanner;

public class SwitchUsingScanner {
	static void num(char ch) {
		ch = Character.toUpperCase(ch);
		switch(ch) {
		case 'A' :
			System.out.println(ch+ " is a Vowel");
			break;
		case 'E' :
			System.out.println(ch+ " is a Vowel");
			break;
		case 'I' :
			System.out.println(ch+ " is a Vowel");
			break;
		case 'O' :
			System.out.println(ch+ " is a Vowel");
			break;
		case 'U' :
			System.out.println(ch+ " is a Vowel");
			break;
		default :
			System.out.println(ch+ " is not a Vowel");
		}
	}
	
	public static void main(String args[]) {
		SwitchUsingScanner switchusingscanner = new SwitchUsingScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a Character");
		String input = scanner.nextLine();
		char ch = input.charAt(0);
		num(ch);
	}
}
