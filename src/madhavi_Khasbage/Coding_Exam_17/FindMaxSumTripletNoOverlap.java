package madhavi_Khasbage.Coding_Exam_17;
/*Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 11,4,2 -> 17*/

import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxSumTripletNoOverlap {
	int temp = 0;

	ArrayList<ArrayList<Integer>> getMaxSumTriplet(int[] arr) {
		ArrayList<ArrayList<Integer>> arrTriplet = new ArrayList<ArrayList<Integer>>();
		int sum = 0;
		int size = arr.length - (arr.length % 3);
		for (int index = 0; index < size; index = index + 3) {
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
		FindMaxSumTripletNoOverlap maxtripletNoOverlap = new FindMaxSumTripletNoOverlap();
		int[] arrNum = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		System.out.println("Input : " + Arrays.toString(arrNum));
		ArrayList<ArrayList<Integer>> arrTriplet = maxtripletNoOverlap.getMaxSumTriplet(arrNum);
		System.out.println("Triplet having maximum sum :" + arrTriplet + " >> " + maxtripletNoOverlap.temp);
	}

}
