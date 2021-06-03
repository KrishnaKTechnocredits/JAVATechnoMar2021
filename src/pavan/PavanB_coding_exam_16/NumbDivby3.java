package pavan.PavanB_coding_exam_16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class NumbDivby3 {

	int getNumDivByThree(int[] inArr) {

		int freq = 0;
		Integer[] integerarr = new Integer[inArr.length];
		for (int index = 0; index < inArr.length; index++) {
			integerarr[index] = Integer.valueOf(inArr[index]);

		}

		HashSet<Integer> uniqnumbers = new HashSet<Integer>(Arrays.asList(integerarr));
		for (int eachNum : uniqnumbers) {
			if (eachNum % 3 == 0)
				freq++;

		}
		return freq;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4,6,12,24,36};
		NumbDivby3 numbDivby3 = new NumbDivby3();
		int frequency =numbDivby3.getNumDivByThree(arr);
		System.out.println(frequency);

	}
}
