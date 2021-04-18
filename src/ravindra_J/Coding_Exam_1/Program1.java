/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */
package ravindra_J.Coding_Exam_1;

public class Program1 {
	static int num2[] = new int[2];
	
	
	static int [] getIndices(int[] num, int target) {
		
		for(int i=0;i<num.length;i++) {
			int first = num[i];
			for(int j=i+1;j<num.length;j++){
				int second = num[j];
				int sum = first + second;
				if(target == sum) {
					/*num2[0]=num[i];
					num2[1]=num[j];*/
					num2[0]=i;
					num2[1]=j;
					break;
				}	
			}	
		}
			return num2;	
		}
	
	public static void main(String[] args) {

		int[]arr = {5,15,15,2,4};
		int[]output = getIndices(arr,7);

		for(int i=0;i<2;i++){
			System.out.println(output[i]);
		}

	}
}


