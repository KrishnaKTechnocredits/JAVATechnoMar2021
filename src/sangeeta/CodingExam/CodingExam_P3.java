/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

String getMaxFreqNumber(int[] arr){
	
}

output : 6 freq is 5*/

package sangeeta.CodingExam;

import java.util.HashMap;
import java.util.Set;

public class CodingExam_P3 {

	String getMaxFreqDigit(int[] arr) {
		HashMap<Integer, Integer> MaxFreqDigit = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (MaxFreqDigit.containsKey(num))
				MaxFreqDigit.put(num, MaxFreqDigit.get(num) + 1);
			else
				MaxFreqDigit.put(num, 1);
		}
		int maxFreq = 0;
		int maxFreqDigit = 0;
		Set<Integer> keys = MaxFreqDigit.keySet();
		for (int currentKey : keys) {
			if (MaxFreqDigit.get(currentKey) > maxFreq) {
				maxFreq = MaxFreqDigit.get(currentKey);
				maxFreqDigit = currentKey;
			}
		}
		return maxFreqDigit + " : " + maxFreq;
	}

	public static void main(String[] args) {
		CodingExam_P3 codingExam_P3 = new CodingExam_P3();
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String output = codingExam_P3.getMaxFreqDigit(arr);
		System.out.println("Number having maximum frequency is " + output);
	}
}
