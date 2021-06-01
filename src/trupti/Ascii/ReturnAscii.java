package trupti.Ascii;

import java.util.Scanner;

/*Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)*/

public class ReturnAscii {
	int getAsciiOfChar(char c) {
	    int ascii=c; 
		return ascii;
	}
	

	public static void main(String[] args) {
		ReturnAscii returnascii=new ReturnAscii();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Character ");
		String temp=scanner.next();
		char ch=temp.charAt(0);
	    int ans=returnascii.getAsciiOfChar(ch);
	    System.out.println("Ascii value of "+ch+ " is "+ans);
       scanner.close();
	}

}
