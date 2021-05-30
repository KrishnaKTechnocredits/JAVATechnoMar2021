/*
 Test - 16 : 
program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/
package priyanka_Panat.coding_exam_16;

import java.util.HashMap;
import java.util.Set;

public class MaxFreqNum {
	String getMaxNum(int[] input) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			int currentNumber = input[index];
			if (hm.containsKey(currentNumber)) {
				hm.put(currentNumber, hm.get(currentNumber) + 1);
			} else {
				hm.put(currentNumber, 1);
			}
		}
		int maxFeq = 0;
		int maxFreqNum = 0;
		Set<Integer> numKeys = hm.keySet();
		for (int currentKey : numKeys) {
			if (hm.get(currentKey) > maxFeq) {
				maxFeq = hm.get(currentKey);
				maxFreqNum = currentKey;
			}
		}
		return maxFreqNum + " freq is " + maxFeq;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String result = new MaxFreqNum().getMaxNum(arr);
		System.out.println(result);
	}

}
