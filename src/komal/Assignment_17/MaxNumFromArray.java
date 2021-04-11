package komal.Assignment_17;

import java.util.Scanner;

/*Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/

public class MaxNumFromArray {
	int maxNumberFound(int[] inputNumber) {
		int maxNumber = inputNumber[0];
		for (int index = 1; index < inputNumber.length; index++) {
			if (maxNumber < inputNumber[index])
				maxNumber = inputNumber[index];
		}
		return maxNumber;
	}

	public static void main(String[] args) {
		MaxNumFromArray maxNumFromArray = new MaxNumFromArray();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers You want to Enter:-");
		int size = scanner.nextInt();
		int[] inputNumber = new int[size];

		for (int index = 0; index < inputNumber.length; index++) {
			System.out.println("Enter Number " + (index + 1));
			inputNumber[index] = scanner.nextInt();
		}
		int maxNumber = maxNumFromArray.maxNumberFound(inputNumber);
		System.out.println("Max Number in the Given Array is: " + maxNumber);
		scanner.close();
	}

}
