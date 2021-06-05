//Program 2 : triplet having maximum sum, index overlapping is allowed.
//input : [1,10,2,3,1,11,4,2,1]
//output : 11,4,2 -> 17
package neha_Rathi.codingExam18;

import java.util.*;

public class Triplet1 {
	int sum = 0;

	HashSet<Integer> findTriplet(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		int num = arr.length % 3;
		for (int index = 0; index < arr.length - num - 2; index++) {
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
		Triplet1 triplet1 = new Triplet1();
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		System.out.println(triplet1.findTriplet(input) + " -> " + triplet1.sum);
	}
}
