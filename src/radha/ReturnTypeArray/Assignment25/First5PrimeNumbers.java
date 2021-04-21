/*
Assignment - 25 : 18th April'2021

Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
 */
package radha.ReturnTypeArray.Assignment25;

public class First5PrimeNumbers {

	int[] getFirst5PrimeNoNo(int startRange, int endRange) {
		int[] primeNumbers = new int[5];
		int primeCount = 0;
		for (int targetNo = startRange; targetNo <= endRange; targetNo++) {
			boolean flag = true;
			for (int num = 2; num <= targetNo / 2; num++) {
				if (targetNo % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true && primeCount != 5) {
				primeNumbers[primeCount] = targetNo;
				primeCount++;
			}
		}
		return primeNumbers;
	}

	public static void main(String[] args) {
		First5PrimeNumbers first5PrimeNo = new First5PrimeNumbers();
		int[] primeArr = first5PrimeNo.getFirst5PrimeNoNo(10, 50);
		System.out.println("First " + primeArr.length + " prime numbers are ");
		for (int i = 0; i < primeArr.length; i++) {
			System.out.print(primeArr[i] + " ");
		}
	}
}
