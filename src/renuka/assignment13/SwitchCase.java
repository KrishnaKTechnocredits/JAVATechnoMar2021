package renuka.assignment13;

/*WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel*/

public class SwitchCase {
	
	void switchCase(char isVowel) {
		
		switch(isVowel) {
		
		case 'A':
		case 'a':
			System.out.println(isVowel+" is a vowel");
			break;
		case 'E':
		case 'e':		
			System.out.println(isVowel+" is a vowel");
			break;	
		case 'I':
		case 'i':
		    System.out.println(isVowel+" is a vowel");
			break;
		case 'O':
		case 'o':	
			System.out.println(isVowel+" is a vowel");
			break;	
		case 'U':
		case 'u':	
			System.out.println(isVowel+" is a vowel");
			break;	
		default:
			System.out.println(isVowel+ " is not a vowel");
		}
		
	}
	
   public static void main(String[] args) {
		SwitchCase sc1 = new SwitchCase();
		sc1.switchCase('d');
		sc1.switchCase('I');
		sc1.switchCase('i');
	}

}
