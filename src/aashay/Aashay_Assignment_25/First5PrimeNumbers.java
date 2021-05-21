package aashay.Aashay_Assignment_25;

import java.util.Scanner;

/*
 * Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
End Index -> 50
Output : 11 13 17 19 23
 */

public class First5PrimeNumbers {
	
	void primeNumbers(int num1, int num2) {
		int cnt = 0;
		boolean prime = true;
		if(num1 < num2) {
			System.out.println("Total list of prime number in given range "+num1+" to "+num2+" are :");
			for(int index = num1 ; index <= num2; index++ ) {
				if(cnt < 5) {
					 for(int innerIndex = 2; innerIndex <= index/2; innerIndex++) {
						 if(index%innerIndex ==0) {
							prime = false;
							break;
						 }
						 else
							 prime = true;
					 }
					 if(prime == true) {
					 System.out.println(index);
					 cnt++;
					 }
				}
				
			}
			
		}else
			System.out.println("Enter valid range");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First5PrimeNumbers first5PrimeNumbers = new First5PrimeNumbers();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minimum number for range");
		int num1 = Integer.parseInt(scan.next()) ;
		System.out.println("\nEnter maximum number for range");
		int num2 = Integer.parseInt(scan.next()) ;
		first5PrimeNumbers.primeNumbers(num1, num2);
		scan.close();
	}

}
