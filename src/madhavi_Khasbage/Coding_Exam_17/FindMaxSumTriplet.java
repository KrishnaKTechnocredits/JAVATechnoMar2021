package madhavi_Khasbage.Coding_Exam_17;

/*Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [4,5,18,1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15*/

import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxSumTriplet {
	int temp = 0;

	ArrayList<ArrayList<Integer>> getMaxSumTriplet(int[] arr) {
		ArrayList<ArrayList<Integer>> arrTriplet = new ArrayList<ArrayList<Integer>>();
		int sum = 0;
		for (int index = 0; index < arr.length - 2; index = index + 3) {
			ArrayList<Integer> arrListNum = new ArrayList<Integer>();
			arrListNum.add(arr[index]);
			arrListNum.add(arr[index + 1]);
			arrListNum.add(arr[index + 2]);
			sum = arr[index] + arr[index + 1] + arr[index + 2];
			if (sum > temp) {
				arrTriplet = new ArrayList<ArrayList<Integer>>();
				temp = sum;
				arrTriplet.add(arrListNum);
			}
		}
		return arrTriplet;
	}

	public static void main(String[] args) {
		FindMaxSumTriplet findMaxTriplet = new FindMaxSumTriplet();
		int[] arr = { 1, 10, 2, 56, 23, 45, 3, 1, 11, 4, 2, 1, 4, 5, 18, 2, 4 };
		System.out.println("Input : " + Arrays.toString(arr));
		ArrayList<ArrayList<Integer>> arrTriplet = findMaxTriplet.getMaxSumTriplet(arr);
		System.out.println("Triplet having maximum sum :" + arrTriplet + " >> " + findMaxTriplet.temp);
	}
}
