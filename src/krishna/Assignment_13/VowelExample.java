package krishna.Assignment_13;

public class VowelExample {

	public void vowelIdentify(char ch) {
		switch (ch) {
		
		case 'A':
		case 'a':
			System.out.println(ch+" is the vowel");
			break;
		case 'E':
		case 'e':		
			System.out.println(ch+" is the vowel");
			break;
		case 'I':
		case 'i':		
			System.out.println(ch+" is the vowel");
			break;
		case 'O':
		case 'o':		
			System.out.println(ch+" is the vowel");
			break;
		case 'U':
		case 'u':		
			System.out.println(ch+" is the vowel");
			break;
			
		default :
			System.out.println(ch+" is not the vowel");
		}
	}
	
	public static void main(String[] args) {
		VowelExample vowelExample = new VowelExample();
		vowelExample.vowelIdentify('A');
		vowelExample.vowelIdentify('e');
		vowelExample.vowelIdentify('L');
		vowelExample.vowelIdentify('1');
		vowelExample.vowelIdentify('*');
	}
}
