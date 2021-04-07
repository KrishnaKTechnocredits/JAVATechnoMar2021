package krishna.Assignment_13;

public class VowelExample {

	public void vowelIdentify(char ch) {
		switch (ch) {
		
		case 'L':
			System.out.println("a is the vowel");
			break;
		case 'd':
			System.out.println("d is not the vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		default :
			System.out.println("Enter valid character");
			
		}
	}
	
	
	public static void main(String[] args) {
		VowelExample vowelExample = new VowelExample();
		vowelExample.vowelIdentify('d');
		vowelExample.vowelIdentify('L');
		vowelExample.vowelIdentify('i');
	}
}
