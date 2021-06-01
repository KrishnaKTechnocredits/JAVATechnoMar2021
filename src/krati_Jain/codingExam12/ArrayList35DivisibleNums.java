/*1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15*/

package krati_Jain.codingExam12;

import java.util.*;

public class ArrayList35DivisibleNums {

	public static void main(String[] args) {

		int[] inputArr = { 10, 2, 3, 6, 15, 44, 32 };
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		for (int index = 0; index < inputArr.length; index++) {
			inputList.add(inputArr[index]);
		}
		ArrayList35DivisibleNums arrayList35 = new ArrayList35DivisibleNums();
		System.out.println(arrayList35.isNumDivisbleBy3and5(inputList));
	}

	ArrayList<Integer> isNumDivisbleBy3and5(ArrayList<Integer> inputList) {
		int index = 0;
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int num : inputList) {
			if (num % 3 == 0 || num % 5 == 0) {
				outputList.add(num);
			}
		}
		return outputList;
	}

}
