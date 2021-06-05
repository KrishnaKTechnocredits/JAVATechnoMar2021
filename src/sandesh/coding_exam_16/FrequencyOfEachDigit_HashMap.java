/*
Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
*/

package sandesh.coding_exam_16;

import java.util.HashMap;

public class FrequencyOfEachDigit_HashMap {
	private HashMap<Integer, Integer> getEachDigitFrequency(int[] inputArr) {
		HashMap<Integer, Integer> outHashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < inputArr.length; index++) {
			if (outHashMap.get(inputArr[index]) != null) {
				outHashMap.put(inputArr[index], outHashMap.get(inputArr[index]) + 1);
			} else
				outHashMap.put(inputArr[index], 1);
		}
		return outHashMap;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> outputMap = new HashMap<Integer, Integer>();
		outputMap = new FrequencyOfEachDigit_HashMap().getEachDigitFrequency(arr);
		System.out.println("Frequency of each digit in Number=Frequency format is -: ");
		System.out.println(outputMap);
	}
}
