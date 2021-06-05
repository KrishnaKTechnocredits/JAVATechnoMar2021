/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
*/
package shilpa.coding_exam_16;

import java.util.HashMap;
import java.util.Map;

public class FindFreqOfNumDivByThree {
	Map<Integer, Integer> getFreqOfNumDivByThree(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int temp = arr[index];
			if (temp % 3 == 0) {
				if (hm.containsKey(temp)) {
					hm.put(temp, hm.get(temp) + 1);
				} else {
					hm.put(temp, 1);
				}
			}
		}
		return hm;
	}

	public static void main(String[] args) {
		FindFreqOfNumDivByThree findFreqOfNumDivByThree = new FindFreqOfNumDivByThree();
		int input[] = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		System.out.println("Frequency of numbers div by 3 is");
		System.out.println(findFreqOfNumDivByThree.getFreqOfNumDivByThree(input));

	}

}
