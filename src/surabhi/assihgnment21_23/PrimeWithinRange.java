package surabhi.assihgnment21_23;

import java.util.Scanner;

public class PrimeWithinRange {
	
	void isNumberPrime(int num) {
		boolean isPrime=true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num);
		}
	} 
	 
	void findPrimeNumbers(int start, int end) {
		boolean prime=true;
		System.out.println("Prime numbers are :");
		for(int index=start;index<=end;index++) {
			isNumberPrime(index);
		}
	}

	public static void main(String[] args) {
		PrimeWithinRange primeWithinRange=new PrimeWithinRange();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the start index :");
		int num1=scanner.nextInt();
		System.out.println("enter the end index :");
		int num2=scanner.nextInt();
		primeWithinRange.findPrimeNumbers(num1, num2);

	}

}
