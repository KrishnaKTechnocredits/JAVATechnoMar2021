package shashank.coding_exam_16;

import java.util.HashMap;
import java.util.Set;

public class MaxFreqNumber {

	private String geMaxFreqNumber(int num[]) {
		HashMap<Integer, Integer> eachDigitFrequency = new HashMap<Integer, Integer>();
		for (int index = 0; index < num.length; index++) {
			if ((num[index] % 3 == 0)) {
				if (eachDigitFrequency.containsKey(num[index])) {
					eachDigitFrequency.put(num[index], eachDigitFrequency.get(num[index]) + 1);
				} else {
					eachDigitFrequency.put(num[index], 1);
				}
			}
		}
		int maxFreq = 0, maxNum = 0;
		Set<Integer> numKeys = eachDigitFrequency.keySet();
		for (int currentkey : numKeys) {
			if (eachDigitFrequency.get(currentkey) > maxNum) {
				maxNum = currentkey;
				maxFreq = eachDigitFrequency.get(maxNum);
			}
		}
		return "Maximum frequency number is " + maxNum + " and its frequency is " + maxFreq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxFreqNumber maxFreqNumber = new MaxFreqNumber();
		int arr[] = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String strOutput = maxFreqNumber.geMaxFreqNumber(arr);
		System.out.println(strOutput);
	}

}
