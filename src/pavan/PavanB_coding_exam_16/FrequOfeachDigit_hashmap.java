package pavan.PavanB_coding_exam_16;

import java.util.HashMap;

public class FrequOfeachDigit_hashmap {
	HashMap<Integer, Integer> getEachDigitFreq(int[] inputArr) {
		HashMap<Integer, Integer> OutHashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < inputArr.length; index++) {

			if (OutHashMap.get(inputArr[index]) != null) {
				OutHashMap.put(inputArr[index], OutHashMap.get(inputArr[index]) + 1);
			} else
				OutHashMap.put(inputArr[index], 1);
		}
		return OutHashMap;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1, 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, };
		HashMap<Integer, Integer> outPutMap = new HashMap<Integer, Integer>();
		outPutMap = new FrequOfeachDigit_hashmap().getEachDigitFreq(arr);
		System.out.println("Frequ of each Int" + outPutMap);

	}

}
