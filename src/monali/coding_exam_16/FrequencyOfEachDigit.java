package monali.coding_exam_16;

import java.util.HashMap;

public class FrequencyOfEachDigit {
	
	HashMap<Integer, Integer> getFreOfEachDigit(int[] num) {
		HashMap<Integer, Integer> numberFreqMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < num.length; index++) {
			int number = num[index];
			if (numberFreqMap.containsKey(number)) {
				numberFreqMap.put(number, numberFreqMap.get(number) + 1);
				} else {
				numberFreqMap.put(number, 1);
				}
		}
		return numberFreqMap;	
}
	
	public static void main(String[] args) {
		FrequencyOfEachDigit number = new FrequencyOfEachDigit();
		HashMap<Integer, Integer> numberFreqMap = new HashMap<Integer, Integer>();
		int[] num = { 1,2,1,1,3,4,5,3,3,4,5,5,2};
		HashMap<Integer, Integer> numberFreqMap1 = number.getFreOfEachDigit(num);
		System.out.println(numberFreqMap1);

	}
	}
