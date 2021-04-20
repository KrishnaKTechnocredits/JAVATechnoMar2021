package aashay.Assignment_23;

import java.util.Scanner;

public class PrimeNumberRangeValidations {
	void primeNumber(int num) {
		boolean prime = true;
		for(int index = 2; index <= num/2; index++) {
			if(num % index == 0) {
				prime = false;
				break;
			}

		}
		if(prime == true)
			System.out.println("The number is  prime");
		else
			System.out.println("The number is not  prime");
			
	}
	
	void countOfPrimeRange(int min, int max) {
		if(min>=max) {
			
			System.out.println("Enter valid range");
		}else {
			int cnt=0;
			int num = min;
			while(num <= max) {
				boolean prime = true;
				for(int index = 2; index <= num/2; index++) {
					if(num % index == 0) {
						prime = false;
						break;
					}

				}
				if(prime == true) {
					System.out.println("Prime Numbers: "+num);
					cnt++;
				}
					num++;
			}
			System.out.println("Total count of Prime numbers in given range is: "+cnt);
		}
		
	}
	
	void avgPrimeRange(int min, int max) {
		if(min>=max) {
			
			System.out.println("Enter valid range");
		}else {
			int sum=0, cnt=0;
			double average = 0;
			int num = min;
			while(num <= max) {
				boolean prime = true;
				for(int index = 2; index <= num/2; index++) {
					if(num % index == 0) {
						prime = false;
						break;
					}

				}
				if(prime == true) {
					System.out.println("Prime Numbers: "+num);
					sum +=num; 
					cnt++;
				}
					num++;
			}
			average = sum/cnt;
			System.out.println("Average of Prime numbers in given range is: "+average);
		}
		
	}
	void sumPrimeRange(int min, int max) {
		if(min>=max) {
			
			System.out.println("Enter valid range");
		}else {
			int sum=0;
			int num = min;
			while(num <= max) {
				boolean prime = true;
				for(int index = 2; index <= num/2; index++) {
					if(num % index == 0) {
						prime = false;
						break;
					}

				}
				if(prime == true) {
					System.out.println("Prime Numbers: "+num);
					sum +=num; 
				}
					num++;
			}
			System.out.println("Total of Prime numbers in given range is: "+sum);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		PrimeNumberRangeValidations primeNumberRangeValidations = new PrimeNumberRangeValidations();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numberto validate if it is Prime:");
		num =Integer.parseInt(scan.next()); 
		primeNumberRangeValidations.primeNumber(num);
		
		System.out.println("Enter range to get count of Prime numbers:");
		System.out.println("Enter min number:");
		int min = Integer.parseInt(scan.next());
		System.out.println("Enter max number:");
		int max = Integer.parseInt(scan.next());
		primeNumberRangeValidations.countOfPrimeRange(min,max);
		
		
		System.out.println("Enter range to get sum of Prime numbers:");
		System.out.println("Enter min number:");
		int min2 = Integer.parseInt(scan.next());
		System.out.println("Enter max number:");
		int max2 = Integer.parseInt(scan.next());
		primeNumberRangeValidations.sumPrimeRange(min2,max2);
		
		System.out.println("Enter range to get average of Prime numbers:");
		System.out.println("Enter min number:");
		int min3 = Integer.parseInt(scan.next());
		System.out.println("Enter max number:");
		int max3 = Integer.parseInt(scan.next());
		primeNumberRangeValidations.avgPrimeRange(min3,max3);
		
		scan.close();
		

	}

}
