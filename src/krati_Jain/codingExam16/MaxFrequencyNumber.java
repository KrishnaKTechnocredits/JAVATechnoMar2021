/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

package krati_Jain.codingExam16;

import java.util.HashMap;
import java.util.Set;

public class MaxFrequencyNumber {

	public static void main(String[] args) {
		MaxFrequencyNumber maxFrequencyNumber = new MaxFrequencyNumber();
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		HashMap<Integer, Integer> outPutHash = maxFrequencyNumber.getFrequencyNumber(arr);
		System.out.println(maxFrequencyNumber.getMaxFrequencyNumber(outPutHash));
	}

	HashMap<Integer, Integer> getFrequencyNumber(int[] arr) {
		HashMap<Integer, Integer> hsmap = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (hsmap.get(arr[index]) != null)
				hsmap.put(arr[index], hsmap.get(arr[index]) + 1);
			else
				hsmap.put(arr[index], 1);
		}
		return hsmap;
	}

	String getMaxFrequencyNumber(HashMap<Integer, Integer> outPutHash) {
		int maxFrequency = 0, numWithMaxFreq = 0;
		Set<Integer> allKeys = outPutHash.keySet();
		for (int myKey : allKeys) {
			if (maxFrequency < outPutHash.get(myKey)) {
				maxFrequency = outPutHash.get(myKey);
				numWithMaxFreq = myKey;
			}
		}
		return "Number in the input Array with Max Frequency of '" + maxFrequency + "' is : " + numWithMaxFreq;
	}
}
