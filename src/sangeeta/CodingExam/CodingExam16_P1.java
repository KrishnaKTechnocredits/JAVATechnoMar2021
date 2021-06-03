/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};*/

package sangeeta.CodingExam;

import java.util.HashMap;

public class CodingExam16_P1 {

	HashMap<Integer, Integer> getDigitsFreq(int[] arr) {
		HashMap<Integer, Integer> DigitFreqMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (DigitFreqMap.containsKey(num))
				DigitFreqMap.put(num, DigitFreqMap.get(num) + 1);
			else
				DigitFreqMap.put(num, 1);
		}
		return DigitFreqMap;
	}

	public static void main(String[] args) {
		CodingExam16_P1 codingExam16_P1 = new CodingExam16_P1();
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> output = codingExam16_P1.getDigitsFreq(arr);
		System.out.println("Frequency of each digit is " + output);
	}
}
