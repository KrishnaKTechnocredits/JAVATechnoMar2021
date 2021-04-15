/*Program 2: return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}
*/
package shilpa.Shilpa_Assignment_17;

import java.util.Scanner;

public class DiffBetnSumOfEvenAndOdd {

	int sumOfEvenNos;
	int sumOfOaddNos;

	void getDifference(int[] numbers) {

		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] % 2 == 0)
				sumOfEvenNos = sumOfEvenNos + numbers[index];
			else
				sumOfOaddNos = sumOfOaddNos + numbers[index];
		}
		System.out.println("Evensum-Oddsum = " + Math.abs(sumOfOaddNos - sumOfEvenNos));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] input1 = new int[6];
		DiffBetnSumOfEvenAndOdd diff = new DiffBetnSumOfEvenAndOdd();
		System.out.println("Enter Numbers");
		for (int index = 0; index < input1.length; index++) {
			input1[index] = scanner.nextInt();
		}
		diff.getDifference(input1);
		scanner.close();

	}
}
