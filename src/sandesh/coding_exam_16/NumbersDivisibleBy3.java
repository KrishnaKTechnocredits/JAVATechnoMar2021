/*
program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/

package sandesh.coding_exam_16;

import java.util.Arrays;
import java.util.HashSet;

public class NumbersDivisibleBy3 {

	private int getNumDibByThree(int[] inArray) {
		int freq = 0;
		Integer[] integerArr = new Integer[inArray.length];
		for (int index = 0; index < inArray.length; index++) {
			integerArr[index] = Integer.valueOf(inArray[index]);
		}
		HashSet<Integer> uniqueNumbers = new HashSet<Integer>(Arrays.asList(integerArr));
		for (int eachNum : uniqueNumbers) {
			if (eachNum % 3 == 0)
				freq++;
		}
		return freq;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		int frequency = new NumbersDivisibleBy3().getNumDibByThree(arr);
		System.out.println("Frequency of Unique Numbers Divisible by 3 from the given array is -: ");
		System.out.println(frequency);
	}
}
