package prachi.Assignment_23;

/*Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
 */

public class ArrPrimeNumberOperstions {

	int[] getFirst_5_PrimeNums(int startLimit, int endLimit) {
		int[] outputArr = new int[5];
		int primeIndex = 0;
		for (int index = startLimit; index <= endLimit; index++) {
			boolean isPrimeFlag = true;
			for (int innerIndex = 2; innerIndex <= index / 2; innerIndex++) {
				if (index % innerIndex == 0) {
					isPrimeFlag = false;
					break;
				}
			}
			if (isPrimeFlag) {
				if (primeIndex < 5)
					outputArr[primeIndex] = index;
				primeIndex++;
			}
		}
		return outputArr;
	}

	public static void main(String[] args) {
		ArrPrimeNumberOperstions first_5_PrimeNum = new ArrPrimeNumberOperstions();
		int[] outputArr = first_5_PrimeNum.getFirst_5_PrimeNums(10, 50);
		for (int index = 0; index < outputArr.length; index++) {
			if (outputArr[index] != 0)
				System.out.println(outputArr[index]);
		}
	}
}
