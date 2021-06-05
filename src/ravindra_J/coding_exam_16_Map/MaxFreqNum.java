/*coding_exam_16 : 
program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
String getMaxFreqNumber(int[] arr){	}
output : 6 freq is 5
*/
package ravindra_J.coding_exam_16_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxFreqNum {

	public String getMaxFreqNum(int[] numArr) {
		int maxFreqKey = 0;
		int maxFreqValue = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int index = 0; index < numArr.length; index++) {
			int num = numArr[index];
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		Set<Integer> set = map.keySet();
		for (int keys : set) {
			int temp = map.get(keys);
			if (maxFreqValue < temp) {
				maxFreqValue = map.get(keys);
				maxFreqKey = keys;
			}
		}
		return maxFreqKey + " freq is " + maxFreqValue;
	}

	public static void main(String[] args) {
		MaxFreqNum maxFreq = new MaxFreqNum();
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String maxNum = maxFreq.getMaxFreqNum(arr);
		System.out.println(maxNum);
	}
}
