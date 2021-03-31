package dipali;

import java.util.Arrays;

public class ArthematicOperation {
	int numbers[]=new int[50];
	public void findEvenNo(int start , int end) {
		int number;
		int iCnt=0;
		for (number=start;number<=end; number++) {
			if(number%2==0) {
				numbers[iCnt]=number;
				iCnt=iCnt+1;
			}
		}
		//to print values
		System.out.println("Even numbers are: ");
		int arraySize=numbers.length;
		int cnt;
		for(cnt=0;cnt<arraySize;cnt++) {
			if(numbers[cnt]==0) {
				
			}else {
				System.out.println(numbers[cnt]);
			}
			
		}
		
	}
	
	public void numDivisiblefive(int start , int end) {
		int number;
		int no=5;
		int iCnt=0;
		Arrays.fill(numbers, 0);
		for (number=start;number<=end; number++) {
			if(number%no==0) {
				numbers[iCnt]=number;
				iCnt=iCnt+1;	
			}
		}
		
		//to print values
		System.out.println("Divisible by 5, numbers are: ");
		int arraySize=numbers.length;
		int cnt;
		for(cnt=0;cnt<arraySize;cnt++) {
			if(numbers[cnt]==0) {
				
			}else {
				System.out.println(numbers[cnt]);
			}
			
		}
		
	}
	
	public void numDivByThreeAndFive(int start , int end) {
		int number;
		int no1=3;
		int no2=5;
		int iCnt=0;
		Arrays.fill(numbers, 0);
		for (number=start;number<=end; number++) {
			if(number%no1==0 && number%no2==0 ) {
				numbers[iCnt]=number;
				iCnt=iCnt+1;	
			}
		}
		
		//to print values
		System.out.println("Divisible by 5 & 3, numbers are: ");
		int arraySize=numbers.length;
		int cnt;
		for(cnt=0;cnt<arraySize;cnt++) {
			if(numbers[cnt]==0) {
				
			}else {
				System.out.println(numbers[cnt]);
			}
			
		}
	}
	
	public void numDivBySevenOrThirteen(int start , int end) {
		int number;
		int no1=7;
		int no2=13;
		int iCnt=0;
		Arrays.fill(numbers, 0);
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for (number=start;number<=end; number++) {
			if(number%no1==0 ) {
				numbers[iCnt]=number;
				if(numbers[iCnt]==0) {
					
				}else {
					System.out.println(numbers[iCnt]+" is divisible by "+no1);
				}
				
			}else if(number%no2==0){
				numbers[iCnt]=number;
				if(numbers[iCnt]==0) {
					
				}else {
					System.out.println(numbers[iCnt]+" is divisible by "+no2);
				}
					
			}	
				iCnt=iCnt+1;	
		}
	}

	public static void main(String[] args) {
		ArthematicOperation arthmaticOperation =new ArthematicOperation(); 
		arthmaticOperation.findEvenNo(10, 15);
		arthmaticOperation.numDivisiblefive(10,30);
		arthmaticOperation.numDivByThreeAndFive(5,18);
		arthmaticOperation.numDivBySevenOrThirteen(5, 40);
	}

}
