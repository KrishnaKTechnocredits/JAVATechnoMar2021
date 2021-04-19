package priyanka_Kamble_Assignment_13;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/*
 * Assignment - 13 : 7th April'2021
WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel

 */
public class SwitchVowelorNot {

	static void vowelnonvowel(char character) {
		switch (character) {
		case 'A':
		case 'a':
			System.out.println(character + " is vowel");
			break;
		case 'E':
		case 'e':
			System.out.println(character + " is vowel");
			break;
		case 'I':
		case 'i':
			System.out.println(character + " is vowel");
			break;
		case 'O':
		case 'o':
			System.out.println(character + " is vowel");
			break;
		case 'U':
		case 'u':
			System.out.println(character + " is vowel");
			break;
		default:
			System.out.println("character " + character + " is not vowel");
			break;

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SwitchVowelorNot ch = new SwitchVowelorNot();
		//String ans =scanner.nextLine();
		//System.out.println("Do you want to continue ? (Y/N) " +ans);
		//if (ans.equals("Y") || ans.equals("y")) {
		System.out.println("Enter Character");
		char character = scanner.next().charAt(0);
		System.out.println("Character to be search - " + character);
		SwitchVowelorNot.vowelnonvowel(character);
		System.out.println(" " +scanner.nextLine());
		//System.out.println("Do you want to continue ? (Y/N) " +ans);
		//System.out.println("\n");
		/*}
		System.out.println("Do you want to continue ? (Y/N) " +ans);
		if(ans.equals("N") || ans.equals("n")) {*/
			scanner.close();
		}
	}

