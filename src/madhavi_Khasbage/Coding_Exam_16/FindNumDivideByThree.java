package madhavi_Khasbage.Coding_Exam_16;

import java.util.HashMap;

/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

public class FindNumDivideByThree {

	HashMap<Integer, Integer> getNumFreqDivideByThree(int[] arr) {

		HashMap<Integer, Integer> intFrqMap = new HashMap<Integer, Integer>();
		int cnt = 0;
		for (int index = 0; index < arr.length; index++) {
			int currentInt = arr[index];
			if (currentInt % 3 == 0) {
				if (intFrqMap.containsKey(currentInt)) {

					intFrqMap.put(currentInt, intFrqMap.get(currentInt) + 1);
				} else {
					intFrqMap.put(currentInt, 1);
				}
			}
		}
		return intFrqMap;
	}

	public static void main(String[] args) {
		FindNumDivideByThree objFrq = new FindNumDivideByThree();
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		System.out.println("Input:{ 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 }" );
		HashMap<Integer, Integer> hmap = objFrq.getNumFreqDivideByThree(arr);
		System.out.println("Frequency of numbers which is divided by 3:" + hmap);
	}

}
