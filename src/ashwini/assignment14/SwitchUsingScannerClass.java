package ashwini.assignment14;

import java.util.Scanner;

/* WAP to evaluate whether given character is vowel or not using switch case.()
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel */


public class SwitchUsingScannerClass {
	void chIsVowel(String str) {
		switch(str) {
		case "A":
		case "a":
		case "E":
		case "e":
		case "I":
		case "i":
		case "O":
		case "o":
		case "U":
		case "u":
			System.out.println(str + " is a Vowel");
			break;
		default:
			System.out.println(str + " is not a Vowel");
			
		}
	}

	public static void main(String[] args) {
		SwitchUsingScannerClass  switchUsingScanner = new SwitchUsingScannerClass();
		System.out.println("Enter alphabet:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		switchUsingScanner.chIsVowel(str);

	}

}
