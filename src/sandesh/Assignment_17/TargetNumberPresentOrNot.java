package sandesh.Assignment_17;

public class TargetNumberPresentOrNot {

	boolean isPresentTargetNum(int[] inArray, int targetNum) {
		boolean targetNumIsPresent = false;
		for(int index=0; index<inArray.length; index++) {
			if(inArray[index] == targetNum) {
				targetNumIsPresent = true;
				break;
			}
		}
		return targetNumIsPresent;	
	}
	
	public static void main(String[] args) {
		int[] inputArray = {10,23,23,44,23,10,23,4,23};
		int targetNumber = 45;
		boolean targetNumberIsPresent = new TargetNumberPresentOrNot().isPresentTargetNum(inputArray, targetNumber);
		if(targetNumberIsPresent)
			System.out.println("Number " + targetNumber + " is present in given array");
		else
			System.out.println("Number " + targetNumber + " is NOT present in given array");
	}
}
