/*
26th May Coding Exam-14 : Collection
 
2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}
 */
 
package priyanka_Panat.coding_exam_14;

import java.util.ArrayList;

public class UniqueNumber {
	public ArrayList<Integer> getUniqueNumbers(int[] words) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int temp:words) {
			if (!output.contains(temp)) {
				output.add(temp);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		UniqueNumber uniqueNumber = new UniqueNumber();
		ArrayList<Integer> result = uniqueNumber.getUniqueNumbers(numbers);
		System.out.println(result);
	}

}

