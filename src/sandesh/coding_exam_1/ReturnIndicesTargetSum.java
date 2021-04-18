package sandesh.coding_exam_1;

public class ReturnIndicesTargetSum {

	int[] returnIndices(int[] numArr, int targetSum) {
		int[] returnIndicesArray = new int[2];
		for(int index=0; index < numArr.length; index++) {
			for(int innerIndex=1; innerIndex<numArr.length; innerIndex++) {
				if((numArr[index]+numArr[innerIndex]) == targetSum) {
					int count = 0;
					returnIndicesArray[count] = index;
					count++;
					returnIndicesArray[count] = innerIndex;
				}
			}
		
		}
		return returnIndicesArray;
	}	
	
	public static void main(String[] args) {
		int[] nums = {2,11,15,7,4};
		int target = 9;
		int[] returnedIndicesFromMethod = new ReturnIndicesTargetSum().returnIndices(nums, target);
		for(int index=0; index<returnedIndicesFromMethod.length; index++)
			System.out.println(returnedIndicesFromMethod[index]);
	}
}
