/*Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
*/

package rupaliAssignment13;

public class Vowel {
	
	void ischarvowel(char ch) {
		switch(ch) {
		case 'a':
		case 'A':
			System.out.println(ch+" is Vowel");
		
		case 'e':
		case 'E':
			System.out.println(ch+" is Vowel");
			
		case 'i':
		case 'I':
			System.out.println(ch+" is Vowel");
			break;
		case 'o':
		case 'O':
			System.out.println(ch+" is Vowel");
			break;
		case 'u':
		case 'U':
			System.out.println(ch+" is Vowel");
			break;
		default:
			System.out.println(ch+" is not Vowel");
	}
}

	public static void main(String[] args) {
		Vowel vowel=new Vowel();
		vowel.ischarvowel('d');
		vowel.ischarvowel('e');
		vowel.ischarvowel('i');
		vowel.ischarvowel('Q');
		vowel.ischarvowel('I');
		
	}
}
