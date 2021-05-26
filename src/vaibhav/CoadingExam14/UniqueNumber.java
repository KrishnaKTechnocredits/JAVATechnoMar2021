/*Coding Exam - 14 : 26th May'2021 Collection

2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
//write your logic
}

*/

package vaibhav.CoadingExam14;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueNumber {

	public ArrayList<Integer> getUniqueNumbers(int[] numArr) {
		ArrayList<Integer> outputArrList = new ArrayList<Integer>();

		for (int index = 0; index < numArr.length; index++) {
			int num = numArr[index];

			if (!outputArrList.contains(num))
				outputArrList.add(numArr[index]);

		}

		return outputArrList;
	}

	public static void main(String[] args) {
		UniqueNumber uniqueNumber = new UniqueNumber();

		int[] inputArr = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> outputArrList = new ArrayList<Integer>();

		outputArrList = uniqueNumber.getUniqueNumbers(inputArr);

		System.out.println("Input given Array is         : " + Arrays.toString(inputArr));
		System.out.println("ArrayList of unique numbers  : " + outputArrList);

	}

}
