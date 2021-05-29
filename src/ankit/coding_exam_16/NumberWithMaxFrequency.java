/*
program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
 */
package ankit.coding_exam_16;

import java.util.HashMap;
import java.util.Set;

public class NumberWithMaxFrequency {

	static String getNumWithMaxFreq(int[] arr) {
		int max = 0, maxKey = 0;
		HashMap<Integer, Integer> arrHM = new HashMap<Integer, Integer>();
		for(int num : arr) {
			if(arrHM.containsKey(num)) {
				arrHM.put(num, arrHM.get(num)+1);
			}else {
				arrHM.put(num, 1);	
			}	
		}	
		System.out.println(arrHM);
		Set<Integer> keys = arrHM.keySet();
		for(int key :keys) {
			if(max < arrHM.get(key)) {
				max = arrHM.get(key);
				maxKey = key;
			}

		}return maxKey + " Frequency is " + max;
	}

	public static void main(String[] args) {
		int[] arr = {6,2,6,6,6,6,3,3,3,3,3,3,4,15,3,3,5,5,12,13,17,12};
		System.out.println("Int with Max Freq : "+getNumWithMaxFreq(arr));
	}
}
