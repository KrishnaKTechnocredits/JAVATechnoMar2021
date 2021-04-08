/*
 * Assignment - 13 : 7th April'2021
 * WAP to evaluate whether given character is vowel or not using switch case.
 * sample input1 : d
 * sample output1 : d is not a vowel
 * sample input2 : I
 * sample output2 : I is a vowel
 * sample input3 : i
 * sample output3 : i is a vowel
 */
package ashish_Vyas.Assignment_13;

public class SwitchCase {
	
	void verifyVowelConsonant(char charater){
		switch (charater){
	    case 'a':
	    case 'A':	
	    	System.out.println(charater + " is a vowel");
	        break;
	    case 'e':
	    case 'E':	
	    	System.out.println(charater + " is a vowel");
	        break;
	    case 'i':
	    case 'I':	
	    	System.out.println(charater + " is a vowel");
	        break;
	    case 'o':
	    case 'O':	
	    	System.out.println(charater + " is a vowel");
	        break;
	    case 'u':
	    case 'U':	
	        System.out.println(charater + " is a vowel");
	        break;
	    default :
	        System.out.println(charater + " is not a vowel");
	     }
	}	
	public static void main(String[] arg) {
		SwitchCase switchCase = new SwitchCase();
		switchCase.verifyVowelConsonant('d');
		switchCase.verifyVowelConsonant('I');
		switchCase.verifyVowelConsonant('i');
	}
}