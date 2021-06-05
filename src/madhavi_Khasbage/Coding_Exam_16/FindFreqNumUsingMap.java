package madhavi_Khasbage.Coding_Exam_16;

import java.util.HashMap;

public class FindFreqNumUsingMap {
	HashMap<Integer, Integer> getNumFreqDivideByThree(int[] arr) {
		HashMap<Integer, Integer> intFrqMap = new HashMap<Integer, Integer>();
		int cnt = 0;
		for (int index = 0; index < arr.length; index++) {
			int currentInt = arr[index];

			if (intFrqMap.containsKey(currentInt)) {
				intFrqMap.put(currentInt, intFrqMap.get(currentInt) + 1);
			} else {
				intFrqMap.put(currentInt, 1);
			}
		}
		return intFrqMap;
	}

	public static void main(String[] args) {
		FindFreqNumUsingMap objFrq = new FindFreqNumUsingMap();
		System.out.println("Input: { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 } ");
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> hmap = objFrq.getNumFreqDivideByThree(arr);
		System.out.println("Number and their frequency: " + hmap);
	}
}
