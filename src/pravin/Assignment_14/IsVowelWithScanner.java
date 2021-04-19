/*Assignment 14 using scanner class
 * WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel */

	package pravin.Assignment_14;
	
	import java.util.Scanner;
	public class IsVowelWithScanner {
		void display() {
	
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Character: ");
			char ch = scanner.next().charAt(0);
			ch = Character.toUpperCase(ch);
	
			switch(ch) {
	
			case 'A':
				System.out.println(" A is a Vowel");
				break;
	
			case 'E':
				System.out.println(" E is a Vowel");
				break;
	
			case 'I':
				System.out.println(" I is a Vowel");
				break;
	
			case 'O':
				System.out.println(" O is a Vowel");
				break;
	
			case 'U':
				System.out.println(" U is a Vowel");
				break;	
	
			default :
				System.out.println(" Its not a vowel");
				break;
			}
		}
		public static void main(String[] arg) {
			IsVowelWithScanner isVowelWithScanner = new IsVowelWithScanner();
			isVowelWithScanner.display();
		}
	
	}
	
