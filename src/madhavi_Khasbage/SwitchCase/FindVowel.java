package madhavi_Khasbage.SwitchCase;

public class FindVowel {
	
	void isCharacterVowel(char x) {		
		switch(x) {
		case 'A':
		case 'a':
			System.out.println(x + " is a vowel.");
			break;
		case 'E':
		case 'e':
			System.out.println(x + " is a vowel.");
			break;
		case 'I':
		case 'i':
			System.out.println(x + " is a vowel.");
			break;
		case 'O':
		case 'o':
			System.out.println(x + " is a vowel.");
			break;
		case 'U':
		case 'u':
			System.out.println(x + " is a vowel.");
			break;
		default:
			System.out.println(x + " is not a vowel");
		}		
	}
	
	public static void main(String[] args) {
		FindVowel findvowel1 = new FindVowel();
		findvowel1.isCharacterVowel('a');
		findvowel1.isCharacterVowel('A');
		findvowel1.isCharacterVowel('k');
		findvowel1.isCharacterVowel('U');
		findvowel1.isCharacterVowel('u');
		findvowel1.isCharacterVowel('z');		
	}

}
