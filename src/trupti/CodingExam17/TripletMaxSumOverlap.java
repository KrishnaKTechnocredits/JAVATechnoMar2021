package trupti.CodingExam17;

import java.util.ArrayList;
import java.util.HashMap;

public class TripletMaxSumOverlap {

	ArrayList<Integer> getTripletMaxSum(int[] input) {

		HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		for( int index = 0; index < input.length - 2; index++){
			if((input.length-index) >= 3) {
				int tempIndex = index;
				int sum = 0;
				for(int innerIndex = 0;innerIndex < 3; innerIndex ++){
					sum = sum + input[tempIndex++];
				}
				sumMap.put(index, sum);
			}
		}

		int maxSum = 0;
		int maxKey = 0;
		for(int key : sumMap.keySet()){
			int value = sumMap.get(key);
			if(maxSum < value){
				maxSum = value;
				maxKey = key;
			}
		}

		ArrayList<Integer> output = new ArrayList<Integer>();

		for(int index = 0; index < 3; index++){
			output.add (input[maxKey]);
			maxKey++;
		}

		return output;
	}


	public static void main(String[] args) {
		TripletMaxSumOverlap tripletmaxsumoverlap= new TripletMaxSumOverlap();
		int[] arr= {1,10,2,3,1,11,4,2,1,14};
		ArrayList<Integer>output=tripletmaxsumoverlap.getTripletMaxSum(arr);
		System.out.println(output);
	}

}


