package upasana.coding_exam_16;

import java.util.HashMap;

public class FreqOfNumDivByThreeHashMap {

	HashMap<Integer, Integer> getFreqOfNumDivByThreeDigitInArr(int[] arr) {

		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 3 == 0) {
				if (list.containsKey(arr[index]))
					list.put(arr[index], list.get(arr[index]) + 1);
				else
					list.put(arr[index], 1);
			}

		}
		return list;
	}

	public static void main(String[] args) {
		FreqOfNumDivByThreeHashMap obj = new FreqOfNumDivByThreeHashMap();
		int[] arr2 = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		HashMap<Integer, Integer> list2 = obj.getFreqOfNumDivByThreeDigitInArr(arr2);
		System.out.println(list2 + "\n");
	}
}
