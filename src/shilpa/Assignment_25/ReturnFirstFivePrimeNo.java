/*
Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23 */

package shilpa.Assignment_25;

public class ReturnFirstFivePrimeNo {
	int[] getPrimeNosInGivenRange(int startRange, int endRange) {
		int[] arr = new int[endRange / 2];
		int arrCnt = 0;
		for (int index = startRange; index <= endRange; index++) {
			int cnt = 0;
			for (int index1 = 2; index1 < index; index1++) {
				if (index % index1 == 0)
					cnt++;
			}

			if (cnt == 0) {
				arr[arrCnt] = index;
				arrCnt++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ReturnFirstFivePrimeNo returnFirstFivePrimeNo = new ReturnFirstFivePrimeNo();
		int startRange = 10;
		int endRange = 50;
		int[] arr1 = new int[endRange / 2];
		arr1 = returnFirstFivePrimeNo.getPrimeNosInGivenRange(startRange, endRange);
		System.out.println("First five prime numbers in a range " + startRange + " To " + endRange);
		for (int i = 0; i < arr1.length; i++) {
			if (i < 5)
				System.out.println(arr1[i]);
		}
	}

}
