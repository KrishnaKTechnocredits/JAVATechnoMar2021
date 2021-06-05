/*
Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};

 */
package paras.Coding_exam_16;

import java.util.HashMap;

public class FrequencyOfEachDigit {

	HashMap<Integer, Integer> getFrequency(int[] arr) {
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int number = arr[index];
			if (output.containsKey(number))
				output.put(number, output.get(number) + 1);
			else
				output.put(number, 1);
		}
		return output;
	}

	public static void main(String[] args) {
		FrequencyOfEachDigit frequencyOfEachDigit = new FrequencyOfEachDigit();
		int[] input = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		System.out.println(frequencyOfEachDigit.getFrequency(input));
	}
}
