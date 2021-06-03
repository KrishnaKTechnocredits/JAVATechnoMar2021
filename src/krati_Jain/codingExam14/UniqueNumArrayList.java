/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){*/

package krati_Jain.codingExam14;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueNumArrayList {

	public static void main(String[] args) {

		int[] intArr = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int index = 0; index < intArr.length; index++)
			numList.add(intArr[index]);
		System.out.println("Input list of numbers is : " + numList);

		UniqueNumArrayList uniqueNumArrayList = new UniqueNumArrayList();
		System.out.println("Unique Elements in the Array are : " + uniqueNumArrayList.getUniqueNums(intArr));

	}

	ArrayList<Integer> getUniqueNums(int[] intArr) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int num : intArr) {
			if (!outputList.contains(num)) {
				outputList.add(num);
			}

		}

		return outputList;

	}
}
