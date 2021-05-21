package prachi.Assignment_13;

/*WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel

sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
 */

public class SwitchCase {

	void isVovel(char ch) {

		switch(ch) {
		case 'a':
		case 'A':
			System.out.println(ch + " is a Vovel");
			break;
		case 'e':
		case 'E':
			System.out.println(ch + " is a Vovel");
			break;
		case 'i':
		case 'I':
			System.out.println(ch + " is a Vovel");
			break;
		case 'o':
		case 'O':
			System.out.println(ch + " is a Vovel");
			break;
		case 'u':
		case 'U':
			System.out.println(ch + "  is a Vovel");
			break;
		default :
			System.out.println(ch + "  is not a Vovel");
		}
	}

	public static void main(String[] args) {
		SwitchCase switchcase = new SwitchCase();
		switchcase.isVovel('d');
		switchcase.isVovel('I');
		switchcase.isVovel('i');
	}
}