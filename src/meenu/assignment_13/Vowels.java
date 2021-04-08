package meenu.assignment_13;

public class Vowels {

	void checkVowels(char ch) {
		switch(ch){
		case'A':
		case'a':
		case'E':
		case'e':
		case'I':
		case'i':
		case'O':
		case'o':
		case'U':
		case'u':
			System.out.println(ch+" is a vowel");
			break;
		default:
			System.out.println(ch+" is not a vowel");		
		}
	}
	
	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		vowels.checkVowels('d');
		vowels.checkVowels('I');
		vowels.checkVowels('i');
	}
}

	


