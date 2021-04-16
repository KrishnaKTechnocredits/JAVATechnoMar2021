//WAP to sum all the numbers in given string.

package krati_Shukla.ScannerClass;

import java.util.Scanner;

public class SumStringNos {
	
	void StringNumberSum(String input) {
		 int length = input.length();
		 int digit =0;
		 	 
		 for(int index=0; index<length; index++) {
			 char ch = input.charAt(index);
			 if(Character.isDigit(ch)) {
				 int temp = Character.getNumericValue(ch);
				 digit = digit+temp;
			 }
		}
		System.out.println("Sum of all digits in String is: "+digit);
	}
	
	public static void main(String[] a) {
		SumStringNos sumStringNos = new SumStringNos();
		System.out.println("Enter the string :");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		sumStringNos.StringNumberSum(input);
	}

}
