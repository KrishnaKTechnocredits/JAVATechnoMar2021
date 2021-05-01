package surabhi.assignment18;

import java.util.Scanner;

public class ReturnChar {
	char findCharacter(int ascii) {
		char ch=(char)ascii;
		return ch;
	}
	
	public static void main(String[] args) {
		ReturnChar returnChar=new ReturnChar(); 
		System.out.println("Please enter the ascii for character to be found ");
		
		Scanner scanner=new Scanner(System.in);
		int ascii=scanner.nextInt(); 
		char ch=returnChar.findCharacter(ascii); 
		System.out.println("Character of Ascii value "+ascii + " is "+ch);
	}
}
