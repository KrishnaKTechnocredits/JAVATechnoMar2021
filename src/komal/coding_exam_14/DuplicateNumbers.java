package komal.coding_exam_14;

import java.util.ArrayList;

/*2. Return all the duplicate numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [8,6,3,4,]
*/

public class DuplicateNumbers {

	public ArrayList<Integer> getDuplicateNum(ArrayList<Integer> numList) {
		ArrayList<Integer> duplicateNumList = new ArrayList<Integer>();
		for (int index = 0; index < numList.size(); index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex <= numList.size() - 1; innerIndex++) {
				if (numList.get(index) == numList.get(innerIndex)) {
					count++;
					break;
				}
			}
			if (count == 2) {
				duplicateNumList.add(numList.get(index));
			}
		}
		return duplicateNumList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(8);
		numList.add(6);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		numList.add(2);
		numList.add(3);
		numList.add(6);
		numList.add(9);
		numList.add(8);
		numList.add(4);

		DuplicateNumbers t142 = new DuplicateNumbers();
		System.out.println(t142.getDuplicateNum(numList));
	}
}