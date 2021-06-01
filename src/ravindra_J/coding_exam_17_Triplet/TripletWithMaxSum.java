/*
 Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15
 */
package ravindra_J.coding_exam_17_Triplet;

import java.util.ArrayList;

public class TripletWithMaxSum {
	ArrayList<ArrayList<Integer>>  tripletMaxSum(int[] arr) {
		int max=0;
		ArrayList<ArrayList<Integer>> tripletlist = new ArrayList<ArrayList<Integer>>();

		for(int i=0; i<arr.length-2;i=i+3) {
			ArrayList<Integer> numlist = new ArrayList<Integer>();

			int addition=arr[i]+arr[i+1]+arr[i+2];
			if(addition>max) {
				max=addition;
				numlist.add(arr[i]);
				numlist.add(arr[i+1]);
				numlist.add(arr[i+2]);
				tripletlist.clear();
				tripletlist.add(numlist);			}

		}
		return tripletlist;

	}
	public static void main(String[] args) {
		TripletWithMaxSum tripletwithmaxsum = new TripletWithMaxSum();
		int arr[]= {1,10,2,3,1,11,4,2,1};
		ArrayList<ArrayList<Integer>> answer =tripletwithmaxsum.tripletMaxSum(arr);
		System.out.println("Max Sum Triplet is : "+answer	);
	}

}
