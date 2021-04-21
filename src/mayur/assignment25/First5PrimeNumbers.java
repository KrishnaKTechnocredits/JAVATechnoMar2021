package mayur.assignment25;

import java.util.Scanner;

public class First5PrimeNumbers {
	int[] getPrimeNumbers(int startNum, int endNum) {
		int index = 0;
		int[] primeNum = new int[5];
		for (int num = startNum; num < endNum; num++) {
			boolean primeFlag = true;
			for (int innerNum = 2; innerNum < num; innerNum++) {
				if (num % innerNum == 0) {
					primeFlag = false;
					break;
				}
			}

			if (primeFlag == true) {
				primeNum[index] = num;
				index++;
			}

			if (index == 5)
				break;

		}
		return primeNum;
	}

	public static void main(String[] args) {

		First5PrimeNumbers first5 = new First5PrimeNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Starting number of the range for prime numbers: ");
		int startNum = scanner.nextInt();
		System.out.println("Enter the Last number of the range for prime numbers: ");
		int endNum = scanner.nextInt();

		int[] primeNum = first5.getPrimeNumbers(startNum, endNum);

		System.out.println("First 5 Prime numbers between " + startNum + " and " + endNum + " are : ");

		for (int index = 0; index < primeNum.length; index++) {
			if (primeNum[index] != 0)
				System.out.println(primeNum[index]);
			scanner.close();
		}
	}
}
