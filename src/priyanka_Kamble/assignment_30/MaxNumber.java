package priyanka_Kamble.assignment_30;

import java.util.Arrays;
import java.util.List;

/* Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 */

public class MaxNumber {

	int FindSecondMax(Integer[] inputArr) {
		Arrays.sort(inputArr);
		return inputArr[inputArr.length - 2];
	}
	void findSecondMaxWithForLoop(int[] inputArr1) {
		Integer max = inputArr1[0], seconMax = 0;
		for (int index = 0; index < inputArr1.length; index++) {
			if (max < inputArr1[index]) {
				seconMax = max;
				max = inputArr1 [index];
			}
		}
		System.out.println("Second Max Number -  " + seconMax);

	}

	public static void main(String[] args) {

		Integer[] inputArr = { 10, 33, 43, 55, 97, 11, 3 };
		int[] inputArr1 = { 10, 33, 43, 55, 97, 11, 3 };
		 //List<Integer> inArray = Arrays.asList(10,33,43,55,97,11,3);
		 System.out.println("Input Array - " + Arrays.asList(inputArr)+ "\n Second Max Number is - " +new MaxNumber().FindSecondMax(inputArr));
		//new MaxNumber().findSecondMaxWithForLoop(inputArr);
		System.out.println("input Array - " + Arrays.toString(inputArr1));
		new MaxNumber().findSecondMaxWithForLoop(inputArr1);
			//;
		
	}
}
