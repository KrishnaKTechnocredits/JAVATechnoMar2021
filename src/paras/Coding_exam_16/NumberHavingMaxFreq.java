/*
program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
 */
package paras.Coding_exam_16;

import java.util.HashMap;
import java.util.Set;

public class NumberHavingMaxFreq {

	String NumberHavingMaxFrequency(int[] arr) {
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int number = arr[index];
			if (number % 3 == 0) {
				if (output.containsKey(number))
					output.put(number, output.get(number) + 1);
				else
					output.put(number, 1);
			}
		}
		int maxFrequency = 0;
		int maxFrequencyDigit = 0;
		Set<Integer> keys = output.keySet();
		for (int currentkey : keys) {
			if (output.get(currentkey) > maxFrequency) {
				maxFrequency = output.get(currentkey);
				maxFrequencyDigit = currentkey;
			}
		}
		return maxFrequencyDigit + " : " + maxFrequency;
	}

	public static void main(String[] args) {
		NumberHavingMaxFreq numberHavingMaxFreq = new NumberHavingMaxFreq();
		int[] input = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		System.out.println("Number having max freq is " + numberHavingMaxFreq.NumberHavingMaxFrequency(input));
	}
}
