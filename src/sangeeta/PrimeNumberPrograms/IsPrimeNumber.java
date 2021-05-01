/*validate whether given number is prime or not.*/

package sangeeta.PrimeNumberPrograms;

import java.util.Scanner;

public class IsPrimeNumber {
	
	void isPrime(int targetNum) {
		int num = 2;
			for(;num<targetNum; num++) {
				if(targetNum % num == 0)
					break;
			}
			if(targetNum == num)
				System.out.println("Given number "+targetNum+" is a Prime number");
			else
				System.out.println("Given number "+targetNum+" is not a Prime number");
		
		
	}
	
	public static void main(String[] a) {
		IsPrimeNumber isPrimeNumber = new IsPrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number ");
		int targetNum = scanner.nextInt();
		isPrimeNumber.isPrime(targetNum);
	}
}
