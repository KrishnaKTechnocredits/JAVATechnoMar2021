/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
String getMaxFreqNumber(int[] arr){
}
output : 6 freq is 5
*/
package prashant.coding_exam_16;

import java.util.HashMap;

public class MaxnumberFreq {
	String getMaxFreqNumber(int[] arr) {
		int maxfreq = 0;
		int maxfreqnum = 0;
		HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for (int val : arr) {
			if (intMap.containsKey(val)) {
				intMap.put(val, intMap.get(val) + 1);
				if (maxfreq < intMap.get(val) + 1) {
					maxfreq = intMap.get(val);
					maxfreqnum = val;
				}
			} else {
				intMap.put(val, 1);
			}
		}
		return "Number " + maxfreqnum + " freq is " + maxfreq;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String output = new MaxnumberFreq().getMaxFreqNumber(arr);
		System.out.println(output);
	}
}