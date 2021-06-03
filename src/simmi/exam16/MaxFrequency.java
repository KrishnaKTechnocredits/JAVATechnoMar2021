/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

package simmi.exam16;

import java.util.HashMap;
import java.util.Set;

public class MaxFrequency {

	int maxFreq(Integer[] arr) {
		HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (freqMap.containsKey(num)) {
				int count = freqMap.get(num) + 1;
				freqMap.put(num, count);
			} else {
				freqMap.put(num, 1);
			}
		}
		int maxFreq = 0;
		int maxFreqNum = 0;
		Set<Integer> keys = freqMap.keySet();

		for (int index : keys) {

			if (freqMap.get(index) > maxFreq) {
				maxFreq = freqMap.get(index);
				maxFreqNum = index;
			}
		}
		return maxFreqNum;
	}

	public static void main(String[] args) {
		Integer[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		int output = new MaxFrequency().maxFreq(arr);
		System.out.println(output + " : having maximum frequency");
	}

}
