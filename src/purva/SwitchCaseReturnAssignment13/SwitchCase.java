package purva.SwitchCaseReturnAssignment13;

public class SwitchCase {
	
	void vowel(char ch) {
		
		switch(ch) {
		case 'A':
		case 'a':
			System.out.println(ch +" is a vowel");
			break;
			
		case 'E':
		case 'e':
			System.out.println(ch +" is a vowel");
			break;
		
		case 'I':	
		case 'i':
			System.out.println(ch +" is a vowel");
			break;
			
		case 'O':	
		case 'o':
		    System.out.println(ch +" is a vowel");
		    break;
		    
		case 'U':
		case 'u':
			System.out.println(ch +" is a vowel");
			break;
		
		default:
			System.out.println(ch+" is a consonant");
				
		}
	}

	public static void main(String[] args) {
		SwitchCase switchCase = new SwitchCase();
		switchCase.vowel('D');
		switchCase.vowel('I');
		switchCase.vowel('i');
	}
	

}
