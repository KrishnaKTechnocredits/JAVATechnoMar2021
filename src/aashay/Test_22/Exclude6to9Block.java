package aashay.Test_22;
/*
 * WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]

output 1: 9

input 2 : [4,5,6,12,2,9,1,3]

output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]

output 3: 16

input 4 : [6,1,4,5,9]

output 4 : 0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Exclude6to9Block {

	private int sumOfNumbers(int[] input) {
		int output = 0;
		List<Integer> list = Arrays.stream(input).boxed().collect(Collectors.toList());
		ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
		System.out.println(arrayList);
		if (arrayList.contains(6) && arrayList.contains(9)) {
			output = exclude6to9Block(arrayList);
		} else {
			output = sum(arrayList);
		}
		return output;

	}

	private int exclude6to9Block(ArrayList<Integer> arrayList) {
		boolean doNotadd = false;
		int sum = 0;
		Iterator itr = arrayList.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
			int num = (int) itr.next();
			if (num == 6) {
				doNotadd = true;
			}
			if (!doNotadd) {
				sum += num;
			}
			if (num == 9) {
				doNotadd = false;
			}

		}
		return sum;
	}

	private int sum(ArrayList<Integer> input) {
		int sum = 0;
		for (int num : input) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3, 5 };
		Exclude6to9Block exclude6to9Block = new Exclude6to9Block();

		System.out.println("Sum of Array {1,3,5} excluding block from 6-9: " + exclude6to9Block.sumOfNumbers(arr1));

		int[] arr2 = { 4, 5, 6, 12, 2, 9, 1, 3 };
		System.out.println("Sum of Array {4,5,6,12,2,9,1,3} excluding block from 6-9: " + exclude6to9Block.sumOfNumbers(arr2));

		int[] arr3 = { 2, 1, 6, 9, 11, 6, 19, 12, 9, 2 };
		System.out.println("Sum of Array {2,1,6,9,11,6,19,12,9,2} excluding block from 6-9: "+ exclude6to9Block.sumOfNumbers(arr3));

		int[] arr4 = { 6, 1, 4, 5, 9 };
		System.out.println("Sum of Array {6,1,4,5,9} excluding block from 6-9: " + exclude6to9Block.sumOfNumbers(arr4));

	}

}
