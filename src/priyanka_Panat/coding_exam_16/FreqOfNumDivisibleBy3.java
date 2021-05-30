/*
 Test - 16 :
program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
 */
package priyanka_Panat.coding_exam_16;

import java.util.HashMap;

public class FreqOfNumDivisibleBy3 {
	HashMap<Integer, Integer> printFreqOfNumDivisibleBy3(int[] input) {
		HashMap<Integer, Integer> numFreqMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			int num = input[index];
			if (num % 3 == 0) {
				if (numFreqMap.containsKey(num)) {
					numFreqMap.put(num, numFreqMap.get(num) + 1);
				} else {
					numFreqMap.put(num, 1);
				}
			}
		}
		return numFreqMap;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		HashMap<Integer, Integer> output = new FreqOfNumDivisibleBy3().printFreqOfNumDivisibleBy3(arr);
		System.out.println(output);
	}
}
