package madhavi_Raut.CodingExam.Exam_16;

import java.util.HashMap;
/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};*/

public class FIndFrequencyOfDigits {

	HashMap<Integer, Integer> getFreqOfDigits(int[] arr) {
		HashMap<Integer, Integer> freqOfDigits = new HashMap<Integer, Integer>();
		for (int digit : arr) {
			if (freqOfDigits.containsKey(digit)) {
				freqOfDigits.put(digit, freqOfDigits.get(digit) + 1);
			} else {
				freqOfDigits.put(digit, 1);
			}
		}
		return freqOfDigits;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		System.out.println("Frequency Of digits are: " + new FIndFrequencyOfDigits().getFreqOfDigits(arr));
	}
}
