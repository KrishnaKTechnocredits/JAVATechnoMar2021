/*
 * Program 1 :
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */


package purva.CodingExam1_18_04;

public class Program1ReturnIndicesForTargetSum {
	
	int[] sumIndex(int[] num) {
		int sum =0;
		int count =0;
		int[] returnIndicices = new int[2];
		for(int index = 0; index<num.length;index++) {
			for(int innerIndex=1;innerIndex<num.length;innerIndex++) {
			        sum=num[index]+num[innerIndex];
			        if(sum ==9) {
			        	count++;
			        	returnIndicices[count] =index;
			        	count++;
			        	returnIndicices[count] = innerIndex;
			        	
			        }
			        System.out.println("Because num["+index+"] num["+innerIndex+"]== 9 we return {"+returnIndicices[count]+" "+returnIndicices[count]+"}" );		
			}
		}
		
		return returnIndicices;
	 
	}
	
	public static void main(String[] a) {
		int[] num = {2,11,15,7,4};
	    new Program1ReturnIndicesForTargetSum().sumIndex(num);
		
	}
	

}
