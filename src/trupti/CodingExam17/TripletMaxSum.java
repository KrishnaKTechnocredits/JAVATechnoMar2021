package trupti.CodingExam17;

import java.util.ArrayList;
import java.util.HashMap;

public class TripletMaxSum {
	
	ArrayList<Integer> getTripletMaxSum(int[] input) {
		
		HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();

		for( int index = 0; index < input.length - 2; index = index + 3){
			int sum = 0;
			int tempIndex = index;
			for(int innerIndex = 0;innerIndex < 3; innerIndex ++){
				sum = sum + input[tempIndex++];
			}
			sumMap.put(index, sum);
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
		TripletMaxSum tripletMaxSum= new TripletMaxSum();
		int[] arr= {1,10,2,3,1,11,4,2,1};
		ArrayList<Integer>output=tripletMaxSum.getTripletMaxSum(arr);
		System.out.println(output);
	}

}
