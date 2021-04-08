package madhavi_Raut.Assignment_14;
/*Assignment - 14 Program 01 : 8th April'2021
WAP to evaluate whether given character is vowel or not using switch case and Scanner class(taking user input).
sample input1 : d
sample output1 : d is not a vowel
sample input2 : I
sample output2 : I is a vowel
sample input3 : i
sample output3 : i is a vowel*/
import java.util.Scanner;

public class FindVowelUsingScanner {

	void checkVowel(char alphabet) {
		switch (alphabet) {
		case 'A':
		case 'a':
			System.out.println("Given alphabet " + alphabet + " is vowel.");
			break;
		case 'E':
		case 'e':
			System.out.println("Given alphabet " + alphabet + " is vowel.");
			break;
		case 'I':
		case 'i':
			System.out.println("Given alphabet " + alphabet + " is vowel.");
			break;
		case 'O':
		case 'o':
			System.out.println("Given alphabet " + alphabet + " is vowel.");
			break;
		case 'U':
		case 'u':
			System.out.println("Given alphabet " + alphabet + " is vowel.");
			break;
		default:
			System.out.println("Given alphabet " + alphabet + " is NOT vowel.");
		}
	}

	public static void main(String[] args) {
		FindVowelUsingScanner findVowelUsingScanner = new FindVowelUsingScanner();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Do you want to check whether given alphabet is vowel or not? Type yes/y or no/n");
			String input = scanner.nextLine();
			if (input.equals("yes") || input.equals("y")) {
				System.out.println("Please enter an alphabet.");
				String character = scanner.nextLine();
				char alphabet = character.charAt(0);
				findVowelUsingScanner.checkVowel(alphabet);
			} else if (input.equals("no") || input.equals("n")) {
				flag = false;
				System.out.println("Bye!");
				scanner.close();
			} else
				System.out.println("Incorrect Input");
		}
	}
}
