/*
 Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
 */

package pavan.PavanB_coding_exam_2;

import java.util.Scanner;

public class ConcIntigerSumfrString {

	void getSumofInt(String input) {

		String temp = "0";
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		sum = sum + Integer.parseInt(temp);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input String");
		String input = scan.next();
		ConcIntigerSumfrString obj = new ConcIntigerSumfrString();
		obj.getSumofInt(input);

	}
}
