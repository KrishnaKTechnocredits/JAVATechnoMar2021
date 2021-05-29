/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}
*/

package simmi.exam14;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueArray {
	public ArrayList<Integer> getUniqueNumbers(Integer[] input) {
		ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		
		boolean isDuplicate = false;
		
		for (int index = 0; index < inputList.size(); index++) {
			int temp = inputList.get(index);
			for (int innerIndex = index + 1; innerIndex < inputList.size(); innerIndex++) {
				if (inputList.get(index) == inputList.get(innerIndex)) {
					isDuplicate = true;
				break;
				}
			}
			if (!isDuplicate) {
				outputList.add(temp);
			}
			isDuplicate = false;
		}
		

		return outputList;
	}

	public static void main(String[] args) {
		Integer[] input = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> output = new UniqueArray().getUniqueNumbers(input);
		System.out.println(output);
	}
}
