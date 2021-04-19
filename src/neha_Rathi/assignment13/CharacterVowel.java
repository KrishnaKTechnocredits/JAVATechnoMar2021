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

package neha_Rathi.assignment13;

public class CharacterVowel {

	static void vowel(char ch) {
		ch = Character.toUpperCase(ch);
		switch (ch) {
		case 'A':
			System.out.println(ch + " is a vowel");
			break;
		case 'E':
			System.out.println(ch + " is a vowel");
			break;
		case 'I':
			System.out.println(ch + " is a vowel");
			break;
		case 'O':
			System.out.println(ch + " is a vowel");
			break;
		case 'U':
			System.out.println(ch + " is a vowel");
			break;
		default:
			System.out.println(ch + " is not a vowel");
		}
	}

	public static void main(String[] a) {
		vowel('d');
		vowel('I');
		vowel('i');
	}
}
