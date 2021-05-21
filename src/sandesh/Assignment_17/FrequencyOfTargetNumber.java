package sandesh.Assignment_17;

public class FrequencyOfTargetNumber {

	int getFreqTargetNum(int[] inArray, int targetNum) {
		int targetNumCounter = 0;
		for(int index=0; index<inArray.length; index++) {
			if(inArray[index] == targetNum)
				targetNumCounter++;
		}
		return targetNumCounter;
	}
	
	public static void main(String[] args) {
		int[] inputArray = {10, 23, 23, 44, 23, 10, 23, 4, 23};
		int targetNumber = 23;
		int targetNumberCount = new FrequencyOfTargetNumber().getFreqTargetNum(inputArray, targetNumber);
		System.out.println("Frequency of " + targetNumber + " is -: " + targetNumberCount);
	}
}
