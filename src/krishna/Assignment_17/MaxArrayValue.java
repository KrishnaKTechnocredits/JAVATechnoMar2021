package krishna.Assignment_17;

import java.util.Scanner;
/*
Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
*/

public class MaxArrayValue {
	
	int max(int[] number) {
		int maxNum=number[0];
		for (int index = 1; index < number.length; index++) {
			if(maxNum<number[index]) {
				maxNum=number[index];
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		MaxArrayValue maxArrayValue = new MaxArrayValue();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to give :");
		int count = scanner.nextInt();
		int[] number = new int[count];

		for (int index = 0; index < count; index++) {
			System.out.println("Enter the number :");
			number[index] = scanner.nextInt();
		}
		int maximumNumber = maxArrayValue.max(number);
		System.out.println("The maximum number is :"+maximumNumber);
	}

}
