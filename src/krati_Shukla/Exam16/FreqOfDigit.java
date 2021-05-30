/*Fetch frequency of each Digit
 int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2}
 */

package krati_Shukla.Exam16;

import java.util.HashMap;

public class FreqOfDigit {

	void Frequency(int[] input) {
		HashMap<Integer, Integer> number = new HashMap<Integer, Integer>();

		for (int temp : input) {
			if ((number.containsKey(temp))) {
				int count = number.get(temp);
				number.put(temp, count + 1);
			} else
				number.put(temp, 1);
		}
		System.out.println(number);
	}

	public static void main(String[] args) {
		FreqOfDigit digit = new FreqOfDigit();
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		digit.Frequency(arr);
	}

}
