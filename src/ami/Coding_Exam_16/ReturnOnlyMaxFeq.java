/*
 program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

String getMaxFreqNumber(int[] arr){
	
}
 */

package ami.Coding_Exam_16;

import java.util.HashMap;
import java.util.Set;

public class ReturnOnlyMaxFeq {

	void printMaxNumFrq(int[] arr) {
		HashMap<Integer, Integer> intFeqMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (intFeqMap.containsKey(num)) {
				int cnt = intFeqMap.get(num) + 1;
				intFeqMap.put(num, cnt);
			} else {
				intFeqMap.put(num, 1);
			}
		}

		int maxFrqNum = 0;
		int maxFrq = 0;
		Set<Integer> keys = intFeqMap.keySet();
		for (int currentKey : keys) {
			if (intFeqMap.get(currentKey) > maxFrq) {
				maxFrq = intFeqMap.get(currentKey);
				maxFrqNum = currentKey;
			}
		}

		System.out.println("Max num Repeat :" + maxFrqNum + " and it's feq. : " + intFeqMap.get(maxFrqNum));
	}

	public static void main(String[] args) {
		ReturnOnlyMaxFeq returnOnlyMaxFeq = new ReturnOnlyMaxFeq();
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		returnOnlyMaxFeq.printMaxNumFrq(arr);

	}
}
