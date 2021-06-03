package pavan.PavanB_coding_exam_17;

import java.util.ArrayList;

public class MaxSumTriplet {

	private String getMaxsumTriplet(int[] inputArr) {

		ArrayList<ArrayList<Integer>> ListOfTriplets = new ArrayList<ArrayList<Integer>>();
		int sum = 0;
		for (int index = 0; index < inputArr.length; index = index + 3) {
			if (sum < (inputArr[index] + inputArr[index + 1] + inputArr[index + 2])) {
				ArrayList<Integer> ListofNum = new ArrayList<Integer>();
				ListofNum.add(inputArr[index]);
				ListofNum.add(inputArr[index + 1]);
				ListofNum.add(inputArr[index + 2]);
				ListOfTriplets.add(ListofNum);
				sum = inputArr[index] + inputArr[index + 1] + inputArr[index + 2];

			}

		}
		return ListOfTriplets.get(ListOfTriplets.size() - 1) + "->" + sum;

	}

	public static void main(String[] args) {
		int[] input = { 1, 12, 13, 14, 15, 11, 4, 2, 1 };
		String ListOfTripletout = new MaxSumTriplet().getMaxsumTriplet(input);
		System.out.println(ListOfTripletout);
	}

}
