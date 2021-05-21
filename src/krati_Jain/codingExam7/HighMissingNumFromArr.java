package krati_Jain.codingExam7;

public class HighMissingNumFromArr {
	public static void main(String[] args) {
		HighMissingNumFromArr highMissingNumFromArr = new HighMissingNumFromArr();
		int[] inputArr = { 1, 3, 4, 7, 9, 10 };
		int[] missingNumArr = highMissingNumFromArr.getMissingNums(inputArr);
		System.out.println("Highest Missing Number In The Given Array Is: " + highMissingNumFromArr.getHighestNum(missingNumArr));
	}

	int[] getMissingNums(int[] inputArr) {
		int[] newArray = new int[inputArr.length];
		int numCompare = inputArr[0];
		int tempIndex = 0;
		for (int index = 1; index <= 10; index++) { // 5
			boolean numFlag = false;
			for (int innerIndex = 0; innerIndex < inputArr.length; innerIndex++) {
				if (index == inputArr[innerIndex]) { // 0123456
					numFlag = true;
					break;
				}
			}
			if (!numFlag) {
				newArray[tempIndex] = index;
				//System.out.println(newArray[tempIndex]);
				tempIndex++;
			}
		}
		return newArray;
	}

	int getHighestNum(int[] missingNumArr) {
		int maxNum = missingNumArr[0]; //2
		for (int index = 0; index < missingNumArr.length; index++) {
			if(maxNum < missingNumArr[index])
				maxNum = missingNumArr[index]; //5
		}
		return maxNum;
	}

}
