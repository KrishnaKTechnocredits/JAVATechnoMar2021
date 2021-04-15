package bhavana_assignment_14;
import java.util.Scanner;
public class VowelScanner {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character");
		String ch=scanner.next();
		switch(ch) {
			case"a":
			case"A":System.out.println("a or A is a vowel");
					break;
			case"e":
			case"E":System.out.println("e or E is a vowel");	
		
			case"i":
			case"I":System.out.println("i or I is a vowel");
					break;
			
			case"o":
			case"O":System.out.println("o or O is a vowel");
					break;
					
			case"u":
			case"U":System.out.println("u or U is a vowel");
					break;
					
			default:System.out.println(ch+" is not a vowel");
		}
		
	}
	
}
