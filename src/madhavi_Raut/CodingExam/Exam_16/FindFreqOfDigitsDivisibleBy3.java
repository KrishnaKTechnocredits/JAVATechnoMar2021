package madhavi_Raut.CodingExam.Exam_16;

import java.util.HashMap;

/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};*/
public class FindFreqOfDigitsDivisibleBy3 {

	HashMap<Integer, Integer> getFreqOfDigitsDivisibleBy3(int[] arr) {
		HashMap<Integer, Integer> digitsFreq = new HashMap<Integer, Integer>();
		for (int digit : arr) {
			if (digit % 3 == 0) {
				if (digitsFreq.containsKey(digit)) {
					digitsFreq.put(digit, digitsFreq.get(digit) + 1);
				} else {
					digitsFreq.put(digit, 1);
				}
			}
		}
		return digitsFreq;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		System.out.println("Freq of digits divisible by 3: "
				+ new FindFreqOfDigitsDivisibleBy3().getFreqOfDigitsDivisibleBy3(arr));
	}
}
