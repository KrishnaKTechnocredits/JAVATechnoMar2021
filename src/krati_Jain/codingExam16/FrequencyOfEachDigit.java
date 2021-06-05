/*Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
*/
package krati_Jain.codingExam16;

import java.util.HashMap;

public class FrequencyOfEachDigit {

	private static FrequencyOfEachDigit frequencyOfEachDigit = null;

	static {
		frequencyOfEachDigit = new FrequencyOfEachDigit();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> output = frequencyOfEachDigit.getFrequency(arr);
		System.out.println("Frequency of each digit in the array is:");
		System.out.println(output);
	}

	HashMap<Integer, Integer> getFrequency(int[] arr) {
		HashMap<Integer, Integer> hsmap = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (hsmap.get(arr[index]) != null) {
				hsmap.put(arr[index], hsmap.get(arr[index]) + 1);
			} else
				hsmap.put(arr[index], 1); // 1,1/2,1/1,
		}
		return hsmap;
	}

}
