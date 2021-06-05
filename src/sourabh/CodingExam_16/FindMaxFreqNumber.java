/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

String getMaxFreqNumber(int[] arr){
	
}
output : 6 freq is 5
*/
package sourabh.CodingExam_16;

import java.util.HashMap;
import java.util.Set;

public class FindMaxFreqNumber {
	String getMaxFreqNumber(int[] arrInput) {
		HashMap<Integer, Integer> wordFrepMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < arrInput.length; index++) {
			if (wordFrepMap.containsKey(arrInput[index]))
				wordFrepMap.put(arrInput[index], wordFrepMap.get(arrInput[index]) + 1);
			else
				wordFrepMap.put(arrInput[index], 1);
		}
		Set<Integer> key = wordFrepMap.keySet();
		int maxfeq = 0;
		int maxfeqNumber = 0;
		for (int currentKey : key) {
			// System.out.println(currentKey+" : "+wordFrepMap.get(currentKey));
			
			if (wordFrepMap.get(currentKey) > maxfeq) {
				maxfeq = wordFrepMap.get(currentKey);
				maxfeqNumber= currentKey;
			}			
		}
		//System.out.println(maxfeqNumber+" : "+maxfeq);
		 return (maxfeqNumber+" freq is "+maxfeq);
	}

	public static void main(String[] args) {
		FindMaxFreqNumber findMaxFreqNumber = new FindMaxFreqNumber();
		int[] arrInput = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String output= findMaxFreqNumber.getMaxFreqNumber(arrInput);
		System.out.println(output);
	}

}
