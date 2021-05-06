package ashish_Vyas.Assignment_30;

/*WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55*/

public class SecondMaxNum {
	int getMaxIndex(int[] numArr) {
		int max = 0;
		int maxIndex = 0;

		for (int index = 0; index < numArr.length; index++) {
			if (max < numArr[index]) {
				max = numArr[index];
				maxIndex = index;
			}
		}
		return maxIndex;
	}

	int getSecondMax(int[] numArr) {
		int maxIndex;
		int secondMax = 0;
		maxIndex = getMaxIndex(numArr);
		for (int index = 0; index < numArr.length; index++) {
			if (index != maxIndex) {
				if (secondMax < numArr[index]) {
					secondMax = numArr[index];
				}
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		SecondMaxNum secondMaxNum = new SecondMaxNum();
		int[] arr = { 10, 33, 43, 55, 97, 11, 3 };
		int output = secondMaxNum.getSecondMax(arr);
		System.out.println("Second max number from given array is : " + output);

	}
}