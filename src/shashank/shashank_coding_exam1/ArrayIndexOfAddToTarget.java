package shashank_coding_exam1;

public class ArrayIndexOfAddToTarget {
	public int[] calculateTargetIndices(int[] arr, int targetNum) {
		for (int index = 0; index < arr.length; index++) {
			for (int index1 = index + 1; index1 < arr.length; index1++) {
				if ((arr[index] + arr[index1]) == targetNum)
					return new int[] { index, index1 };
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 2, 11, 15, 7, 4 };
		int targetNum = 9;
		ArrayIndexOfAddToTarget arrayIndexOfAddToTarget = new ArrayIndexOfAddToTarget();
		int[] targetArray = arrayIndexOfAddToTarget.calculateTargetIndices(array, targetNum);
		if (targetArray.length == 2)
			System.out.println("Target indices whose values addition is " + targetNum + " are " + "[" + targetArray[0]
					+ "," + targetArray[1] + "]");
		else
			System.out.println("No two indices are present whose values add up to target");
	}

}
