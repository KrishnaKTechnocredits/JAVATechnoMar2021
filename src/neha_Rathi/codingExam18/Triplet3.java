//Program 3 : triplet having maximum sum, index overlapping is not allowed.
//input : [1,10,2,3,1,11,4,2,1,33,2] 
//output : 3,1,11

package neha_Rathi.codingExam18;

import java.util.*;

public class Triplet3 {
	int sum = 0;

	HashSet<Integer> findTriplet(int[] arr) {
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
		Triplet3 triplet3 = new Triplet3();
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		System.out.println(triplet3.findTriplet(input) + " -> " + triplet3.sum);
	}
}
