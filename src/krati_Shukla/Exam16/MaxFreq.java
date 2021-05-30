/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

package krati_Shukla.Exam16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxFreq {

	HashMap<Integer, Integer> isRepeat(Integer[] input) {

		HashMap<Integer, Integer> answer = new HashMap<Integer, Integer>();
		List<Integer> list = Arrays.asList(input);
		int maxVal = 0;
		int maxNum = 0;
		for (int temp : input) {
			if (answer.containsKey(temp)) {
				int count = answer.get(temp);
				answer.put(temp, count + 1);
			} else
				answer.put(temp, 1);
		}
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		Set<Integer> key = new HashSet<Integer>();
		key = answer.keySet();

		for (int temp : key) {
			int value = answer.get(temp);
			if (value > maxVal) {
				maxVal = value;
				maxNum = temp;
			}
		}
		output.put(maxNum, maxVal);
		return output;

	}

	public static void main(String[] args) {
		MaxFreq maxFreq = new MaxFreq();
		Integer[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		HashMap<Integer,Integer> answer =  maxFreq.isRepeat(arr);
		System.out.println("number having max freq. : "+answer);
	}

}
