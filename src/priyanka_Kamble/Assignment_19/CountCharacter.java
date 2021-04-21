package priyanka_Kamble.Assignment_19;
/*
 * Assignment 19: 14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
 */

import java.util.Scanner;

public class CountCharacter {

	String count(String input) {
		int cntU=0,cntL=0;
		for (int indexU=0 ; indexU<input.length(); indexU++) {
			if(input.charAt(indexU)>=65 && input.charAt(indexU)<=90)
				cntU++;
		}	
		System.out.println("upper Case Count = " +cntU);	
		for (int indexL=0 ; indexL<input.length(); indexL++) {
			if(input.charAt(indexL)>=97 && input.charAt(indexL)<=122)
				cntL++;
		}
		System.out.println("Lower case Count = "+cntL);
		if(cntU>cntL) {
			System.out.println("Techno");
			return "Techno";
		}
		else { 
			System.out.println("Credits");
			return "Credits";
		}
	}

	public static void main(String[] args) {
		CountCharacter character = new CountCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1) Enter the String - ");
		String input = scanner.nextLine(); // char ch = input.charAt(0);
		character.count(input);
		
	}
}
