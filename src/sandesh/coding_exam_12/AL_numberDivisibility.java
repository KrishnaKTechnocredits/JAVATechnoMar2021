/*
1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
*/

package sandesh.coding_exam_12;

import java.util.ArrayList;
import java.util.Arrays;

public class AL_numberDivisibility {

	private ArrayList<Integer> getDivisibleByNumbers(ArrayList<Integer> inputList) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int index = 0; index < inputList.size(); index++) {
			if (inputList.get(index) % 3 == 0 || inputList.get(index) % 5 == 0
					|| (inputList.get(index) % 3 == 0 && inputList.get(index) % 5 == 0))
				outputList.add(inputList.get(index));
		}
		return outputList;
	}

	public static void main(String[] args) {
		int[] input = { 10, 2, 3, 6, 15, 44, 32 };
		Integer[] integerInput = new Integer[input.length];
		for (int index = 0; index < input.length; index++) {
			integerInput[index] = new Integer(input[index]);
		}
		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(integerInput));
		ArrayList<Integer> outList = new AL_numberDivisibility().getDivisibleByNumbers(intList);
		System.out.println("Number divisible by 3 OR 5 OR 3 and 5 from given list are -: ");
		System.out.println(outList);
	}
}
