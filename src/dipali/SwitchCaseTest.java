package dipali;

public class SwitchCaseTest {
		
	public void VerifyVowel(char sVowel) {
		switch (sVowel) {
		case 'A' :
		case 'a' :
			System.out.println(sVowel + " is a vowel");
			break;
		case 'E' :
		case 'e' :
			System.out.println(sVowel + " is a vowel");
			break;
		case 'O' :
		case 'o' :
			System.out.println(sVowel + " is a vowel");
			break;
		case 'I' :
		case 'i' :
			System.out.println(sVowel + " is a vowel");
			break;
		case 'U' :
		case 'u' :
			System.out.println(sVowel + " is a vowel");
			break;
		default :
			System.out.println(sVowel + " is not a vowel");
			
		}
	}
	public static void main(String[] args) {
		SwitchCaseTest switchcasetest = new SwitchCaseTest();
		switchcasetest.VerifyVowel('d');
		switchcasetest.VerifyVowel('I');
		switchcasetest.VerifyVowel('i');
	}

}
