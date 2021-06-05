/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
*/
package shilpa.coding_exam_16;

import java.util.HashMap;
import java.util.Map;

public class FindFreqOfEachDigitInArr {
	Map<Integer, Integer> getFreqOfEachDigitInArr(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (hm.containsKey(arr[index])) {
				hm.put(arr[index], hm.get(arr[index]) + 1);
			} else {
				hm.put(arr[index], 1);
			}
		}
		return hm;
	}

	public static void main(String[] args) {
		FindFreqOfEachDigitInArr FindFreqOfEachDigit = new FindFreqOfEachDigitInArr();
		int input[] = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		System.out.println("Frequency of each digit in given array is");
		System.out.println(FindFreqOfEachDigit.getFreqOfEachDigitInArr(input));

	}

}
