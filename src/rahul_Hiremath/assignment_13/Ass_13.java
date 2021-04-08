package rahul_Hiremath.assignment_13;

public class Ass_13 {

	void checkVowel(char ch) {
		switch (ch) {
		case 'a':
		case 'A':
			System.out.println("'" + ch + "'" + " is a Vowel");
			break;

		case 'e':
		case 'E':
			System.out.println("'" + ch + "'" + " is a Vowel");
			break;

		case 'i':
		case 'I':
			System.out.println("'" + ch + "'" + " is a Vowel");
			break;

		case 'o':
		case 'O':
			System.out.println("'" + ch + "'" + " is a Vowel");
			break;

		case 'u':
		case 'U':
			System.out.println("'" + ch + "'" + " is a Vowel");
			break;

		default:
			System.out.println("'" + ch + "'" + " is not a vowel");
		}
	}

	public static void main(String[] args) {
		Ass_13 ass_13 = new Ass_13();
		ass_13.checkVowel('t');
	}
}
