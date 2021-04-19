package trupti.PrimeNumber;

import java.util.Scanner;

//validate whether given number is prime or not.

public class PrimeNumbers {
	boolean isPrimeNumber(int targetNum){
		boolean isPrimeFlag=true;
		for (int num=2;num<=targetNum/2;num++) {
			if(targetNum % num==0) {
				isPrimeFlag=false;
				break;
			}
		}	
		return isPrimeFlag;
	}

	void primeNumberRange() {
		boolean ans;
		System.out.println("Prime numbers between given range 40 to 100 are : ");
		for(int index=40;index<=100;index++) {
			ans=isPrimeNumber(index);
			if(ans==true) { 
				System.out.println(index);}
		}
	}
	
	void primeCntSumAvg() {
		int count=0;
		int sum=0;
		int avg;
		boolean ans;
		
		for(int index=2;index<=100;index++) {
			ans=isPrimeNumber(index);
			if(ans==true) { 
				count++;
				sum=sum+index;
				}
		}
		avg=sum/count;
		System.out.println("Count of Prime numbers between 2 to 100 is : "+count);
		System.out.println("Sum of Prime numbers between 2 to 100 is : "+sum);
		System.out.println("Average of Prime numbers between 2 to 100 is : "+avg);
	}
	
	public static void main(String[] args) {
		PrimeNumbers primenumbers=new PrimeNumbers();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter target number :");
		int targetNumber=scanner.nextInt();
		boolean ans=primenumbers.isPrimeNumber(targetNumber);
		if(ans==true) { 
			System.out.println("Given number "+targetNumber+" is prime");}
		else {
			System.out.println("Given number "+targetNumber+" is not prime");}
		
		primenumbers.primeNumberRange();
		primenumbers.primeCntSumAvg();
		
	}


}
