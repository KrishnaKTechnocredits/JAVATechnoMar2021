package anubhav.StringOperations;

/*Sum of all the digits in a string*/
import java.util.Scanner;

public class SumOfAllDigitsInAString {

	void sumOfAllDigits(String input) {
		int sumOfDigits= 0;
		int length= input.length();
		
		for (int index=0; index< length ; index++) {
			char ch=input.charAt(index);
			if (Character.isDigit(ch)) {
				int number = Character.getNumericValue(ch);
				sumOfDigits= sumOfDigits + number;
			}
		}
		System.out.println("Sum of all the digits in the string is :" + sumOfDigits);
	}
	
	public static void main (String[] args) {
		SumOfAllDigitsInAString sumOfAllDigitsInAString= new SumOfAllDigitsInAString();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the string :");
		String input=scanner.nextLine();
		sumOfAllDigitsInAString.sumOfAllDigits(input);
		scanner.close();
	}
}
