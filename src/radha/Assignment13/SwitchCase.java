package radha.Assignment13;

public class SwitchCase {
	char alphabet;
	
	void isVowel(char alphabet) {
		switch(alphabet) {
		case 'A':
		case 'a':
			System.out.println(alphabet+" is a vowel");
			break;
			
		case 'E':
		case 'e':
			System.out.println(alphabet+" is a vowel");
			break;
			
		case 'I':
		case 'i':
			System.out.println(alphabet+" is a vowel");
			break;
		
		case 'O':
		case 'o':
			System.out.println(alphabet+" is a vowel");
			break;
			
		case 'U':
		case 'u':
			System.out.println(alphabet+" is a vowel");
			break;
			
		default:
			System.out.println(alphabet+" is not a Vowel.");
		}
	}
	
	public static void main(String[] args) {
		SwitchCase switchCase = new SwitchCase();
		switchCase.isVowel('a');
		switchCase.isVowel('F');
		switchCase.isVowel('I');
		switchCase.isVowel('l');
	}
}
