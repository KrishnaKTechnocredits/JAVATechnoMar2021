package krati_Shukla.SwitchCase;

public class Vowel {
	
	void checkVowel(char letter) {
		switch(letter) {
			case 'A':
			case 'a':
				System.out.println(letter+" is Vowel");
				break;
			case 'E':
			case 'e':
				System.out.println(letter+" is Vowel");
				break;
			case 'I':
			case 'i':
				System.out.println(letter+" is Vowel");
				break;
			case 'O':
			case 'o':
				System.out.println(letter+" is Vowel");
				break;
			case 'U':
			case 'u':
				System.out.println(letter+" is Vowel");
				break;
			default:
				System.out.println(letter+ " is not Vowel");
		}
		
	}
	
	
	public static void main(String[] a) {
		Vowel v = new Vowel();
		v.checkVowel('a');
		v.checkVowel('d');
		v.checkVowel('O');
		v.checkVowel('G');
	}

}
