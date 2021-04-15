//Program 2: return a difference between sum of even number and odd numbers.
//From given numbers, count the odd and even numbers.
//input : 10,23,26,27,88,87,65
//output : evenSum - oddSum

package kapil.Array;

import java.util.Scanner;

public class DiffNumbers {

	int getDiffEvenOddNo(int[] input) {
		int evensum = 0;
		int diff = 0;
		int oddsum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				evensum = evensum + input[index];
			evensum++;
			if (input[index] % 2 != 0)
				oddsum = oddsum + input[index];
			oddsum++;
		}
		{
			diff = evensum - oddsum;
			System.out.println("Difference number : " + (diff));
			return diff;
		}
	}

	public static void main(String[] args) {
		DiffNumbers diffnumbers = new DiffNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many number you want to enter ?");
		int size = scanner.nextInt();
		int[] num = new int[size];

		for (int index = 0; index < num.length; index++) {
			System.out.println("Enter number : ");
			num[index] = scanner.nextInt();
		}
		{
			diffnumbers.getDiffEvenOddNo(num);
		}
	}
}
