/*Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)

*/
package shilpa.Shilpa_Assignment_17;

import java.util.Scanner;

public class IsNoPresentReturnBoolean {
	boolean getTargetNumber(int[] numbers, int targetno) {
		for (int index = 0; index < numbers.length; index++) {
			if (targetno == numbers[index])

				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IsNoPresentReturnBoolean isNoPresentReturnBoolean = new IsNoPresentReturnBoolean();

		int[] input1 = new int[6];
		int targetno;
		System.out.println("Enter any five Numbers");
		for (int index = 0; index < input1.length; index++) {
			input1[index] = scanner.nextInt();
		}
		System.out.println("Enter target no");
		targetno = scanner.nextInt();
		boolean isno = isNoPresentReturnBoolean.getTargetNumber(input1, targetno);
		if (isno == true)
			System.out.println("Number " + targetno + " found in a given array");
		else
			System.out.println("Number " + targetno + " dosent found in a given array");
		scanner.close();
	}

}
