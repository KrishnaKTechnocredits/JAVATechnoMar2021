/*
 program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
 */
package kajal.Codingexam;

import java.util.HashMap;

public class FreqofNumDivby3 {
	String freqofNumDivby3(int[] input) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			if (temp % 3 == 0) {
				if (hm.containsKey(temp)) {
					hm.put(temp, hm.get(temp) + 1);
				} else {
					hm.put(temp, 1);
				}
			}

		}
		return hm.toString();
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String ans = new FreqofNumDivby3().freqofNumDivby3(arr);
		System.out.println(ans);
	}

}
