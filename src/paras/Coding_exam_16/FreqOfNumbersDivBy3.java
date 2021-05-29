/*
program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
 */
package paras.Coding_exam_16;

import java.util.HashMap;

public class FreqOfNumbersDivBy3 {

	HashMap<Integer, Integer> FrequencyOfNumbersDivBy3(int[] arr) {
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
		return output;
	}

	public static void main(String[] args) {
		FreqOfNumbersDivBy3 freqOfNumbersDivBy3 = new FreqOfNumbersDivBy3();
		int[] input = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		System.out.println(freqOfNumbersDivBy3.FrequencyOfNumbersDivBy3(input));
	}
}
