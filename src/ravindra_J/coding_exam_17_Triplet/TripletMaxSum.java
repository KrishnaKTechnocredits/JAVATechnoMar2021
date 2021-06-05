/*
 Program 3 : triplet having maximum sum, index overlapping NOT is allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 3,1,11 -> 15
 */
package ravindra_J.coding_exam_17_Triplet;
import java.util.ArrayList;

public class TripletMaxSum {
	static int sum=0;
	ArrayList<ArrayList<Integer>> TripletSum(int arr[]) {
		ArrayList<ArrayList<Integer>> tripletlist = new ArrayList<ArrayList<Integer>>();
		for (int index=0;index<arr.length-2;index+=3) {
			ArrayList<Integer> numlist = new ArrayList<Integer>();
			int addition=arr[index]+arr[index+1]+arr[index+2];
			if(addition>sum) {
				sum=addition;
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
	TripletMaxSum tripletmaxsum = new TripletMaxSum();
	int arr[] = {1,10,2,3,1,11,4,2,1,33,2};
	ArrayList<ArrayList<Integer>> answer=tripletmaxsum.TripletSum(arr);
	System.out.println("Sum is : "+sum+" And Triplet is : "+answer);

}

}
