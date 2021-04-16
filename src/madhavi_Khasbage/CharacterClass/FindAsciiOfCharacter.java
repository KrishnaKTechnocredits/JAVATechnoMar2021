package madhavi_Khasbage.CharacterClass;
import java.util.Scanner;

/*Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)*/

public class FindAsciiOfCharacter {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter any character to know it's ascii value:");
		int i= scanner.next().charAt(0);
		System.out.println("Ascii value of this character is:" + i);	
		scanner.close();
	}
}
