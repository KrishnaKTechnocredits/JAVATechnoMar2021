/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/
package prashant.coding_exam_1;

public class IndicesReturn {

	void indice(int[] num, int target) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length; j++) {
				int sum = 0;
				sum = num[i] + num[j];
				if (sum == target) {
					System.out.println("sum of Array of index element " + i + " & " + j + "" + " is equal to " + target);
				}
			}
		}
	}

	public static void main(String[] arg) {
		IndicesReturn indices = new IndicesReturn();
		int[] num = { 2, 11, 15, 7, 4 };
		int t_num = 9;
		indices.indice(num, t_num);
	}

}
