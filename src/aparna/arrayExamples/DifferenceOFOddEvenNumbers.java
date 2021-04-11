/*Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	}
 * 
 */
package aparna.arrayExamples;

import java.util.Scanner;

public class DifferenceOFOddEvenNumbers {

	int evenOddNumDifference(int[] inputNumber) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < inputNumber.length; index++) {
			if (inputNumber[index] % 2 == 0) {
				evenSum = evenSum + inputNumber[index];
			} else
				oddSum = oddSum + inputNumber[index];
		}
		System.out.println("Even Number Sum is: " + evenSum + " \nOdd Number Sum is: " + oddSum
				+ " \nSo Difference of Both is = " + (evenSum - oddSum));
		return (evenSum - oddSum);
	}

	public static void main(String[] args) {
		DifferenceOFOddEvenNumbers differenceOFOddEvenNumbers = new DifferenceOFOddEvenNumbers();
		// int[] inputNumber1 = { 10,20,30,40,50,3,7,9,11,13,555,999 };
		// int
		// differenceofOddNEven=differenceOFOddEvenNumbers.evenOddNumDifference(inputNumber1);
		// System.out.println("Difference of Even and Odd Number in Given Array is: "
		// +differenceofOddNEven);

		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers You want to Enter:- ");
		int size = scanner.nextInt();
		int[] inputNumber = new int[size];

		for (int index = 0; index < inputNumber.length; index++) {
			System.out.println("Enter Numbers " + (index + 1));
			inputNumber[index] = scanner.nextInt();
		}
		differenceOFOddEvenNumbers.evenOddNumDifference(inputNumber);
		scanner.close();
	}
}
