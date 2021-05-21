package surabhi.assihgnment21_23;

import java.util.Scanner;

public class PrimeNumberSum {
	int sum;
	void isNumberPrime(int num) { 
		boolean isPrime=true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			sum+=num;
		}
	} 
	 
	void findPrimeNumbers(int start, int end) {
		for(int index=start;index<=end;index++) {
			isNumberPrime(index);
		}
		System.out.println("Sum of all prime numbers is "+sum);
	}

	public static void main(String[] args) {
		PrimeNumberSum primeNumberSum=new PrimeNumberSum();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the start index :");
		int num1=scanner.nextInt();
		System.out.println("enter the end index :");
		int num2=scanner.nextInt();
		primeNumberSum.findPrimeNumbers(num1, num2);

	}

}
