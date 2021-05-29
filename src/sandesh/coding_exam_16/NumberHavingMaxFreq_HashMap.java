/*
program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

String getMaxFreqNumber(int[] arr){
}
output : 6 freq is 5
*/

package sandesh.coding_exam_16;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class NumberHavingMaxFreq_HashMap {

	private String getMaxFreqNum(int[] inArray) {
		HashMap<Integer, Integer> freqHashMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < inArray.length; index++) {
			if (freqHashMap.get(inArray[index]) != null) {
				freqHashMap.put(inArray[index], freqHashMap.get(inArray[index]) + 1);
			} else
				freqHashMap.put(inArray[index], 1);
		}
		Set<Integer> setOfKeys = new HashSet<Integer>();
		setOfKeys = freqHashMap.keySet();
		int maxFreqNum = 0;
		int maxFreq = 0;
		for (int eachKey : setOfKeys) {
			if (maxFreq < freqHashMap.get(eachKey)) {
				maxFreq = freqHashMap.get(eachKey);
				maxFreqNum = eachKey;
			}
		}
		return maxFreqNum + " freq is " + maxFreq;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String out = new NumberHavingMaxFreq_HashMap().getMaxFreqNum(arr);
		System.out.println(out);
	}
}
