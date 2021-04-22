package surabhi.assihgnment21_23;

import java.util.Scanner;

public class PrimeNumberAvg {
	int sum, avg, count;
	void isNumberPrime(int num) { 
		boolean isPrime=true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			count++;
			sum+=num;
			avg=sum/count;
		}
	} 
	 
	void findPrimeNumbers(int start, int end) {
		for(int index=start;index<=end;index++) {
			isNumberPrime(index);
		}
		System.out.println("Average of all prime numbers is "+avg);
	}

	public static void main(String[] args) {
		PrimeNumberAvg primeNumberSum=new PrimeNumberAvg();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the start index :");
		int num1=scanner.nextInt();
		System.out.println("enter the end index :");
		int num2=scanner.nextInt();
		primeNumberSum.findPrimeNumbers(num1, num2);

	}

}
