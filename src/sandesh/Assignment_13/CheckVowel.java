/*Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel*/

package sandesh.Assignment_13;

import java.util.Scanner;

public class CheckVowel {
	char inputCh;

	CheckVowel(char ch1) {
		this.inputCh = ch1;
	}

	boolean checkIfVowel() {
		boolean isVowel = false;
		switch (inputCh) {
		case 'a':
		case 'A':
			isVowel = true;
			break;
		case 'e':
		case 'E':
			isVowel = true;
			break;
		case 'i':
		case 'I':
			isVowel = true;
			break;
		case 'o':
		case 'O':
			isVowel = true;
			break;
		case 'u':
		case 'U':
			isVowel = true;
			break;
		default:
			break;
		}
		return isVowel;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character to check if it is a vowel -: ");
		char ch = sc.next().charAt(0);
		boolean isVowelOrNot = new CheckVowel(ch).checkIfVowel();
		if (isVowelOrNot)
			System.out.println("Character " + ch + " is a vowel.");
		else
			System.out.println("Character " + ch + " is NOT a vowel.");
		sc.close();
	}
}
