/*Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
 */

package amruta.Assignment_13;




public class Vowels {

	static void Vowels(char ch) {
		ch = Character.toUpperCase(ch);
		switch (ch) {
		case 'A':
			System.out.println(ch + " is a vowel");
			break;
		case 'E':
			System.out.println(ch + " is a vowel");
			break;
		case 'I':
			System.out.println(ch + " is a vowel");
			break;
		case 'O':
			System.out.println(ch + " is a vowel");
			break;
		case 'U':
			System.out.println(ch + " is a vowel");
			break;
		default:
			System.out.println(ch + " is not a vowel");
		}
	}

	public static void main(String[] a) {
		Vowels('d');
		Vowels('I');
		Vowels('i');
	}
}




/*public class Vowels {
	
	void isVowel(char ch) {

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
			System.out.println(ch+ " is not a vowel");
		}
	}

	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		vowels.isVowel('d');
		vowels.isVowel('I');
		vowels.isVowel('e');
		
	}

}  */