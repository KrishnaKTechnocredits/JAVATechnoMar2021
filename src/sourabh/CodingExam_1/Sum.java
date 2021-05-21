/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
*/

package sourabh.CodingExam_1;

public class Sum {
	int[] getSum(int[] num,int targetSum) {
		
		for(int index=0; index<num.length; index++) {
			for(int index1=0; index1<num.length; index1++) {
				int sum= num[index]+num[index1];
				if(sum==targetSum)
				//System.out.println("match"+index+index1+targetSum);
				return new int[] {index,index1};	
			}
		}
		//System.out.println("match"+targetSum);
		//return 
		return num;
		
	}
	public static void main(String[] args) {
		Sum sum= new Sum();
		int[] num= {2,11,15,7,4};
		int targetSum= 9;
		int[] findIndex = sum.getSum(num, targetSum);
		System.out.println("["+findIndex[0]+" "+findIndex[1]+"]");
		
	}
}
