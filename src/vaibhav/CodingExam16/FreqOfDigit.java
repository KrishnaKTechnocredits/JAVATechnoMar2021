/* 29th May Coding Exam-16 : Collection - Map

Program 1 : Find Freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};

*/

package vaibhav.CodingExam16;

import java.util.HashMap;

public class FreqOfDigit {

	HashMap<Integer, Integer> freqOfEachDigit(int[] arr) {

		HashMap<Integer, Integer> digitFreqMap = new HashMap<Integer, Integer>();

		for (int index = 0; index < arr.length; index++) {
			int currentDigit = arr[index];
			if (digitFreqMap.containsKey(currentDigit)) {
				digitFreqMap.put(currentDigit, digitFreqMap.get(currentDigit) + 1);
			} else {
				digitFreqMap.put(currentDigit, 1);
			}
		}
		return digitFreqMap;
	}

	public static void main(String[] args) {
		FreqOfDigit freqOfDigit = new FreqOfDigit();
		
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		
		HashMap<Integer, Integer> digitFreqMap = new HashMap<Integer, Integer>();

		digitFreqMap = freqOfDigit.freqOfEachDigit(arr);
		
		System.out.println("Frequency of each digit : ");
		System.out.println(digitFreqMap);
	}

}
