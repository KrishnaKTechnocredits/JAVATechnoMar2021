/*Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
 */

package aparna.switchCase;

public class FoundVowelFromCharacter {

	void vowelFound(char character) {
		switch (character) {
		case 'A':
		case 'a':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'E':
		case 'e':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'I':
		case 'i':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'O':
		case 'o':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'U':
		case 'u':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		default:
			System.out.println("Given Character " + character + " is not Vowel");
		}
	}

	void vowelFoundByAnotherWay(char character) {

		character = Character.toUpperCase(character);// Changing lower case character to Upper case
		switch (character) {
		case 'A':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'E':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'I':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'O':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'U':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		default:
			System.out.println("Given Character " + character + " is not Vowel");
		}
	}

	public static void main(String[] args) {
		FoundVowelFromCharacter foundVowelFromCharacter = new FoundVowelFromCharacter();
		foundVowelFromCharacter.vowelFound('d');
		foundVowelFromCharacter.vowelFound('I');
		foundVowelFromCharacter.vowelFound('e');
		System.out.println(" Änother way to find vowel by Using method toUpperCase()");

		foundVowelFromCharacter.vowelFoundByAnotherWay('d');
		foundVowelFromCharacter.vowelFoundByAnotherWay('I');
		foundVowelFromCharacter.vowelFoundByAnotherWay('e');
	}

}
