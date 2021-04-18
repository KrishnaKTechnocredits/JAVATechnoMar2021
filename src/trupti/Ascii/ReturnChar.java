package trupti.Ascii;
import java.util.Scanner;

public class ReturnChar {
	char getCharOfAscii(int ascii) {
		char ch=(char)ascii;
		return ch;
	}

	public static void main(String[] args) {
		ReturnChar returnchar=new ReturnChar();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ASCII value :");
		int ascii=scanner.nextInt();
		char ans=returnchar.getCharOfAscii(ascii);
		System.out.println("Character for given Ascii value is "+ans);
		scanner.close();
	}

}
