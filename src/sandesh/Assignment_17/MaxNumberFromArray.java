package sandesh.Assignment_17;

public class MaxNumberFromArray {

	int getMinNum(int[] inArray) {
		int maxNum = inArray[0];
		for(int index=1; index<inArray.length; index++) {
			if(maxNum < inArray[index])
				maxNum = inArray[index];
		}
		return maxNum;
	}
	
	public static void main(String[] args) {
		int[] inputArray = {22,35,65,88,11,23,45};
		int maxNumber = new MaxNumberFromArray().getMinNum(inputArray);
		System.out.println("Maximum number from given array is -: " + maxNumber);
	}
}
