package upasana.assignment_18;

import java.util.Scanner;
public class AsciiValOfCh {
	
	int getAsciiOfChar(char ch) {
		return ch;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		char ch = scanner.next().charAt(0);
		int ascii=new AsciiValOfCh().getAsciiOfChar(ch);
		System.out.println("Ascii value of the given character " +ch+" is "+ascii);
		scanner.close();
	}
}
