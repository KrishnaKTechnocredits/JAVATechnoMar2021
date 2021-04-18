package aashay.Assignment_21;
/*
 * Assignment 21: 14th April'2021

 WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

- without using Character class method.
 */

public class SumOfDigits {
	

	void sumOfNumbers(String input) {
		int sum = 0;
		for(int i=0; i<= input.length()-1;i++) {
			char c = input.charAt(i) ;
		    if(c >= '0' && c <= '9') {
		    	int digit = Integer.parseInt(String.valueOf(c));
		    	sum+=  digit;
			}
		}
		System.out.println("Sum of all digits in String is: "+sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits sumOfDigits = new SumOfDigits();
		sumOfDigits.sumOfNumbers("J7yu9y8h1h8j4b7j3jjb6");
	}

}
