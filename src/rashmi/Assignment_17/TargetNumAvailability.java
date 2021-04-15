/*Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}*/

package rashmi.Assignment_17;

import java.util.Scanner;

public class TargetNumAvailability {

	boolean isTargetNumAvailable(int[] num, int targetNum) {

		for (int index = 0; index < num.length; index++) {
			if (num[index] == targetNum) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int arr[] = new int[9];
		TargetNumAvailability targetNumAvailability = new TargetNumAvailability();
		Scanner sc = new Scanner(System.in);
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter the number " + (index + 1));
			arr[index] = sc.nextInt();
		}
		System.out.println("Enter the target number");
		int tNum = sc.nextInt();
		sc.close();
		boolean targetNum = targetNumAvailability.isTargetNumAvailable(arr, tNum);
		if (targetNum == true) {
			System.out.println("Number " + tNum + " is present in given array");
		} else {
			System.out.println("Number " + tNum
					+ " is not present in given array");
		}
	}
}
