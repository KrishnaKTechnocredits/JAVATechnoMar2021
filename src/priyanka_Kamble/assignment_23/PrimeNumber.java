package priyanka_Kamble.assignment_23;
/*Assignment - 23 : 18th April'2021
	Write a program with different method to satisfy following requirement.
	1) validate whether given number is prime or not.
	2) print all the prime numbers given range.
	input : 40 to 100	output :	
	3) count all the prime numbers given range.
	input : 2 to 100	output :
	4) sum of all the prime numbers given range.
	input : 2 to 100	output :
	5) Average of all the prime numbers given range.
	input : 2 to 100	output :
*/

public class PrimeNumber {
	String isPrime(int number) {
		int count = 0;
		for (int num = 2; num <= number / 2; num++) {
			if (number % num == 0)
				count = 1;
		}
		if (count == 1)
			return " is a Prime Number";
		else
			return " is Not a Prime Number";
	}	
	void countPrime(int number) {
		int countprime = 0;
		if (number > 2 && number < 100) {
			for (int num = 2; num <= 100; num++) {
				if (number % num == 0)
					countprime++;
			}
		}
		System.out.println("Total Prime Numbers are - " +countprime);
	}
	
	public static void main(String[] args) {
		int number = 87;
		String str1 = new PrimeNumber().isPrime(number);
		 System.out.println(number+ " " +str1);
		//new PrimeNumber().isPrimeInRange(number);
		new PrimeNumber().countPrime(number);
	}
}
