package pallavi.coding_exam_16;

/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

String getMaxFreqNumber(int[] arr){	
}
output : 6 freq is 5*/

import java.util.HashMap;
import java.util.Set;

public class MaxFrequencyUsingHashmap {

	String getMaxFreqNumber(int arr[]) {
		int maxFreqNumber = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int currentDigit : arr) {
			if (hashMap.containsKey(currentDigit))
				hashMap.put(currentDigit, hashMap.get(currentDigit) + 1);
			else
				hashMap.put(currentDigit, 1);
		}

		Set<Integer> keys = hashMap.keySet();
		for (int currentKey : keys) {
			if (hashMap.get(maxFreqNumber) == null || hashMap.get(currentKey) > hashMap.get(maxFreqNumber))
				maxFreqNumber = currentKey;
		}

		return maxFreqNumber + " Freq is : " + hashMap.get(maxFreqNumber);
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String output = new MaxFrequencyUsingHashmap().getMaxFreqNumber(arr);
		System.out.println(output);
	}

}
