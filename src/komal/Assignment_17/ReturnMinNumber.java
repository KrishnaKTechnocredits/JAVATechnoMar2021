package komal.Assignment_17;

import java.util.Scanner;

/*Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/

public class ReturnMinNumber{
	
	int minNumberFound(int[] inputNumber) {
		int minNumber = inputNumber[0];
		for (int index = 1; index < inputNumber.length; index++) {
			if (minNumber > inputNumber[index])
				minNumber = inputNumber[index];
		}
		return minNumber;
	}

	public static void main(String[] args) {
		ReturnMinNumber returnMinNumber = new ReturnMinNumber();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers You want to Enter:-");
		int size = scanner.nextInt();
		int[] inputNumber = new int[size];

		for (int index = 0; index < inputNumber.length; index++) {
			System.out.println("Enter Number " + (index + 1));
			inputNumber[index] = scanner.nextInt();
		}
		int minNumber = returnMinNumber.minNumberFound(inputNumber);
		System.out.println("Min Number in the Given Array is: " + minNumber);
		scanner.close();
	}

}
