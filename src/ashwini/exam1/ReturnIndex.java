package ashwini.exam1;
/*
 Program 2 : 
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].

 */

import java.util.Arrays;

public class ReturnIndex {
	int[] indexReturn(int array[], int target) {
		int num[] = new int[2];
		for(int index=0;index<array.length;index++) {
			for(int j=index+1;j<array.length;j++) {
				if(array[index]+array[j]==target) {
					num[0]=index;
					num[1]=j;
				}
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int array[] = {2,11,15,7,4};
		ReturnIndex returnIndex = new ReturnIndex();
		int a[] = returnIndex.indexReturn(array,9);
		System.out.println(Arrays.toString(a));
	}

}
