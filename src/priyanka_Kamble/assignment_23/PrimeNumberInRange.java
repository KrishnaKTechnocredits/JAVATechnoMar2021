package priyanka_Kamble.assignment_23;
/* 2) print all the prime numbers given range.
	input : 40 to 100	output :	
	3) count all the prime numbers given range.
	input : 2 to 100	output :
	4) sum of all the prime numbers given range.
	input : 2 to 100	output :
	5) Average of all the prime numbers given range.
	input : 2 to 100	output :
*/

import java.util.Scanner;

public class PrimeNumberInRange {
	int count =0 ,sumOfPrimeNumber =0;
	void PrimeNumbersInGivenRange(int startIndex,int endIndex) { 
		//int[] numberArray = new int[(endIndex - startIndex)/2];		
		for(int index=startIndex ; index < endIndex ; index++ ) {
			boolean isPrime = true;
			for(int innerIndex =2 ; innerIndex < index ; innerIndex++ ) {
				if(index % innerIndex == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime== true && index >= 2) {
				System.out.println(index +" ");
				count++;
				sumOfPrimeNumber +=index;
			}
		}
		
		System.out.println("Total number of Prime Numbers - "+count);
		System.out.println("Sum of PrimeNumbers - "+sumOfPrimeNumber);
		System.out.println("Total Average of Sum of Prime Number- " + (sumOfPrimeNumber/count));
		//return numberArray;
	}

	public static void main(String[] args) {
		new PrimeNumberInRange();
		System.out.println("-------------- Give Range for Prime Numbers ---------- ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Start Index = ");
		int startIndex = scanner.nextInt();
		System.out.println("Enter End Index = ");
		int endIndex = scanner.nextInt();
		System.out.println("Prime Numbers between  - "+startIndex +" to "+endIndex+ " : "  );
		new PrimeNumberInRange().PrimeNumbersInGivenRange(startIndex, endIndex);
		scanner.close();
	}

}
