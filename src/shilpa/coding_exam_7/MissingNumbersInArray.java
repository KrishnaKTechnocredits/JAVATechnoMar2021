/*Coding exam 7
1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21

2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
*/
package shilpa.coding_exam_7;

public class MissingNumbersInArray {
	String missingNum = "";
	int num = 0;
	int nextnum = 0;

	String getMissingNumbers(int[] inputarr) {
		for (int index1 = 0; index1 < inputarr.length; index1++) {
			nextnum = nextnum + 1;
			for (int index2 = nextnum; index2 <= 10; index2++) {
				if (inputarr[index1] == index2) {
					break;
				} else if (inputarr[index1] != index2)
					missingNum = missingNum + index2;
				nextnum = index2 + 1;
			}
		}
		return missingNum;
	}

	void getsumOfAllMissingNum(int[] inputarr) {
		String missingNum;
		int sumOfMissingNum = 0;
		missingNum = getMissingNumbers(inputarr);

		for (int index = 0; index < missingNum.length(); index++) {
			char ch = missingNum.charAt(index);
			sumOfMissingNum += Integer.parseInt(String.valueOf(ch));
		}
		System.out.println("sum of all missing number is :- " + sumOfMissingNum);
	}

	void getHighestMissingNum(int[] inputarr) {
		missingNum = getMissingNumbers(inputarr);
		int HighestmissingNum = 0;
		for (int index = 0; index < missingNum.length(); index++) {
			char ch = missingNum.charAt(index);
			int valueOfch = Integer.parseInt(String.valueOf(ch));
			if (valueOfch > HighestmissingNum) {
				HighestmissingNum = valueOfch;
			}
		}
		System.out.println("highest missing number is :- " + HighestmissingNum);
	}

	public static void main(String[] args) {
		MissingNumbersInArray missingNumbersInArray = new MissingNumbersInArray();
		int[] input = { 1, 3, 4, 7, 9, 10 };
		missingNumbersInArray.getsumOfAllMissingNum(input);
		missingNumbersInArray.getHighestMissingNum(input);
	}
}
