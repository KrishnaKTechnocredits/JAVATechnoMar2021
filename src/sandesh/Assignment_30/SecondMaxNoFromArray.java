package sandesh.Assignment_30;

public class SecondMaxNoFromArray {
	int getSecondMaxNumber(int[] inputArray) {
		for(int index = 0; index < inputArray.length; index++) {
			if(index == 2)
				break;
			for(int innerIndex = index+1; innerIndex < inputArray.length; innerIndex++) {
				if(inputArray[index] < inputArray[innerIndex]) {
					
					inputArray[index] = inputArray[index] + inputArray[innerIndex];
					inputArray[innerIndex] = inputArray[index] - inputArray[innerIndex];
					inputArray[index] = inputArray[index] - inputArray[innerIndex];
				}
			}
		}
		return inputArray[1];
	}
	
	public static void main(String[] args) {
		int[] arr = {10,33,43,55,97,11,3};
		int secondMax = new SecondMaxNoFromArray().getSecondMaxNumber(arr);
		System.out.println("Second Highest number is -: " + secondMax);
	}
}
