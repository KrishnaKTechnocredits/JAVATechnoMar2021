package komal.coding_exam_16;

import java.util.HashMap;
import java.util.Set;

/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/

public class MaxNumFreq {

	int getMaxFreqNumber(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (hm.containsKey(arr[index]))
				hm.put(arr[index], hm.get(arr[index]) + 1);
			else
				hm.put(arr[index], 1);
		}
		Set<Integer> keys = hm.keySet();
		int maxFreq = 0;
		int maxFreqDigit = 0;
		for (Integer currentKey : keys) {
			if (hm.get(currentKey) > maxFreq) {
				maxFreq = hm.get(currentKey);
				maxFreqDigit = currentKey;
			}
		}
		return maxFreqDigit;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		MaxNumFreq maxNumFreq = new MaxNumFreq();
		System.out.println("Number with Max. frequency is " + maxNumFreq.getMaxFreqNumber(arr));
	}
}