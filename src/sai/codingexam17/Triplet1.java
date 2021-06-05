package sai.codingexam17;

/*
 * No overlapping allowed
 */

import java.util.LinkedHashSet;

public class Triplet1 {

	int sum = 0;

	LinkedHashSet<Integer> calcSum(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		int num = arr.length % 3;
		for (int index = 0; index < arr.length - num - 2; index = index + 3) {
			int temp = 0;
			temp = arr[index] + arr[index + 1] + arr[index + 2];
			if (sum < temp) {
				set.clear();
				sum = temp;
				set.add(arr[index]);
				set.add(arr[index + 1]);
				set.add(arr[index + 2]);
			}
		}
		return set;
	}

	public static void main(String[] args) {
		Triplet1 t1 = new Triplet1();
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		System.out.println("Maximum sum of triplet without allowing overlapping is " + t1.calcSum(input) + " " + t1.sum);
	}
}