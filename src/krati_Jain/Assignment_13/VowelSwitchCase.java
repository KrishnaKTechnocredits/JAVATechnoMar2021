package krati_Jain.Assignment_13;

public class VowelSwitchCase {
	
	void vowelCheckUsingSwitch(char inputChar) {
		switch(inputChar) {
		case 'A':
		case 'a':
			System.out.println(inputChar + " is a vowel");
			break;
		case 'e':
		case 'E':
			System.out.println(inputChar + " is a vowel");
			break;
		case 'i':
		case 'I':
			System.out.println(inputChar + " is a vowel");
			break;
		case 'o':
		case 'O':
			System.out.println(inputChar + " is a vowel");
			break;
		case 'u':
		case 'U':
			System.out.println(inputChar + " is a vowel");
			break;
		default:
			System.out.println(inputChar + " is NOT a vowel");
			break;
		}
	}
	
	public static void main(String[] args) {
		VowelSwitchCase vowelSwitchCase = new VowelSwitchCase();
		vowelSwitchCase.vowelCheckUsingSwitch('A');
		vowelSwitchCase.vowelCheckUsingSwitch('e');
		vowelSwitchCase.vowelCheckUsingSwitch('U');
		vowelSwitchCase.vowelCheckUsingSwitch('P');
		vowelSwitchCase.vowelCheckUsingSwitch('1');
	}

}
