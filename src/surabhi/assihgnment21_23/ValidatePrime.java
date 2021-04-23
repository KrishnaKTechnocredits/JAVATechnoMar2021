package surabhi.assihgnment21_23;

import java.util.Scanner;

import madhavi_Khasbage.AraryPrimeNumbers.ValidatePrimeNum;

public class ValidatePrime {
	void isNumberPrime(int num) {
		boolean isPrime=true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("number "+num+ " is prime");
		}else
			System.out.println("number "+num+" is not prime");
	}
	public static void main(String[] args) {
		ValidatePrime validatePrime=new ValidatePrime();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to check if prime or not :");
		int num=scanner.nextInt();
		validatePrime.isNumberPrime(num);

	}

}
