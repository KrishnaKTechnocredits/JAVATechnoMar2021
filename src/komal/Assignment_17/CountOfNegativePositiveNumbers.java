package komal.Assignment_17;
/*Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/

import java.util.Scanner;

public class CountOfNegativePositiveNumbers {
	void positiveNegativeNumCount(int[] inputNumber) {
		int positiveCount = 0;
		for (int index = 0; index < inputNumber.length; index++) {
			if (inputNumber[index] >= 0)
				positiveCount++;
		}
		System.out.println("Total Count of Positive Numbers are: " + positiveCount);
		System.out.println("Total Count of Negative Numbers are: " + (inputNumber.length - positiveCount));
	}

	public static void main(String[] args) {
		CountOfNegativePositiveNumbers countOfNegativePositiveNumbers = new CountOfNegativePositiveNumbers();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers You want to Enter:- ");
		int size = scanner.nextInt();
		int[] inputNumber = new int[size];

		for (int index = 0; index <= inputNumber.length - 1; index++) {
			System.out.println("Enter Number " + (index + 1));
			inputNumber[index] = scanner.nextInt();
		}
		countOfNegativePositiveNumbers.positiveNegativeNumCount(inputNumber);
		scanner.close();
	}

}
