package dhanshri.Assignemnt_13;

public class Vowels {
	
	void isVowel(char ch) {

		switch(ch) {

		case 'A':
		case 'a':
			System.out.println(ch+ " is a vowel");
			break;
		case 'E':
		case 'e':		
			System.out.println(ch+ " is a vowel");
			break;	
		case 'I':
		case 'i':
		    System.out.println(ch+ " is a vowel");
			break;
		case 'O':
		case 'o':	
			System.out.println(ch+ " is a vowel");
			break;	
		case 'U':
		case 'u':	
			System.out.println(ch+ " is a vowel");
			break;	
		default:
			System.out.println(ch+ " is not a vowel");
		}

	}


	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		vowels.isVowel('c');
		vowels.isVowel('a');
		vowels.isVowel('A');
		vowels.isVowel('1');
		vowels.isVowel('O');
	}

}

	

