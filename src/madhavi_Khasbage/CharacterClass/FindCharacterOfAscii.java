package madhavi_Khasbage.CharacterClass;
import java.util.Scanner;

/*Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)*/

public class FindCharacterOfAscii {
	
	public static void main(String[] args) {		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter numeric ascii value:");
		char ch=(char)scanner.nextInt();
		System.out.println("Character value of this ascii is:" + ch);	
		scanner.close();
	}

}
