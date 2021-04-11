package anubhav.switchexamples;

public class VowelsCheck{

	public void vowels(char ch){
		switch (ch) {
			case 'A': 
			case 'a':
				System.out.println(ch + " - Entered character is a vowel");
				break;
			case 'E':
			case 'e':
				System.out.println(ch + " - Entered character is a vowel");
			case 'I':
			case 'i':
				System.out.println(ch + " - Entered character is a vowel");
				break;
			case 'O':
			case 'o':
				System.out.println(ch + " - Entered character is a vowel");
				break;
			case 'U':
			case 'u':
				System.out.println(ch + " - Entered character is a vowel");
				break;
			default:
				System.out.println(ch + " - Entered character is not a vowel");
		}
	}	
	
	public static void main (String[] args) {
		VowelsCheck vowelsCheck= new VowelsCheck();
		vowelsCheck.vowels('a');
		vowelsCheck.vowels('D');
		vowelsCheck.vowels('A');
		vowelsCheck.vowels('Z');
		vowelsCheck.vowels('E');
		vowelsCheck.vowels('g');
	}
}
