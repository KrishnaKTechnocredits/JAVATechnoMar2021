/*
16th May'2021 : Test - 7 [30 mins]

1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21

2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
 */

package ankit.coding_exam_7;

public class ReturnMissingNumber {

	int getSumofMissingNumber(int[] intArr){
		int sumOfMissingNo = 0;
		for(int index = 1; index <= 10 ; index++) {
			Boolean isMissing = false;
			for(int innerIndex = 0 ; innerIndex <intArr.length; innerIndex++) {
				if (intArr[innerIndex] == index) {
					isMissing = true;
					break;
				}
			}
			if(isMissing == false) {
				System.out.println("Missing # "+index+ "");
				sumOfMissingNo += index;
			}	
		}
		return sumOfMissingNo;
	}

	int getMaxMissedNumber(int[] intArr) {
		int maxNum = 0;
		for(int index = 1; index <= 10 ; index++) {
			Boolean isMissing = false;
			for(int innerIndex = 0 ; innerIndex <intArr.length; innerIndex++) {
				if (intArr[innerIndex] == index) {
					isMissing = true;
				}
			}
			if(isMissing == false) {
				if(index > maxNum) {
					maxNum = index;
				}
			}	
		}
		return maxNum;		
	}

	int sumUsingMathFunction(int[] intArr, int sRange, int eRange) {
		int sum = (eRange*(eRange+1))/2;
		int sumArr = 0;
		for(int index = 0 ; index < intArr.length; index++) {
			sumArr +=  intArr[index];	
		}
		return sum-sumArr;

	}

	public static void main(String[] args) {
		int[] input = {1,3,4,7,9,10};
		ReturnMissingNumber returnMissingNumber = new ReturnMissingNumber();
		System.out.println("Sum :" +returnMissingNumber.getSumofMissingNumber(input));
		System.out.println("Highest Missing Number "+ returnMissingNumber.getMaxMissedNumber(input));
		System.out.println("Sum using math function :" +returnMissingNumber.sumUsingMathFunction(input, 1, 10));
	}
}
