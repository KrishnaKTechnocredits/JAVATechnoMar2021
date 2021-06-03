package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class Example16 {

	static ArrayList<HashSet<Integer>> getAllMatchingTriplet(int[] arr, int targetSum) {
		ArrayList<HashSet<Integer>> tripleList = new ArrayList<HashSet<Integer>>();
		for(int index=0;index<arr.length;index=index+3) {
			if(arr[index] + arr[index+1] + arr[index+2] >= targetSum) {
				HashSet<Integer> numberList = new HashSet<Integer>();
				numberList.add(arr[index]);
				numberList.add(arr[index+1]);
				numberList.add(arr[index+2]);
				tripleList.add(numberList);
			}	
		}
		return tripleList;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,10,2,3,1,11,4,2,1};
		ArrayList<HashSet<Integer>> ans = Example16.getAllMatchingTriplet(arr,10);
		System.out.println(ans.size());
		System.out.println(ans);
	}
}
