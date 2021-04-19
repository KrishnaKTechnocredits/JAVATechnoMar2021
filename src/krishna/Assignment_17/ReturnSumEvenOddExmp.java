package krishna.Assignment_17;

import java.util.Scanner;
/*
 Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    	output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}
 */

public class ReturnSumEvenOddExmp {
	int evenCount, oddCount, evenSum, oddSum;

	int getDifference(int[] input) {
		int difference;
		for (int index = 0; index < input.length; index++) {

			if (input[index] % 2 == 0) {
				evenCount++;
				evenSum = input[index] + evenSum;

			} else {
				oddCount++;
				oddSum = input[index] + oddSum;

			}
		}
		System.out.println("Even sum: " + evenSum);
		System.out.println("Odd sum: " + oddSum);
		System.out.println("------------------------");
		System.out.println("Count of even numbers in given array input :" + evenCount);
		int oddCount = input.length - evenCount;
		System.out.println("Count of odd numbers in given array input :" + oddCount);
		System.out.println("------------------------");
		if(evenSum>oddSum) {
			difference = evenSum - oddSum;
		}else {
			difference = oddSum-evenSum;
		}
		
		return difference;
	}

	public static void main(String[] args) {
		ReturnSumEvenOddExmp returnSumEvenOddExmp = new ReturnSumEvenOddExmp();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to give :");
		int count = scanner.nextInt();
		// create array and name is number
		int[] number = new int[count];

		for (int index = 0; index < count; index++) {
			System.out.println("Enter the number :");
			number[index] = scanner.nextInt();
		}
		int sumDifference = returnSumEvenOddExmp.getDifference(number);
		System.out.println("Difference of evensum and oddsum is :" + sumDifference);
	}
}
