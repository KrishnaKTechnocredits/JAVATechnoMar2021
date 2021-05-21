package sandesh.Assignment_23;

import java.util.Scanner;

public class ValidatePrimeNumber {

	boolean checkPrimeNumber(int inNumber) {
		boolean isPrime = true;
		for(int index=2; index<(inNumber/2) + 1; index++) {
			if(inNumber%index == 0) {
				isPrime = false;
				break;
			}
		}
		return (isPrime && inNumber >=2); //if user enter 0 or 1 as input, code should return NOt Prime for 0 and 1
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number to check if it is Prime or not -: ");
		int numInput = sc1.nextInt();
		boolean isPrimeNumber = new ValidatePrimeNumber().checkPrimeNumber(numInput);
		if(isPrimeNumber)
			System.out.println("Number " + numInput + " is Prime");
		else
			System.out.println("Number " + numInput + " is NOT Prime");
		sc1.close();
	}
}
