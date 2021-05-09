/*WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55*/
package prashant.Assignment_30;

public class SecondMaxusingArr {
	int maxnum = 0;
	int maxnumArr(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
			if (maxnum < arr[i]) {
				maxnum = arr[i];
			}
		}
		return maxnum;
	}

	int secondMaxNum(int[] numArr) {
		int secmaxnum = 0;
		 maxnum = maxnumArr(numArr);
		for (int j = 0; j < numArr.length; j++) {
			if (maxnum != numArr[j]) {
				if (secmaxnum < numArr[j]) {
					secmaxnum = numArr[j];
				}
			}
		}
		return secmaxnum;
	}
	public static void main(String[] args) {
		SecondMaxusingArr arrnum = new SecondMaxusingArr();
		int[] numArr = { 10, 33, 43, 55, 97, 11, 3 };
		int output = arrnum.secondMaxNum(numArr);
		System.out.println("Second max number from given array " + output);
	}
}
