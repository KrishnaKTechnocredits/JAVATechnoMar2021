package monali.coding_exam_16;

import java.util.HashMap;

public class FreqOfNumDivisibleBy3 {
	
	HashMap<Integer, Integer> getNumberDivisibleBy3(int[] num) {
		HashMap<Integer, Integer> numberFreqMap = new HashMap<Integer, Integer>();
			for (int index = 0; index < num.length; index++) {
				int number = num[index];
				if (number % 3 == 0) {
					if (numberFreqMap.containsKey(number)) {
					numberFreqMap.put(number, numberFreqMap.get(number) + 1);
					} else {
					numberFreqMap.put(number, 1);
					}
					}
			}
			return numberFreqMap;
			}

	public static void main(String[] args) {
		FreqOfNumDivisibleBy3 number = new FreqOfNumDivisibleBy3();
		HashMap<Integer, Integer> numberFreqMap = new HashMap<Integer, Integer>();
		int[] num = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		HashMap<Integer, Integer> numberFreqMap1 = number.getNumberDivisibleBy3(num);
		System.out.println(numberFreqMap1);

	}
}
