/*
 * Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
 */
package kajal.Codingexam;

import java.util.HashMap;

public class FreqofEachDigit {

	String freq(int[] input) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			if (hm.containsKey(temp)) {
				hm.put(temp, hm.get(temp) + 1);
			} else {
				hm.put(temp, 1);
			}
		}

		return hm.toString();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		String ans = new FreqofEachDigit().freq(arr);
		System.out.println(ans);
	}

}
