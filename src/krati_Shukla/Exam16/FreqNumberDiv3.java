/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
 */

package krati_Shukla.Exam16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FreqNumberDiv3 {
	void isDivisible(Integer[] input) {
		List<Integer> list = Arrays.asList(input);
		int count = 0;
		for (int temp : list) {
			if (temp % 3 == 0)
				count++;
		}
		System.out.println("Total Numbers divisible by 3 are : " + count);
	}

	void totalNos(Integer[] input) {
		HashMap<Integer, Integer> answer = new HashMap<Integer, Integer>();
		int count = 0;

		for (int temp : input) {
			if (temp % 3 == 0 && answer.containsKey(temp)) {
				count = answer.get(temp);
				answer.put(temp, count + 1);
			} else if (temp % 3 == 0 && (!answer.containsKey(temp))) {
				answer.put(temp, 1);
			}
		}
		System.out.println("Frequency of each number divisible by 3 is : " + answer);
	}

	public static void main(String[] args) {
		FreqNumberDiv3 freqNumber = new FreqNumberDiv3();
		Integer[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		freqNumber.isDivisible(arr);
		freqNumber.totalNos(arr);
	}

}
