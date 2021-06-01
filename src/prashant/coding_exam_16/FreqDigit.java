/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};*/
package prashant.coding_exam_16;

import java.util.HashMap;

public class FreqDigit {
	HashMap<Integer, Integer> freqeachdigit(int[] arr) {
		HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for (int val : arr) {
			if (intMap.containsKey(val)) {
				intMap.put(val, intMap.get(val) + 1);
			} else {
				intMap.put(val, 1);
			}
		}
		return intMap;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> outputMap = new FreqDigit().freqeachdigit(arr);
		System.out.println("Freq of each digits " + outputMap);
	}
}
