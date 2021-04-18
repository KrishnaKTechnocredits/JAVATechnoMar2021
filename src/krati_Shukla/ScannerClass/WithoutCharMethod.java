//Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
//WAP to sum all the numbers in given string.

package krati_Shukla.ScannerClass;

import java.util.Scanner;

public class WithoutCharMethod {
	
	void CountDiffChar(String input) {
		
		int countUpper=0;
		int countLower=0;
		int countDigit=0;
		int countSpecial=0;
		char[] charArr = new char[25];
		int length = input.length();
		charArr = input.toCharArray();
		
		for(int index=0; index<length; index++) {
			if (charArr[index]>='A'&& charArr[index]<='Z')
				countUpper++;
			else if (charArr[index]>='a' && charArr[index]<='z')
				countLower++;
			else if (charArr[index]>='0'&& charArr[index]<='9')
				countDigit++;
			else
				countSpecial++;
		}
		System.out.println("Upper case count is : "+countUpper);
		System.out.println("Lower case count is : "+countLower);
		System.out.println("Letter case count is : "+(countUpper+countLower));
		System.out.println("Digit case count is : "+countDigit);
		System.out.println("Special character case count is : "+countSpecial);
	}
	
	void SumStringNos(String input) {
		
		int sumDigit=0;
		int length = input.length();
		char[] charArr = new char[25];
		charArr = input.toCharArray();
		
		for(int index=0; index<length; index++) {
			if(charArr[index]>='0'&& charArr[index]<='9') {
				int temp = charArr[index] - '0';
				sumDigit = sumDigit+temp;
			}
		}
		System.out.println("Sum of digits in string is : "+sumDigit);		
	}
	
	public static void main(String[] a) {
		WithoutCharMethod withoutCharMethod = new WithoutCharMethod();
		System.out.println("Enter the string :");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		withoutCharMethod.CountDiffChar(input);
		withoutCharMethod.SumStringNos(input);
	}

}
