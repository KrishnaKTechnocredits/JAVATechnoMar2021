package surabhi.coding_exam17;

import java.util.ArrayList;

/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17*/

public class TripletArrayList3 {
	
	void getMaxTripletSum(int[] arr) {
		int maxSum=0; 
		ArrayList<ArrayList<Integer>> output=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> internalOutput=new ArrayList<Integer>();
		for(int index=0;index<arr.length-2;index=index+2) {
			int sum=arr[index]+arr[index+1]+arr[index+2];
			if(maxSum<sum) {
				internalOutput.clear();
				maxSum=sum;
				internalOutput.add(arr[index]);
				internalOutput.add(arr[index+1]);
				internalOutput.add(arr[index+2]);
			}
		}
		output.add(internalOutput);
		System.out.println("Max Sum of triplet "+output+ " -> "+maxSum);
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,10,2,3,1,11,4,2,1};
		new TripletArrayList3().getMaxTripletSum(arr);
	}

}
