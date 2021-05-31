/*
Test - 17 :
Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15
 */
package radha.CodingTest17;

import java.util.ArrayList;

public class TripletWithMaxSum {
	
	String findTripletwithMaxSum(int[] arr){
		ArrayList<Integer> triplet  = new ArrayList<Integer>();
		int maxSum=0;
		for(int index=0;index<arr.length-2;index=index+3) {
			if(arr[index]+arr[index+1]+arr[index+2]>maxSum) {
				maxSum=arr[index]+arr[index+1]+arr[index+2];
				triplet.clear();
				triplet.add(arr[index]);
				triplet.add(arr[index+1]);
				triplet.add(arr[index+2]);
			}	
		}
		return triplet+" -> "+maxSum;
	}
	
	public static void main(String[] args) {
		TripletWithMaxSum sum = new TripletWithMaxSum();
		int[] input = {1,10,2,3,1,11,4,2,1};
		String numbers = sum.findTripletwithMaxSum(input);
		System.out.println("Triplet having maximum sum\n"+numbers);
	}
}
