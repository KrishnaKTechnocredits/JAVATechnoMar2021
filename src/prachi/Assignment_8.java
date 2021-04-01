package prachi;

/*Assignment 8 : 1st Apr'2021
WAP of Assignment 6 using While loop. */

public class Assignment_8{

	void first5eveNumbers(int endLimit) {
		int count=1;
		int num=10;
		while (count<=endLimit){
			if(num%2==0){
				System.out.print(num);
				System.out.print("\n");  
				count=count+1	;
			}  
			num = num +1;
		}
	}

	void fist10NumDivByFive(int endLimit) {
		int count=1;
		int num=5;
		while (count<=endLimit){ 
			if (num%5==0) {   
				System.out.print(num);  
				System.out.print("\n");  
				count=count+1	;
			}  
			num=num+1;
		}  
	}

	void first5NumDivBy3And5(int endLimit) {
		int num = 10;
		int count = 1;
		while (count<=endLimit){ 
			if (num%3==0 && num%5==0) {   
				System.out.print(num);  
				System.out.print("\n");  
				count=count+1;
			}  
			num=num+1;
		} 
	}

	void first5NumDivBy7Or13(int endLimit) {
		int num = 5;
		int count = 1;
		while (count<=endLimit){ 
			if (num%7==0 || num%13==0) { 
				System.out.print(num+ " is divisible by 7");  
				System.out.print("\n");
				count=count+1;
			}
			num=num+1;
		}  
	} 


	public static void main(String args[]) {
		Assignment_8 assi1=new Assignment_8();
		System.out.println("First 5 Even Numbers stats from 10 are:");
		assi1.first5eveNumbers(5);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("First 10 numbers divisible by 5 where starting number is 10 are:");
		assi1.fist10NumDivByFive(10);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("First 2 Numbers divisible by 5 and 3 where starting number is 5 are:");
		assi1.first5NumDivBy3And5(2);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("First 5 Numbers divisible by 7 or 13 where starting number is 5 are:");
		assi1.first5NumDivBy7Or13(5);
	}  
}