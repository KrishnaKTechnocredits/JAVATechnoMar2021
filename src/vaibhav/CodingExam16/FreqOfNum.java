/* 29th May Coding Exam-16 : Collection - Map

program 2 : Find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};

*/

package vaibhav.CodingExam16;

import java.util.HashMap;

public class FreqOfNum {

	HashMap<Integer, Integer> freqOfNumDivBy3(int[] arr) {

		HashMap<Integer, Integer> digitFreqMap = new HashMap<Integer, Integer>();

		for (int index = 0; index < arr.length; index++) {
			int currentDigit = arr[index];
			
			if (currentDigit%3 ==0) {
				if (digitFreqMap.containsKey(currentDigit)) {
					digitFreqMap.put(currentDigit, digitFreqMap.get(currentDigit) + 1);
				} else {
					digitFreqMap.put(currentDigit, 1);
				}
			}
		}
		return digitFreqMap;
	}

	public static void main(String[] args) {
		FreqOfNum freqOfNumDivisibleBy3 = new FreqOfNum();
		
		int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
		
		HashMap<Integer, Integer> digitFreqMap = new HashMap<Integer, Integer>();

		digitFreqMap = freqOfNumDivisibleBy3.freqOfNumDivBy3(arr);
		
		System.out.println("Frequency of numbers which are divisible by 3 : ");
		System.out.println(digitFreqMap);
	}

}
