/*Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};*/

package simmi.exam16;

import java.util.HashMap;

public class FreqDigit {
	void getFreqDigit(int[] arr) {
		HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int temp = arr[index];
			if (freqMap.containsKey(temp)) {
				int count = freqMap.get(temp) + 1;
				freqMap.put(temp, count);
			} else {
				freqMap.put(temp, 1);
			}
		}
		System.out.println(freqMap);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		new FreqDigit().getFreqDigit(arr);
	}

}
