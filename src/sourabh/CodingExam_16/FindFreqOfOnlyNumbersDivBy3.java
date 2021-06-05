/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/
package sourabh.CodingExam_16;

import java.util.HashMap;

public class FindFreqOfOnlyNumbersDivBy3 {
	HashMap<Integer, Integer> getFreqOfOnlyNumbersDivBy3(int[] arrInput) {
		HashMap<Integer, Integer> wordFrepMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < arrInput.length; index++) {
			if (arrInput[index] % 3 == 0) {
				if (wordFrepMap.containsKey(arrInput[index]))
					wordFrepMap.put(arrInput[index], wordFrepMap.get(arrInput[index]) + 1);
				else
					wordFrepMap.put(arrInput[index], 1);
			}
		}
		// System.out.println(wordFrepMap);
		return wordFrepMap;
	}

	public static void main(String[] args) {
		FindFreqOfOnlyNumbersDivBy3 findFreqOfOnlyNumbers = new FindFreqOfOnlyNumbersDivBy3();
		int[] arrInput = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		HashMap<Integer, Integer> output = findFreqOfOnlyNumbers.getFreqOfOnlyNumbersDivBy3(arrInput);
		System.out.println(output);
	}
}
