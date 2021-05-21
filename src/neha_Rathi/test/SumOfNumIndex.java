//program1
package neha_Rathi.test;

public class SumOfNumIndex {
	
	int[] calculateIndex(int[] nums, int targetNum) {
		int[] output = new int[2];
		for (int index = 0; index < nums.length; index++) {
			for (int innerIndex = 0; innerIndex < nums.length; innerIndex++)
				if (nums[index] + nums[innerIndex] == targetNum) {
					int count = 0;
					output[count] = innerIndex;
					count++;
					output[count] = index;
				}
		}
		return output;
	}

	public static void main(String[] args) {
		SumOfNumIndex sumOfNumIndex = new SumOfNumIndex();
		int[] nums = { 2, 11, 15, 7, 4 };
		int targetNum = 9;
		int[] output = (sumOfNumIndex.calculateIndex(nums, targetNum));
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index]);
		}
	}
}
