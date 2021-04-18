package meenu.assignment_20;

/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all digits in String is: 53
*/

import java.util.Scanner;

public class SumOfNumInString {
	
	int getSum(String word){
		int sumOfDigit = 0;
		for(int index = 0;index<word.length();index++) {
			if(Character.isDigit(word.charAt(index)))
				sumOfDigit = sumOfDigit + Character.getNumericValue(word.charAt(index));
		}
		return sumOfDigit;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String word = scanner.next();
		SumOfNumInString sumOfNumInString = new SumOfNumInString();
		System.out.println("Sum of all digits in String is : "+sumOfNumInString.getSum(word));
		
		

	}

}
