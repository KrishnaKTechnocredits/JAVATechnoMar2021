package bhavana_assignment_13;

public class Vowels {
	
	void switchCase(char ch) {

		switch(ch) {
			case 'a':System.out.println("a is a vowel");
					break;
			
			case 'A':System.out.println("A is a vowel");
					break;
					
			case 'e':System.out.println("e is a vowel");
					break;
			
			case 'E':System.out.println("E is a vowel");
					break;
					
			case 'i':System.out.println("i is a vowel");
					break;
			
			case 'I':System.out.println("I is a vowel");
					break;
					
			case 'o':System.out.println("o is a vowel");
					break;
			
			case 'O':System.out.println("O is a vowel");
					break;
					
			case 'u':System.out.println("u is a vowel");
					break;
			
			case 'U':System.out.println("U is a vowel");
					break;
					
			default :System.out.println(ch+" is not a vowel");
			
			}
		}
	
	public static void main(String[] args) {
		Vowels vowels=new Vowels();
		vowels.switchCase('A');
		
	}
}
	
