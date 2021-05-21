package sandesh.Assignment_17;

public class MinNumberFromArray {

	int getMinNum(int[] inArray) {
		int minNum = inArray[0];
		for(int index=1; index<inArray.length; index++) {
			if(minNum > inArray[index])
				minNum = inArray[index];
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		int[] inputArray = {22,35,65,88,11,23,45};
		int minNumber = new MinNumberFromArray().getMinNum(inputArray);
		System.out.println("Minimum number from given array is -: " + minNumber);
	}
}
