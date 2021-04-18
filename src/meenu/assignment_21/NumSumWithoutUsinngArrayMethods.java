package meenu.assignment_21;

/*
 WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all digits in String is: 53
*/

import java.util.Scanner;

public class NumSumWithoutUsinngArrayMethods {
	
	int getSum(String word){
		int sumOfDigit = 0;
		for(int index = 0;index<word.length();index++) {
			if(word.charAt(index)>=48 && word.charAt(index)<=57)
				sumOfDigit = sumOfDigit +(Integer.parseInt(""+word.charAt(index)));
		}
		return sumOfDigit;
	}	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String word = scanner.next();
		NumSumWithoutUsinngArrayMethods n1 = new NumSumWithoutUsinngArrayMethods();
		System.out.println("Sum of all digits in String is : "+n1.getSum(word));
	}
}
