package gauravk.Assignment_23;
/*
 * After Lecture - 17_April_Session-26_PrimeNum Assignment - 23 : 18th April'2021
Write a program with different method to satisfy following requirement.
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

public class PrimeNumbers {
	Scanner sc = new Scanner(System.in);
	int startNum, endNum;
	int count, sum;
	double avg;
	
	
	public static void main(String[] a) {
		new PrimeNumbers().selectionSwitch();
	}
	
	void selectionSwitch() {
		System.out.println("Select the test on Prime number(s).");
		System.out.println("Press 'A' -- Finding whether a number is prime or not.");
		System.out.println("Press 'B' -- print all the prime numbers given range.");
		System.out.println("Press 'C' -- count all the prime numbers given range.");
		System.out.println("Press 'D' -- sum of all the prime numbers given range.");
		System.out.println("Press 'E' -- Average of all the prime numbers given range.");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'A': {
			int n = dataInput();
			validatePrime(n);
			}
			break;
		case 'b':
		case 'B': {
			definingRange();
			validatePrime(startNum, endNum);
			}
			
			break;
		case 'c':
		case 'C': {
			definingRange();
			functionsAllPrimes(startNum,endNum);
			System.out.println("There are total "+count+" prime numbers in the range from "+startNum+" to "+endNum);
			}
			break;
		case 'd':
		case 'D': {
			definingRange();
			functionsAllPrimes(startNum,endNum);
			System.out.println("Total sum of all prime numbers is "+sum+" when the range is from "+startNum+" to "+endNum);
			}
			break;
		case 'e':
		case 'E': {
			definingRange();
			functionsAllPrimes(startNum,endNum);
			System.out.println("Average of all prime numbers is "+avg+" when the range is from "+startNum+" to "+endNum);
			}
		break;
		}
	}
	
	int dataInput() {
		System.out.println("Enter a number to test whether it is prime or not.");
		int n = sc.nextInt();
		return n;
	}
	
	void definingRange() {
		System.out.println("Enter starting number of the range.");
		startNum = sc.nextInt();
		System.out.println("Enter ending number of the range.");
		endNum = sc.nextInt();
	}
	
	void validatePrime(int num) {
		boolean bool = true;
		for(int index=2; index<num/2; index++) {
			if(num%index == 0)
				bool = false;
		}
		if(bool)
			System.out.println("the number "+num+" is prime.");
		else
			System.out.println("the number "+num+" is not prime.");
	}
	
	void validatePrime(int sNum, int eNum) {
		int index=sNum;
		for(; index<eNum; index++) {
			int targetNum = index;
			boolean bool = true;
			for(int i=2; i<=targetNum/2; i++) {
				if(targetNum%i == 0) {
					bool = false;
					break;
				}
			}
				if(bool)
					System.out.println("the number "+targetNum+" is prime.");
		}
	}

	void functionsAllPrimes(int sNum, int eNum) {
		int index=sNum;
		for(; index<eNum; index++) {
			int targetNum = index;
			boolean bool = true;
			for(int i=2; i<=targetNum/2; i++) {
				if(targetNum%i == 0) {
					bool = false;
					break;
				}
			}
				if(bool)
					count++;
					sum = sum+targetNum;
		}
		avg = sum/count;
	}	
}