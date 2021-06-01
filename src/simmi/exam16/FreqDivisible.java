/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

package simmi.exam16;

import java.util.HashMap;

public class FreqDivisible {
	void getFreqDigit(int[] arr) {
		HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int temp = arr[index];
			if (temp % 3 == 0) {
				if (freqMap.containsKey(temp)) {
					int count = freqMap.get(temp) + 1;
					freqMap.put(temp, count);
				} else {
					freqMap.put(temp, 1);
				}
			}
		}
		System.out.println(freqMap);
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		new FreqDivisible().getFreqDigit(arr);
	}
}
