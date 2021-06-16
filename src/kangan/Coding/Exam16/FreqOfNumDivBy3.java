package kangan.Coding.Exam16;

/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

import java.util.HashMap;

public class FreqOfNumDivBy3 {

	HashMap<Integer, Integer> getNumDivBy3(int[] input) {
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 3 == 0) {
				int temp = input[index];
				if (output.containsKey(temp)) {
					int cnt = output.get(temp) + 1;
					output.put(temp, cnt);
				} else {
					output.put(temp, 1);
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		FreqOfNumDivBy3 freqOfNumDivBy3 = new FreqOfNumDivBy3();
		HashMap<Integer, Integer> output = freqOfNumDivBy3.getNumDivBy3(arr);
		System.out.println(output);
	}
}
