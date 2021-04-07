package surabhi.assignment13;

public class Vowel {
	
	void isVowel(char ch) {
		//ch=Character.toLowerCase(ch);
		switch(ch) {
		case 'a':
		case 'A':
			System.out.println(ch+" is a vowel");
			break;
		case 'e':
		case 'E':
			System.out.println(ch+" is a vowel");
			break;
		case 'i':
		case 'I':
			System.out.println(ch+" is a vowel");
			break;
		case 'o':
		case 'O':
			System.out.println(ch+" is a vowel");
			break;
		case 'u':
		case 'U':
			System.out.println(ch+" is a vowel");
			break;
		default :
			System.out.println(ch+" is not a vowel");
			break;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel vowel=new Vowel();
		vowel.isVowel('d');
		vowel.isVowel('B');
		vowel.isVowel('i');
		vowel.isVowel('I');

	}

}
