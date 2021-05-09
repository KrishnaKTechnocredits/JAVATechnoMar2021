package komal.coding_exam_2;
/*Program 1 : 
WAP to do sum of all the integer from the given string
Input: String str = "12h14i4w8sdc15"
Output: 12+14+4+8+15 = 53*/

import java.util.Scanner;

public class SumOfAllinInteger {

	int getSumOfAllInteger(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				if (index < str.length() - 1 && Character.isDigit(str.charAt(index + 1))) {
					sum = sum + Character.getNumericValue(str.charAt(index)) * 10
							+ Character.getNumericValue(str.charAt(index + 1));
					index += 1;
				} else
					sum = sum + Character.getNumericValue(str.charAt(index));
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scanner.next();
		SumOfAllinInteger sumOfAllinInteger = new SumOfAllinInteger();
		System.out.println("Sum of all Interger in given string is : " + sumOfAllinInteger.getSumOfAllInteger(str));
	}
}