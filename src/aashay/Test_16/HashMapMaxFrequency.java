package aashay.Test_16;
/*
 * program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

 */

import java.util.HashMap;
import java.util.Set;

public class HashMapMaxFrequency {

	String getmaxFrequency(int[] input) {
		int maxFreq = 0;
		int maxFreqDigit = 0;
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			int tempNum = input[index];
			if (output.containsKey(tempNum)) {
				output.put(tempNum, output.get(tempNum) + 1);
			} else
				output.put(tempNum, 1);
		}
		Set<Integer> keys = output.keySet();
		for (int currentKey : keys) {
			if (output.get(currentKey) > maxFreq) {
				maxFreq = output.get(currentKey);
				maxFreqDigit = currentKey;
			}
		}
		return maxFreqDigit + ":" + maxFreq;
	}

	public static void main(String[] args) {
		HashMapMaxFrequency HashMapMaxFrequency = new HashMapMaxFrequency();
		int[] input = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String output = HashMapMaxFrequency.getmaxFrequency(input);
		System.out.println(output);

	}

}
