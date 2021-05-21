package prachi.Assignment_23;

public class ValidatePrimeNumOperationsByMethodCalling {
	/*Assignment - 23 : 18th April'2021
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
	output :*/ 

		int finalSum;
		int finalCount;

		//number is prime or not//
		void isPrimeNumber(int targetNum) {
			boolean isPrimeFlag=true;
			for(int index = 2; index < targetNum/2 ; index++) {
				if(targetNum % index == 0) {
					isPrimeFlag = false;
					break;
				}
			}
			if (isPrimeFlag)
				System.out.println(targetNum+ ": No is prime");
			else
				System.out.println(targetNum+ ": No is not prime");
		}

		//print prime numbers within range//
		void printPrimeNumInRange(int startLimit, int endLimit) {

			for(int index = startLimit; index <= endLimit; index++ ) {
				isPrimeNumber(index); //Modular approach
			}
		}

		//count//
		int countPrimeNumInRange(int startLimit, int endLimit) {

			int count=0;		
			for(;startLimit<=endLimit;startLimit++) {
				int targetnum= startLimit;
				boolean isPrimeFlag= true;
				for(int num=2;num<=targetnum/2;num++) {
					if(targetnum%num==0) {
						isPrimeFlag= false;
					}								
				}
				if(isPrimeFlag) {
					count++;
				}		 
			}
			System.out.println("Prime Number Count within the given range:"+count);	
			finalCount=count;
			return count;
		}

		//sum//
		int sumOfPrimeNumInRange(int startLimit, int endLimit) {
			int sum=0;

			for(;startLimit<=endLimit;startLimit++) {			
				int targetnum= startLimit;
				boolean isPrimeFlag= true;
				for(int num=2;num<=targetnum/2;num++) {
					if(targetnum%num==0) {
						isPrimeFlag= false;
					}								
				}
				if(isPrimeFlag) {
					sum=sum+targetnum;
					finalSum=sum;
				}		 
			}
			System.out.println("Prime Number Count within the given range: " +sum);	
			return sum;
		}

		//Average//
		void avgOfAllPrimeNumsWithinRange() {
			double average= (finalSum/finalCount);
			System.out.println("Average is: " +average);
		}
	

		public static void main(String[] args) {
			ValidatePrimeNumOperations primeNum = new ValidatePrimeNumOperations();
			System.out.println("Output of: Validate whether given number is prime or not");
			primeNum.isPrimeNumber(17);
			primeNum.isPrimeNumber(20);
			System.out.println("==============================================================");
			System.out.println("Output of: Print all the prime numbers given range");
			primeNum.printPrimeNumInRange(40, 100);
			System.out.println("==============================================================");
			System.out.println("Output of: Count all the prime numbers given range");
			primeNum.countPrimeNumInRange(40, 100);
			System.out.println("==============================================================");
			System.out.println("Output of: Sum of all the prime numbers given range");
			primeNum.sumOfPrimeNumInRange(40, 100);
			System.out.println("==============================================================");
			System.out.println("Output of: Average of all the prime numbers given range");
			primeNum.avgOfAllPrimeNumsWithinRange();

		}
		
	}

