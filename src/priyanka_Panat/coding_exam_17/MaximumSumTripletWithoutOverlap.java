package priyanka_Panat.coding_exam_17;

/*
 Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 11,4,2 -> 17 o/p should be 3,1,11 -> 15
 */
import java.util.ArrayList;

public class MaximumSumTripletWithoutOverlap {
	String printTripletWithoutOverlap(int[] arr) {
		int maxSum=0;
		ArrayList<Integer> listOfTriplet=new ArrayList<Integer>();
		for(int index=0;index<(arr.length-arr.length%3-2);index=index+3) {
			int sum=arr[index]+arr[index+1]+arr[index+2];
			if(maxSum<sum) {
				maxSum=sum;
				listOfTriplet.clear();
				listOfTriplet.add(arr[index]);
				listOfTriplet.add(arr[index+1]);
				listOfTriplet.add(arr[index+2]);
			}
		}
		return listOfTriplet + " :- " + maxSum;
	}
	public static void main(String[] args) {
		int[] input= {1,10,2,3,1,11,4,2,1,33,2};
		String triplets=new MaximumSumTripletWithoutOverlap().printTripletWithoutOverlap(input);
		System.out.println("Triplet having maximum sum is : " + triplets);
	}
}
