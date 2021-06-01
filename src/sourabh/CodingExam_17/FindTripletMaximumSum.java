/*
Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 11,4,2 -> 17
 */

package sourabh.CodingExam_17;

import java.util.ArrayList;

public class FindTripletMaximumSum {
	ArrayList<ArrayList<Integer>> getTripletMaximumSum(int[] arrInput){
		ArrayList<ArrayList<Integer>> outputList= new ArrayList<ArrayList<Integer>>();
		int maxSum=0;
		int size= arrInput.length-(arrInput.length%3)-2;
		for(int index=0; index<size; index++) {
			if(arrInput[index]+arrInput[index+1]+arrInput[index+2]>maxSum) {
				maxSum= arrInput[index]+arrInput[index+1]+arrInput[index+2];
				ArrayList<Integer> list= new ArrayList<Integer>();
				list.add(arrInput[index]);
				list.add(arrInput[index+1]);
				list.add(arrInput[index+2]);
				outputList.clear();
				outputList.add(list);
			}
		}
		return outputList;
	}
	public static void main(String[] args) {
		FindTripletMaximumSum findTripletMaximumSum= new FindTripletMaximumSum();
		int[] arrInput= {1,10,2,3,1,11,4,2,1,33,2};
		ArrayList<ArrayList<Integer>> output= findTripletMaximumSum.getTripletMaximumSum(arrInput);
		System.out.println(output);
	}
}
