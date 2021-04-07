package madhavi_Raut.Assignment_13;
/*Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel

sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel*/

public class FindVowelUsingSwitch {

	void checkVowel(char alphabet) {
		switch (alphabet) {
		case 'A':
		case 'a':
			System.out.println("Given alphabet " + alphabet + " is vowel.");
			break;
		case 'E':
		case 'e':
			System.out.println("Given alphabet " + alphabet + " is vowel.");
			break;
		case 'I':
		case 'i':
			System.out.println("Given alphabet " + alphabet + " is vowel.");
			break;
		case 'O':
		case 'o':
			System.out.println("Given alphabet " + alphabet + " is vowel.");
			break;
		case 'U':
		case 'u':
			System.out.println("Given alphabet " + alphabet + " is vowel.");
			break;
		default:
			System.out.println("Given alphabet " + alphabet + " is NOT vowel.");
		}
	}

	public static void main(String[] args) {
		FindVowelUsingSwitch findVowelUsingSwitch = new FindVowelUsingSwitch();
		findVowelUsingSwitch.checkVowel('E');
		findVowelUsingSwitch.checkVowel('b');
		findVowelUsingSwitch.checkVowel('i');
		findVowelUsingSwitch.checkVowel('W');
	}
}
