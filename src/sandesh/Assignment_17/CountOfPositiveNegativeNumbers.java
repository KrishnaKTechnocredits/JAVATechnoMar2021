package sandesh.Assignment_17;

public class CountOfPositiveNegativeNumbers {

	int[] getCountOfPosNegNumbers(int[] inArray) {
		int countOfPositiveNumbers = 0;
		int[] countersStorageArray = {0,0};
		for(int index=0; index<inArray.length; index++) {
			if(inArray[index] >= 0) //condition >= is for considering Zero as positive number
				countOfPositiveNumbers++;
		}
		countersStorageArray[0] = countOfPositiveNumbers;
		countersStorageArray[1] = inArray.length - countOfPositiveNumbers;
		return countersStorageArray;	
	}
	
	public static void main(String[] args) {
		int[] inputArray = {10,23,26,-27,-88,87,-65};
		int[] counterArray = new CountOfPositiveNegativeNumbers().getCountOfPosNegNumbers(inputArray);
		System.out.println("Count of Negative numbers is -: " + counterArray[1]);
		System.out.println("Count of Positive numbers is -: " + counterArray[0]);
	}
}
