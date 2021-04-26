/*WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53*/

package sangeeta.CodingExam;

import java.util.Scanner;

public class CodingExam2 {

	void sumOfIntegersInString(String str) {
		int digitstr = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				digitstr = str.charAt(index);
		}
		System.out.println("Sum of digits in a string is "+digitstr);

	}

	public static void main(String[] a) {
		CodingExam2 codingExam2 = new CodingExam2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = scanner.next();
		codingExam2.sumOfIntegersInString(str);
	}

}
