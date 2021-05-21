package meenu.assignment_23;

import java.util.Arrays;

/*Write a program with different method to satisfy following requirement. 
1) validate whether given number is prime or not.
2) print all the prime numbers given range.
   input : 40 to 100
   output : 
3) count all the prime numbers given range.
   input : 2 to 100
   output : 
4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
5) Average of all the prime numbers given range.
   input : 2 to 100
   output : 
*/

import java.util.Scanner;

public class PrimeNumberOperations {
	int primeNumCount;
	int primeNumSum;
	
	boolean isNumberPrime(int number) {
		int primeCount = 0;
		for(int x = 2;x < number;x++) {
			if(number%x == 0)
				primeCount++;
		}	
		if(primeCount == 0) 
			return true;
		else 
			return false;		
	}
	
	int[] getPrimeNumbers(int startNumber,int endNumber) {
		int[] num = new int[getCountOfPrimeNumbers(startNumber,endNumber)];
		int index = 0;
		 for(int number = startNumber; number < endNumber; number++) {			 
			if(isNumberPrime(number)) {				
				num[index] = number;	
			primeNumSum = primeNumSum + number;
			index++;
		    }
		}
		 return num;
	}

	int getCountOfPrimeNumbers(int firstNum,int lastNum) {	
		primeNumCount = 0;
		for(int number = firstNum; number < lastNum; number++) {
			if(isNumberPrime(number))
				primeNumCount++;	
		}	
		return primeNumCount;
	}
	
	void SumOfPrimeNumbers() {
		primeNumSum=0;
		getPrimeNumbers(2,100);
		System.out.println("Sum of prime numbers between given range : "+primeNumSum);
	}	
	
	void AverageOfPrimeNumbers() {
		int average = primeNumSum/primeNumCount;
		System.out.println("Average of all prime number in given range : "+average);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("To know number is prime or not -> ");
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		PrimeNumberOperations primeNumberOperations = new PrimeNumberOperations();
		if(primeNumberOperations.isNumberPrime(number))
			System.out.println(number+" is a prime");
		else
			System.out.println(number+" is not a prime number.");
		System.out.println("Prime numbers between given range : ");
		System.out.println(Arrays.toString(primeNumberOperations.getPrimeNumbers(40,60)));	
		int count = primeNumberOperations.getCountOfPrimeNumbers(2,100);
		System.out.println("Count of prime numbers in given range : "+count);
		primeNumberOperations.SumOfPrimeNumbers();
		primeNumberOperations.AverageOfPrimeNumbers();	
	}
}
