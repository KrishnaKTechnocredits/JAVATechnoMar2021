//return true if you find a target number from given array else return false.
//input : 10,23,23,44,23,10,23,4,23
//target number : 45
//output : Number 45 doesnt found in given array.
//
//boolean isNumberPresent(int[] arr,int target){
//	if(arr[index] == target)
package prashant;

import java.util.Scanner;

public class ArrTargetNumReturn {

	boolean isNumberPresent(int[] num1, int target) {

		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == target) {
				System.out.println("Given Number " + target + " found in array");
				return true;
			}
		}
		System.out.println("Given Number " + target + " not found in array");
		return false;
	}

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter Size of  Array:");
		int temp = num.nextInt();
		int[] num1 = new int[temp];
		System.out.println("Enter" + " " + temp + " " + "Integers Numbers:");

		for (int i = 0; i < temp; i++) {
			num1[i] = num.nextInt();
		}
		System.out.println("Enter target Number:");
		int target = num.nextInt();
		new ArrTargetNumReturn().isNumberPresent(num1, target);
		num.close();
	}
}
