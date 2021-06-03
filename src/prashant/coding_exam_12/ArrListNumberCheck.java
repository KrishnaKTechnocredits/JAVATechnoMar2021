/*ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
*/
package prashant.coding_exam_12;

import java.util.*;

public class ArrListNumberCheck {
	ArrayList<Integer> numberDivisible(ArrayList<Integer> arr) {
		ArrayList<Integer> tempArrList = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0) {
				tempArrList.add(arr.get(index));
			}
		}
		return tempArrList;
	}

	public static void main(String[] args) {
		ArrListNumberCheck test = new ArrListNumberCheck();
		int[] numArr = { 10, 2, 3, 6, 15, 44, 32 };
		ArrayList<Integer> numArrList = new ArrayList<Integer>();
		for (int i = 0; i < numArr.length; i++) {
			numArrList.add(i, numArr[i]);
		}
		ArrayList<Integer> output = test.numberDivisible(numArrList);
		System.out.println("Numbers divisible by 3 or 5 are " +output);
	}

}
