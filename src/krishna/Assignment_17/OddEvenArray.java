package krishna.Assignment_17;

import java.util.Scanner;

/*
Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output :even -> 3
		odd ->  array.length - evenCount

*/
public class OddEvenArray {

	int evenCount;

	void countOddEven(int[] input) {

		for (int index = 0; index < input.length; index++) {

			if (input[index] % 2 == 0) {
				// System.out.println(input[index]);
				evenCount++;
			}

		}
		System.out.println("Count of even numbers in given array input :" + evenCount);
		int oddCount = input.length - evenCount;
		System.out.println("Count of odd numbers in given array input :" + oddCount);
	}

	public static void main(String[] args) {
		OddEvenArray oddEvenArray = new OddEvenArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to give :");
		int count = scanner.nextInt();
		// create array and name is number
		int[] number = new int[count];

		for (int index = 0; index < count; index++) {
			System.out.println("Enter the number :");
			number[index] = scanner.nextInt();
		}

		oddEvenArray.countOddEven(number);

	}

}
