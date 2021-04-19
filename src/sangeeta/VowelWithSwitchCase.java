package sangeeta;

public class VowelWithSwitchCase {
	
	void isVowel(char Ch) {
	
	switch(Ch) {
		case 'a':
		case 'A':
			System.out.println(" A is a Vowel");
			break;
		
		case 'e':
		case 'E':
			System.out.println(" E is a Vowel");
			break;
			
		case 'i':
		case 'I':
			System.out.println(" I is a Vowel");
			break;
			
		case 'o':
		case 'O':
			System.out.println(" O is a Vowel");
			break;
			
		case 'u':
		case 'U':
			System.out.println(" U is a Vowel");
			break;	
			
		default :
			System.out.println(" Its not a vowel");
			break;
			}
	
	}
	
	public static void main(String[] a) {
		VowelWithSwitchCase vowelWithSwitchCase = new VowelWithSwitchCase();
		vowelWithSwitchCase.isVowel('d');
		vowelWithSwitchCase.isVowel('I');
		vowelWithSwitchCase.isVowel('i');
	}

}
