/*
 Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17
 */
package ravindra_J.coding_exam_17_Triplet;

import java.util.ArrayList;

public class TripletMaxSumWithOverlapping {
	static int max=0;
	ArrayList<ArrayList<Integer>> tripletWithMaxSumOverlapping(int arr[]) {
		ArrayList<ArrayList<Integer>> tripletlist= new ArrayList<ArrayList<Integer>> (); 
		for(int index=0;index<arr.length-2;index++) {
			ArrayList<Integer> numlist= new ArrayList<Integer>();
			int sum=arr[index]+arr[index+1]+arr[index+2];
			if(sum>max) {
				max=sum;
				numlist.add(arr[index]);
				numlist.add(arr[index+1]);
				numlist.add(arr[index+2]);
				tripletlist.clear();
				tripletlist.add(numlist);
			}
			
		}
		return tripletlist;
	}

	public static void main(String[] args) {
		TripletMaxSumWithOverlapping tripletmaxsumwithoverlapping= new TripletMaxSumWithOverlapping();
		int arr[]= {1,10,2,3,1,11,4,2,1};
		ArrayList<ArrayList<Integer>> answer=tripletmaxsumwithoverlapping.tripletWithMaxSumOverlapping(arr);
		System.out.println("Triplet Having Max Sum is : "+answer+ " And sum is :"+max);
	}

}
