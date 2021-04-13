package krishna.Assignment_17;

import java.util.Scanner;

/*
Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesn’t found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  
*/
public class TargetNumFind {
	boolean returnValue;

	boolean isNumberPresent(int[] number, int targetNumber) {
		for (int index = 0; index < number.length; index++) {
			if (number[index] == targetNumber) {
				returnValue = true;
				break;
			} else {
				returnValue = false;
			}
		}
		return returnValue;
	}

	public static void main(String[] args) {
		TargetNumFind targetNumFind = new TargetNumFind();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to give :");
		int count = scanner.nextInt();
		int[] number = new int[count];

		System.out.println("Enter the target number :");
		int targetNum = scanner.nextInt();

		for (int index = 0; index < count; index++) {
			System.out.println("Enter the number :");
			number[index] = scanner.nextInt();
		}
		
		boolean isTargetValue = targetNumFind.isNumberPresent(number, targetNum);
		System.out.println("Number "+ targetNum+ " does not found in given array :");
	}
}
