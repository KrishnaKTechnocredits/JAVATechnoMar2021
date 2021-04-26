/*WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53*/

package sangeeta.CodingExam;

import java.util.Scanner;

public class CodingExam2 {

	int sumOfIntegersInString(String str) {
		int digitsum = 0;
		char ch;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			boolean isDigit = Character.isDigit(ch);
			if (isDigit)
				temp = temp + ch;
			else {
				digitsum = digitsum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		digitsum = digitsum + Integer.parseInt(temp);
		return digitsum;
	}

	public static void main(String[] a) {
		CodingExam2 codingExam2 = new CodingExam2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = scanner.next();
		int output = codingExam2.sumOfIntegersInString(str);
		System.out.println("Sum of digits in a string is "+output);
	}

}
