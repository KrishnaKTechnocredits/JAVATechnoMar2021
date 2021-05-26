package meenu.coding_exam_14;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]]
*/

public class DuplicateNumbers {
	
	public LinkedHashSet<Integer> getDuplicateNum(ArrayList<Integer> numList){
		LinkedHashSet<Integer> uniqueNumList = new LinkedHashSet<Integer>();
		for(int numbers : numList) {
			uniqueNumList.add(numbers);			
		}
		return uniqueNumList;
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
