/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
String getMaxFreqNumber(int[] arr){
}
output : 6 freq is 5
*/
package shilpa.coding_exam_16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindNumWithMaxFreq {
	String getNumWithMaxFreq(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (hm.containsKey(arr[index])) {
				hm.put(arr[index], hm.get(arr[index]) + 1);
			} else {
				hm.put(arr[index], 1);
			}
		}
		int maxFreq = 0;
		int MaxFreqNum = 0;
		Set<Integer> keys = hm.keySet();
		for (int currentKey : keys) {
			if (hm.get(currentKey) > maxFreq) {
				maxFreq = hm.get(currentKey);
				MaxFreqNum = currentKey;
			}
		}
		return "Num with Max Freq is " + MaxFreqNum + " and its frequency is " + maxFreq;
	}

	public static void main(String[] args) {
		FindNumWithMaxFreq findNumWithMaxFreq = new FindNumWithMaxFreq();
		int input[] = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String output = findNumWithMaxFreq.getNumWithMaxFreq(input);
		System.out.println(output);

	}

}
