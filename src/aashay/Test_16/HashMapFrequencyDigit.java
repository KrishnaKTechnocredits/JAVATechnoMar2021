package aashay.Test_16;
/*
 * Test - 16 :
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
 */

import java.util.HashMap;

public class HashMapFrequencyDigit {

	public HashMap<Integer, Integer> getFrequrncyDigit(int[] input) {
		HashMap<Integer, Integer> frequencyOfDigit = new HashMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			int tempNum = input[index];
			if (frequencyOfDigit.containsKey(tempNum)) {
				frequencyOfDigit.put(tempNum, frequencyOfDigit.get(tempNum) + 1);
			} else
				frequencyOfDigit.put(tempNum, 1);
		}
		return frequencyOfDigit;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMapFrequencyDigit hashMapFrequencyDigit = new HashMapFrequencyDigit();
		HashMap<Integer, Integer> output = hashMapFrequencyDigit.getFrequrncyDigit(input);
		System.out.println(output);
	}

}
