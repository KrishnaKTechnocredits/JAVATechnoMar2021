package upasana.coding_exam_16;

import java.util.HashMap;
import java.util.Set;

public class MaxFreqOfNumHashMap {
	String getMaxFreqOfNumInArr(int[] arr) {

		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();

		for (int index = 0; index < arr.length; index++) {
			if (list.containsKey(arr[index]))
				list.put(arr[index], list.get(arr[index]) + 1);
			else
				list.put(arr[index], 1);

		}

		Set<Integer> keys = list.keySet();
		int maxFreqNum = 0;
		int maxFreqCount = 0;
		for (Integer currentKey : keys) {
			if (maxFreqCount < list.get(currentKey)) {
				maxFreqCount = list.get(currentKey);
				maxFreqNum = currentKey;
			}
		}
		return maxFreqNum + " has maximum frequency --> " + maxFreqCount;

	}

	public static void main(String[] args) {
		MaxFreqOfNumHashMap obj = new MaxFreqOfNumHashMap();

		int[] arr3 = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String list3 = obj.getMaxFreqOfNumInArr(arr3);
		System.out.println(list3 + "\n");
	}
}
