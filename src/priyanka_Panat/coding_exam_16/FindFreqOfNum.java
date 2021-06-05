/*
 Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
 */
package priyanka_Panat.coding_exam_16;

import java.util.HashMap;

public class FindFreqOfNum {

	HashMap<Integer, Integer> printFreqOfNum(int[] num) {
		HashMap<Integer, Integer> intFreqMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < num.length; index++) {
			int currentNum = num[index];
			if (intFreqMap.containsKey(currentNum)) {
				intFreqMap.put(currentNum, intFreqMap.get(currentNum) + 1);
			} else {
				intFreqMap.put(currentNum, 1);
			}
		}
		return intFreqMap;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> result = new FindFreqOfNum().printFreqOfNum(arr);
		System.out.println(result);
	}
}