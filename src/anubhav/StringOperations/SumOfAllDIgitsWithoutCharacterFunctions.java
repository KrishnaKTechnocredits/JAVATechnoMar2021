package anubhav.StringOperations;

import java.util.Scanner;

public class SumOfAllDIgitsWithoutCharacterFunctions {

	void sumStringNos(String input) {

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

	public static void main (String[] args) {
		SumOfAllDIgitsWithoutCharacterFunctions sumOfAllDIgitsWithoutCharacterFunctions= new SumOfAllDIgitsWithoutCharacterFunctions();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the string :");
		String str= scanner.nextLine();
		sumOfAllDIgitsWithoutCharacterFunctions.sumStringNos(str);
		scanner.close();
	}
}