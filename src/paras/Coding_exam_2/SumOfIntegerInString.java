/*
Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
 */
package paras.Coding_exam_2;

import java.util.Scanner;

public class SumOfIntegerInString {

	int sumofInteger(String input) {
		String str = "";
		int sum = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) 
				str = str + ch; // If found any digit then add into temp
			else {
					sum = sum + Integer.parseInt(str);
					str = "0";
				}
				//int num = ch - '0';
				//sum = sum +num;
		}
		return sum + Integer.parseInt(str);
	}
	
	public static void main(String[] args) {
		SumOfIntegerInString sumOfIntegerInString = new SumOfIntegerInString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plase Enter the String");
		String input = scanner.next();
		int output = sumOfIntegerInString.sumofInteger(input);
		System.out.println("Sum of all the integer from the given string: " + output);
		scanner.close();
	}
}
