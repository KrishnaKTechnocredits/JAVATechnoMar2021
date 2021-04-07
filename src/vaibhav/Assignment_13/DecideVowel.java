package vaibhav.Assignment_13;

public class DecideVowel {

	void decideVowel_1(char ch) {
		
		System.out.println("");
		System.out.println("Decision done using separate exicution line");		
		switch (ch) {
			case 'A':
			case 'a':
				System.out.println("a  is a vowel");
				break;
			case 'E':
			case 'e':
				System.out.println("e is a vowel");
				break;
			case 'I':
			case 'i':
				System.out.println("i is a vowel");
				break;
			case 'O':
			case 'o':
				System.out.println("o is a vowel");
				break;
			case 'U':
			case 'u':
				System.out.println("u is a vowel");
				break;
			default:
				System.out.println(ch + " is NOT a vowel");
				break;

		}

	}

	void decideVowel_2(char ch) {
		
		System.out.println("");
		System.out.println("Decision done using single exicution line");		
		switch (ch) {
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.println(ch + " is a vowel");
				break;
			default:
				System.out.println(ch + " is NOT a vowel");
				break;
		}

	}

	public static void main(String[] args) {
		DecideVowel decideVowel_1 = new DecideVowel();
		decideVowel_1.decideVowel_1('z');
		decideVowel_1.decideVowel_2('a');
	}

}
