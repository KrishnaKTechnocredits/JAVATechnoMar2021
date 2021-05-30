package sai.codingexam16;

import java.util.HashMap;
import java.util.Set;

public class MaxFrequency {

	String getmaximumFrequency(int[] input) {
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
		MaxFrequency MaxFrequency = new MaxFrequency();
		int[] input = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String output = MaxFrequency.getmaximumFrequency(input);
		System.out.println("Number and it's maximum frequency is");
		System.out.println(output);
	}

}
