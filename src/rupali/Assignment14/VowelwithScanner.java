package rupali.Assignment14;
import java.util.Scanner;

public class VowelwithScanner {

		void ischarvowel(char ch) {
			switch(ch) {
			case 'a':
			case 'A':
				System.out.println(ch+" is Vowel");
				break;
			case 'e':
			case 'E':
				System.out.println(ch+" is Vowel");
				break;
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
		VowelwithScanner vowelwithScanner= new VowelwithScanner();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a letter..");
		String s;
		s=scanner.next();
		char ch=s.charAt(0);
		vowelwithScanner.ischarvowel(ch);
		System.out.println("Please enter a letter..");
		s=scanner.next();
		ch=s.charAt(0);
		vowelwithScanner.ischarvowel(ch);
		System.out.println("Please enter a letter..");
		s=scanner.next();
		ch=s.charAt(0);
		vowelwithScanner.ischarvowel(ch);
		System.out.println("Thank you");
	}

}
