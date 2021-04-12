package milind.Assignment_13;
/*Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel

sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel*/


public class SwitchCase {
	
	
	 void checkVowel(char alphabet) {
		
		switch(alphabet) {
		case 'A':
			System.out.println(alphabet+ " is a Vowel");
			break;
		case 'E':
			System.out.println(alphabet+ " is a Vowel");
			break;
		case 'I':
			System.out.println(alphabet+ " is a Vowel");
			break;
		case 'O':
			System.out.println(alphabet+ " is a Vowel");
			break;
		case 'U':
			System.out.println(alphabet+ " is a Vowel");
			break;
		default:
			System.out.println(alphabet+ " is Not a Vowel");
		}
		
	}
	public static void main(String[] args) {
		SwitchCase switchcase=new SwitchCase();
		switchcase.checkVowel('A');
		switchcase.checkVowel('M');
		switchcase.checkVowel('S');
		switchcase.checkVowel('O');
		
	}
}
