/*
 WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
*/

package ami.Assignment_13;

public class SwichCase {
	void isVowel(char ch) {
		switch (ch) {
		case 'a':
		case 'A':
			System.out.println(ch + " is a vowel");
			break;
		case 'E':
		case 'e':
			System.out.println(ch + " is a vowel");
			break;
		case 'i':
		case 'I':
			System.out.println(ch + " is a vowel");
			break;
		case 'o':
		case 'O':
			System.out.println(ch + " is a vowel");
			break;
		case 'U':
		case 'u':
			System.out.println(ch + " is a vowel");
			break;
		default:
			System.out.println(ch + " is not a vowel");
		}
	}

	public static void main(String[] a) {
		SwichCase swichCase = new SwichCase();
		swichCase.isVowel('d');
		swichCase.isVowel('l');
		swichCase.isVowel('i');
	}
}
