/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};*/
package prashant.coding_exam_16;

import java.util.HashMap;

public class FreqDigitDivisibilityCheck {
	HashMap<Integer, Integer> freqdivcheck(int[] arr) {
		HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for (int val : arr) {
			if (val % 3 == 0) {
				if (intMap.containsKey(val)) {
					intMap.put(val, intMap.get(val) + 1);
				} else {
					intMap.put(val, 1);
				}
			}
		}
		return intMap;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		HashMap<Integer, Integer> outputMap = new FreqDigitDivisibilityCheck().freqdivcheck(arr);
		System.out.println("Freq of each digits which are divisible by 3 " + outputMap);
	}
}
