/*Assignment - 17
Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		}
*/
package neha_Rathi.assignment17;

import java.util.Scanner;

public class FindNumber {

	boolean isNumberPresent(int[] input, int num) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] == num)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		FindNumber findNumber = new FindNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many nos do you want to enter");
		int size = sc.nextInt();
		int[] input = new int[size];
		for (int index = 0; index < input.length; index++) {
			System.out.println("Enter no " + index);
			input[index] = sc.nextInt();
		}
		System.out.println("Enter number which you want to find");
		int targetNum = sc.nextInt();
		boolean flag = findNumber.isNumberPresent(input, targetNum);
		if (flag)
			System.out.println("Number " + targetNum + " found in given array.");
		else
			System.out.println("Number " + targetNum + " doesnt found in given array.");
	}
}
