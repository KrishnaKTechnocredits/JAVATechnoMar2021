package monali.coding_exam_16;

import java.util.HashMap;
import java.util.Set;

public class NumberHavingMaxFrequency {

	HashMap<Integer, Integer> numberHavingMaxFreq(int[] num) {
		HashMap<Integer, Integer> numberFreqMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < num.length; index++) {
			int number = num[index];
			if (numberFreqMap.containsKey(number)) {
				numberFreqMap.put(number, numberFreqMap.get(number) + 1);
			} else {
				numberFreqMap.put(number, 1);
			}
		}

		Set<Integer> keys = numberFreqMap.keySet();
		int maxnum = 0;
		int maxFreqNum = 0;
		for (int currentkey : keys) {
			if (numberFreqMap.get(currentkey) > maxnum) {
				maxnum = numberFreqMap.get(currentkey);
				maxFreqNum = currentkey;
			}
		}
		System.out.println("Number having max freq is " + maxFreqNum + ":" + maxnum + " times");
		return numberFreqMap;
	}

	public static void main(String[] args) {
		NumberHavingMaxFrequency number = new NumberHavingMaxFrequency();
		HashMap<Integer, Integer> numberFreqMap = new HashMap<Integer, Integer>();
		int[] num = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		HashMap<Integer, Integer> numberFreqMap1 = number.numberHavingMaxFreq(num);

	}
}
