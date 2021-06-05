package sai.codingexam16;

import java.util.HashMap;

public class FrequencyOfDigit {

	HashMap<Integer, Integer> getDigitFrequency(int[] arr) {
		HashMap<Integer, Integer> DigitFrequency = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (DigitFrequency.containsKey(num))
				DigitFrequency.put(num, DigitFrequency.get(num) + 1);
			else
				DigitFrequency.put(num, 1);
		}
		return DigitFrequency;
	}

	public static void main(String[] args) {

		FrequencyOfDigit frequencyOfDigit = new FrequencyOfDigit();
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> output = frequencyOfDigit.getDigitFrequency(arr);
		System.out.println("The Frequency of each digit is : " + output);

	}

}
