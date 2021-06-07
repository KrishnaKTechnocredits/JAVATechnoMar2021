/* 29th May Coding Exam-16 : Collection - Map

program 3 : return the number having max freq.
String[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

int getMaxFreqNumber(int[] arr){

}

output : 6 freq is 5

*/

package vaibhav.CodingExam16;

import java.util.HashMap;
import java.util.Set;

public class MaxFreqNum {

	String getMaxFreqNumber(int[] arr) {

		HashMap<Integer, Integer> numFreqMap = new HashMap<Integer, Integer>();

		for (int index = 0; index < arr.length; index++) {
			int currentNum = arr[index];
			if (numFreqMap.containsKey(currentNum)) {
				numFreqMap.put(currentNum, numFreqMap.get(currentNum) + 1);
			} else {
				numFreqMap.put(currentNum, 1);
			}
		}

		int maxFreqNum = 0;
		int maxFreq = 0;

		Set<Integer> keys = numFreqMap.keySet();

		for (int currentKey : keys) {

			if (numFreqMap.get(currentKey) > maxFreq) {
				maxFreq = numFreqMap.get(currentKey);
				maxFreqNum = currentKey;
			}
		}

		return "Number " + maxFreqNum + " has maximum frequency as " + maxFreq;
	}

	public static void main(String[] args) {
		MaxFreqNum maxFreqNum = new MaxFreqNum();

		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };

		String numWithMaxFreq = maxFreqNum.getMaxFreqNumber(arr);

		System.out.println(numWithMaxFreq);
	}

}
