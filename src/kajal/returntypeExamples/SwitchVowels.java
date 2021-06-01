package kajal.returntypeExamples;

public class SwitchVowels {

	void SwitchCase(char alpha) {
		
		switch(alpha) {
		
		case 'a':
		case 'A':
			System.out.println("Entered character is Vowel");
			break;
		case 'e':
		case 'E':
			System.out.println("Entered character is Vowel");
			break;
		case 'i':
		case 'I':
			System.out.println("Entered character is Vowel");
			break;
		case 'o':
		case 'O':
			System.out.println("Entered character is Vowel");
			break;
		case 'u':
		case 'U':
			System.out.println("Entered character is Vowel");
			break;
			
		default:
			System.out.println("Entered character is not Vowel, Please give valid input");
	
		}
	}
	public static void main(String [] args) {
		SwitchVowels switchvowels = new SwitchVowels();
		switchvowels.SwitchCase('p');
		switchvowels.SwitchCase('O');
		switchvowels.SwitchCase('i');
		switchvowels.SwitchCase('6');
		
	}
}
