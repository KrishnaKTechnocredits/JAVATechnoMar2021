package madhavi_Khasbage.Coding_Exam_7;

/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
*/

public class SumOfMissingNum {
	int getSumOfNum(int[] arr) {
		int sumOfNum = 0;
		boolean isMissing = true;
		for (int index = 1; index <= 10; index++) {
			isMissing = true;
			for (int indexIn = 0; indexIn < arr.length; indexIn++) {
				if (arr[indexIn] == index) {
					isMissing = false;
					break;
				}
			}
			if (isMissing == true) {
				sumOfNum += index;
			}
		}
		return sumOfNum;
	}

	int getHigestMissNum(int[] arr) {
		int higestNum = 1;
		boolean isMissing = true;
		for (int index = 1; index <= 10; index++) {
			isMissing = true;
			for (int indexIn = 0; indexIn < arr.length; indexIn++) {
				if (arr[indexIn] == index) {
					isMissing = false;
					break;
				}
			}
			if (isMissing == true) {				
				if (index >higestNum) {					
					higestNum = index;
				}				
			}
		}
		return higestNum;
	}

	public static void main(String[] args) {
		SumOfMissingNum sumOfMissingNum1 = new SumOfMissingNum();
		int[] arr = { 1, 3, 4, 7, 9, 10};
		System.out.println("Sum of missing number:" + sumOfMissingNum1.getSumOfNum(arr));
		System.out.println("Highest of missing number:" + sumOfMissingNum1.getHigestMissNum(arr));
	}

}
