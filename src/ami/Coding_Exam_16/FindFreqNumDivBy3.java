/*
 program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
 */

package ami.Coding_Exam_16;

import java.util.HashMap;

public class FindFreqNumDivBy3 {

	void printNumFrqDiv3(int[] arr) {
		HashMap<Integer, Integer> intFeqMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (num % 3 == 0)
				if (intFeqMap.containsKey(num)) {
					int cnt = intFeqMap.get(num) + 1;
					intFeqMap.put(num, cnt);
				} else {
					intFeqMap.put(num, 1);
				}
		}
		System.out.println("freq of only numbers div by 3 : "+intFeqMap);
	}

	public static void main(String[] args) {
		FindFreqNumDivBy3 findFreqNumDivBy3 = new FindFreqNumDivBy3();
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		findFreqNumDivBy3.printNumFrqDiv3(arr);
	}

}
