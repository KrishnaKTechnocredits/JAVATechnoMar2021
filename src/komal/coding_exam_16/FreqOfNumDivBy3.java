package komal.coding_exam_16;

import java.util.LinkedHashMap;

/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/

public class FreqOfNumDivBy3 {

	void getFreqOfDigit(int[] arr) {
		LinkedHashMap<Integer, Integer> digitFreq = new LinkedHashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 3 == 0) {
				if (digitFreq.containsKey(arr[index]))
					digitFreq.put(arr[index], digitFreq.get(arr[index]) + 1);
				else
					digitFreq.put(arr[index], 1);
			}
		}
		System.out.println("Frequency of digit which are divisible by 3: " + digitFreq);
	}

	public static void main(String[] args) {
		int[] arrOfNum = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		FreqOfNumDivBy3 freqOfNumDivBy3 = new FreqOfNumDivBy3();
		freqOfNumDivBy3.getFreqOfDigit(arrOfNum);
	}

}
