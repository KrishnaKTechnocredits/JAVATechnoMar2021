/*
2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
//write your logic
}
 */

package upasana.coding_exam_14;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueArrayList {

	public ArrayList<Integer> getUniqueNumbers(Integer[] input) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(input));

		for (int index = 0; index < inputList.size(); index++) {

			if (index == inputList.indexOf(inputList.get(index))) {
				outputList.add(inputList.get(index));
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		Integer[] input = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> outputList = new UniqueArrayList().getUniqueNumbers(input);
		System.out.println(outputList);
	}
}
