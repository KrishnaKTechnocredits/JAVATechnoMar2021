package surabhi.assignment18;

import java.util.Scanner;

public class ReturnAsciiValue {
	int asciiValue(char ch) {
		int ascii=ch;
		return ascii;
	}
	
	public static void main(String[] args) {
		ReturnAsciiValue returnAsciiValue=new ReturnAsciiValue(); 
		System.out.println("Please enter the character for ascii value ");
		
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0); 
		int result=returnAsciiValue.asciiValue(ch); 
		System.out.println("ascii value of "+ch + " is "+result);
	}
}
