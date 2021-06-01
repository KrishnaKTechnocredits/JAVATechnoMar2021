/*
Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel 
 */

package ankit.assignment_13;

public class CheckVowelSwitchEx {

	void isVowel(String ch) {
		switch(ch) {
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
			System.out.println(ch + "  is a Vowel");
			break;
		default :
			System.out.println(ch + "  is not a Vowel");
		}
	}

	public static void main(String[] args) {
		CheckVowelSwitchEx checkVowelSwitchEx = new CheckVowelSwitchEx();
		checkVowelSwitchEx.isVowel("i");

	}

}
