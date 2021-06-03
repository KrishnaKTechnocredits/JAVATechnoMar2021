/*
 program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
 */
package kajal.Codingexam;

import java.util.HashMap;
import java.util.Set;

public class ReturnNohavMaxFreq {

	String nohavingMaxFreq(int[] input) {
		int max = 0, maxfreq = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			if (hm.containsKey(temp)) {
				hm.put(temp, hm.get(temp) + 1);
			} else {
				hm.put(temp, 1);
			}
		}
		System.out.println(hm);
		Set<Integer> keys = hm.keySet();
		for (int key : keys) {
			if (hm.get(key) > max) {
				max = hm.get(key);
				maxfreq = key;
			}
		}
		return maxfreq + " Frequency is " + max;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		System.out.println(new ReturnNohavMaxFreq().nohavingMaxFreq(arr));

	}

}
