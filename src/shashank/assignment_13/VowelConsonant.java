package shashank.assignment_13;

public class VowelConsonant {

	public void vowelConsonant(char ch) {

		switch (ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(ch + " is Vowel");
			break;
		default:
			System.out.println(ch + " is Consonant");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelConsonant vowelConsonant = new VowelConsonant();
		char ch = 'd';
		vowelConsonant.vowelConsonant(ch);
		ch = 'I';
		vowelConsonant.vowelConsonant(ch);
		ch = 'i';
		vowelConsonant.vowelConsonant(ch);
	}

}
