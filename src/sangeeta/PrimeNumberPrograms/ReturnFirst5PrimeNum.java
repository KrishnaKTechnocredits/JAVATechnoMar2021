/*Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23*/

package sangeeta.PrimeNumberPrograms;

import java.util.Scanner;

public class ReturnFirst5PrimeNum {

	boolean isPrimeNum(int targetNum) {
		int num = 2;
		boolean flag = true;
		for (; num < targetNum; num++) {
			if (targetNum % num == 0)
				flag = false;
		}
		if (flag == true)
			return true;
		else
			return false;
	}

	int[] getFirst5PrimeNumbers(int startrange, int endrange) {
		int[] output = new int[endrange / 2];
		int index = 0;
		for (int num = startrange; num < endrange; num++) {
			int targetNum = num;
			boolean flag = isPrimeNum(targetNum);
			if (flag == true) {
				output[index] = targetNum;
				index++;
			}
		}
		return output;
	}

	public static void main(String[] a) {
		ReturnFirst5PrimeNum returnFirst5PrimeNum = new ReturnFirst5PrimeNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start range and end range ");
		int startrange = scanner.nextInt();
		int endrange = scanner.nextInt();
		int[] output = returnFirst5PrimeNum.getFirst5PrimeNumbers(startrange, endrange);
		for (int index = 0; index < 5; index++) {
			System.out.println(output[index]);
		}
	}
}
