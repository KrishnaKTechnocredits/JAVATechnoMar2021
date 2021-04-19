package sourabh.switchCase;

public class FindVowel {
	void findVowel(char input) {
		switch(input) {
			case 'A':
			case 'a':	
				System.out.println(input+" is a vowel");
				break;
			case 'E':
			case 'e':
				System.out.println(input+" is a vowel");
				break;
			case 'I':
			case 'i':	
				System.out.println(input+" is a vowel");
				break;
			case 'O':
			case 'o':
				System.out.println(input+" is a vowel");
				break;
			case 'U':
			case 'u':
				System.out.println(input+" is a vowel");
				break;
			default:
				System.out.println(input+" is not a vowel");				
		}
	}
	public static void main(String[] args) {
		FindVowel findVowel= new FindVowel();
		findVowel.findVowel('A');
	}
}
