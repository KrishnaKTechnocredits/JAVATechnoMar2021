package prachi;

/*Assignment 6 : 30th March 2021

Write only one program having following methods. [4 methods in same program]

1. On user define range print all even numbers.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user define range print all numbers which is divisible by 5.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user define range print all numbers which is divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user define range print all numbers which is divisible by 7 or 13.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13 */


public class Assignment_6{

	void eveNumbers(int startLimit, int endLimit) {
		for (int i=startLimit; i<=endLimit; i++){ 
			if (i%2==0) {   
				System.out.print(i);
				System.out.print("\n");  
			}
		}  
	}

	void divByFive(int startLimit, int endLimit) {
		for (int j=startLimit; j<=endLimit; j++){ 
			if (j%5==0) {   
				System.out.print(j);  
				System.out.print("\n");  
			}  
		}  
	}

	void divBy3And5(int startLimit, int endLimit) {
		for (int k=startLimit; k<=endLimit; k++){ 
			if (k%3==0 && k%5==0) {   
				System.out.print(k);  
				System.out.print("\n");  
			}  
		} 
	}

	void divBy7Or13(int startLimit, int endLimit) {
		for (int l=startLimit; l<=endLimit; l++){ 
			if (l%7==0) { 
				System.out.print(l+ " is divisible by 7");  
				System.out.print("\n");
			}
			else if (l%13==0) {
				System.out.print(l+ " is divisible by 13");  
				System.out.print("\n");
			}
		}  
	} 


	public static void main(String args[]) {
		Assignment_6 assi1=new Assignment_6();
		System.out.println("Even Numbers within the range 10 to 15 are:");
		assi1.eveNumbers(10, 15);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Numbers divisible by 5 within the range 10 to 30 are:");
		assi1.divByFive(10,30);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Numbers divisible by 5 and 3 within the range 5 to 18 are:");
		assi1.divBy3And5(5,18);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Numbers divisible by 7 and 13 within the range 5 to 40 are:");
		assi1.divBy7Or13(5,40);
	}  
}