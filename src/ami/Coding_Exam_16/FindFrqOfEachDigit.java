/*
 * Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
 */

package ami.Coding_Exam_16;

import java.util.HashMap;

public class FindFrqOfEachDigit {

	void printAllNumFrq(int[] arr) {
		HashMap<Integer, Integer> intFeqMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (intFeqMap.containsKey(num)) {
				int cnt = intFeqMap.get(num) + 1;
				intFeqMap.put(num, cnt);
			} else {
				intFeqMap.put(num, 1);
			}
		}
		System.out.println("freq of each digit :" + intFeqMap);
	}

	public static void main(String[] args) {
		FindFrqOfEachDigit findFrqOfEachDigit = new FindFrqOfEachDigit();
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		findFrqOfEachDigit.printAllNumFrq(arr);
	}
}
