package kangan.assignments.assignment_13;

public class Vowel {
	public void isVowel(char X) {
		switch(X) {
		case 'A':
		case 'a':
			System.out.println(X + " is a Vowel");
			break;
		case 'E':
		case 'e':
			System.out.println(X + " is a Vowel");
			break;
		case 'I':
		case 'i':
			System.out.println(X + " is a Vowel");
			break;
		case 'O':
		case 'o':
			System.out.println(X + " is a Vowel");
			break;
		case 'U':
		case 'u':
			System.out.println(X + " is a Vowel");
			break;
		default:
			System.out.println(X + " is not a Vowel");
			break;
		}
	}
	
  public static void main(String[] args) {
	Vowel vowel = new Vowel();
	vowel.isVowel('e');
	vowel.isVowel('S');
	vowel.isVowel('x');
	vowel.isVowel('I');
   }
}
