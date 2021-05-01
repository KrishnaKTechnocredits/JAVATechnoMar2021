/*
 Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */
package priyanka_Panat.coding_exam_1;

import java.util.Scanner;


public class IndexOfNumber {

		int[] geNumbersOfExpectedSum(int[] num, int target) {
			int[] output = new int[2];
			for (int i = 0; i < num.length; i++) {
				for (int j = 1; j < num.length; j++) {
					if (num[i] + num[j] == target) {
						output[0] = i;
						output[1] = j;

					}
				}
			}
			return output;
		}

		public static void main(String[] args) {
			IndexOfNumber indexOfNumber = new IndexOfNumber();
			int size;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array");
			size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the elements in an array");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the target number");
			int target = sc.nextInt();
			sc.close();
			int[] answer = indexOfNumber.geNumbersOfExpectedSum(arr, target);
			System.out.println(answer[0] + " " + answer[1]);

		}
	}

