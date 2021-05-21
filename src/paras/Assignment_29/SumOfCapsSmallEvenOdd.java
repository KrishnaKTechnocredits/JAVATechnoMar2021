/*
Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
 */

package paras.Assignment_29;

import java.util.Scanner;

public class SumOfCapsSmallEvenOdd {

		String smallLetter = "";
		String capsLetter = "";
		String temp = "0";
		String output = "";
		
		int evenSum = 0;
		int oddSum = 0;
		int num = 0;
		
		void getSumOfCapsSmallEvenOdd(String str){
			
			for(int index = 0; index <str.length(); index++ ) {
				char ch = str.charAt(index);
				if(Character.isDigit(ch)) {
					temp = temp + ch ;
					num = Integer.parseInt(temp);
				}
				else {
					if(num % 2 == 0) {
						evenSum = evenSum + num;
					}
					else {
						oddSum = oddSum + num;
					}
					num = 0;
					temp = "0";
					
					if(Character.isLetter(ch)) {
						
						if(Character.isUpperCase(ch)) {
							capsLetter = capsLetter + ch;
						}
						else if(Character.isLowerCase(ch)) {
							smallLetter = smallLetter + ch;
						}
					}
				}
					
			}
			if(num % 2 == 0) {
				evenSum = evenSum + num;
			}
			else {
				oddSum = oddSum + num;
			}
			output = oddSum+capsLetter+smallLetter+evenSum;
			System.out.println("Sum of all odd numbers + capital letter + small letter + sum of all even numbers: " + output);
		}
		
		public static void main(String[] args) {
			SumOfCapsSmallEvenOdd sumOfCapsSmallEvenOdd = new SumOfCapsSmallEvenOdd();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the String:");
			String input = scanner.next();
			sumOfCapsSmallEvenOdd.getSumOfCapsSmallEvenOdd(input);
		}
}
