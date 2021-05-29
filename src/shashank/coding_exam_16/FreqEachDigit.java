package shashank.coding_exam_16;

import java.util.HashMap;

public class FreqEachDigit {

	private HashMap<Integer, Integer> getEachDigitFrequency(int array[]) {
		HashMap<Integer, Integer> eachDigitFrequency = new HashMap<Integer, Integer>();
		for (int index = 0; index < array.length; index++) {
			if (eachDigitFrequency.containsKey(array[index])) {
				eachDigitFrequency.put(array[index], eachDigitFrequency.get(array[index]) + 1);
			} else {
				eachDigitFrequency.put(array[index], 1);
			}
		}
		return eachDigitFrequency;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreqEachDigit freqEachDigit = new FreqEachDigit();
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> output = freqEachDigit.getEachDigitFrequency(arr);
		System.out.println(output);
	}

}
