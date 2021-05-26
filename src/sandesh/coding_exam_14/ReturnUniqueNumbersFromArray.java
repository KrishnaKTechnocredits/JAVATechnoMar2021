/*
2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}
*/

package sandesh.coding_exam_14;

import java.util.ArrayList;

public class ReturnUniqueNumbersFromArray {

	public ArrayList<Integer> getUniqueNumbers(int words[]) {
		ArrayList<Integer> outAL = new ArrayList<Integer>();
		for (int index = 0; index < words.length; index++) {
			Integer refInt = new Integer(words[index]);
			if (!outAL.contains(refInt))
				outAL.add(refInt);
		}
		return outAL;
	}

	public static void main(String[] args) {
		int[] input = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> outputAL = new ArrayList<Integer>();
		outputAL = new ReturnUniqueNumbersFromArray().getUniqueNumbers(input);
		System.out.println("Unique numbers from given Array are -: ");
		System.out.println(outputAL);
	}
}
