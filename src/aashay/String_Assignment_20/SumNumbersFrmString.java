package aashay.String_Assignment_20;
/*
 * Assignment 20: 14th April'2021
2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */

public class SumNumbersFrmString {
	
	void sumOfNumbers(String input) {
		int sum = 0;
		for(int i=0; i<= input.length()-1;i++) {
			 if(Character.isDigit(input.charAt(i))) {
				sum+= Character.getNumericValue(input.charAt(i));
			}
		}
		System.out.println("Sum of all digits in String is: "+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumNumbersFrmString sumNumbersFrmString = new SumNumbersFrmString();
		sumNumbersFrmString.sumOfNumbers("J7yu9y8h1h8j4b7j3jjb6");

	}

}
