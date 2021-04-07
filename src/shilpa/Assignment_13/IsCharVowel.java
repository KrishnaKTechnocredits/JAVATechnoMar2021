/*Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel*/

package shilpa.Assignment_13;

public class IsCharVowel {
	
	public void vowel(char ch) {
		switch(ch) {
		case 'A':
		case 'a':
			System.out.println(ch+ " is a vowel");
			break;
		case 'E':
		case 'e':
			System.out.println(ch+ " is a vowel");
			break;
		case 'I':
		case 'i':
			System.out.println(ch+ " is a vowel");
			break;
		case 'O':
		case 'o':
			System.out.println(ch+ " is a vowel");
			break;
		case 'U':
		case 'u':
			System.out.println(ch+ " is a vowel");
			break;
		default:
			System.out.println(ch+" is an Invalid Character");
			break;
				
		}
	}
	public static void main(String[] args) {
		IsCharVowel   isCharVowel = new IsCharVowel();
		isCharVowel.vowel('a');
		isCharVowel.vowel('E');
		isCharVowel.vowel('i');
		isCharVowel.vowel('o');
		isCharVowel.vowel('u');
		isCharVowel.vowel('D');
	}

}

