package trupti;
/*Assignment 8 :Write only one program having following methods. [4 methods in same program]

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
		 39 is divisible by 13*/
public class Wloop {

	void displayEven(int startNumber, int endNumber) {
		while(startNumber<=endNumber) {
			if(startNumber%2==0) 
				System.out.println(startNumber);
			startNumber++;
		}
	}
	
	void divBy5(int startNumber,int endNumber) {
		while(startNumber<=endNumber) {
			if(startNumber%5==0) {
				System.out.println(startNumber);
			}
			startNumber++;
		}
	}
	
	void divisibleBy5By3(int startNumber,int endNumber) {
		while(startNumber<=endNumber) {
			if(startNumber%5==0 && startNumber%3==0)
				System.out.println(startNumber);
			    startNumber++; 
				
		}
	}
	
	void divisibleBy7By13(int startNumber,int endNumber) {
		while(startNumber<=endNumber) {
			if(startNumber%7==0) 
				System.out.println(startNumber+" Divisible by 7");
			if(startNumber%13==0)
				System.out.println(startNumber+" Divisible by 13");
			    startNumber++;
		}
	}
	
	public static void main(String[] args) {
		Wloop wloop=new Wloop();
		System.out.println("Even numbers are : ");
		wloop.displayEven(10,15);
		System.out.println("------------------------------------");
		System.out.println("Divisible by 5, numbers are : ");
		wloop.divBy5(10, 30);
		System.out.println("------------------------------------");
		System.out.println("Divisible by 5 & 3, numbers are : ");
		wloop.divisibleBy5By3(5,18);
		System.out.println("------------------------------------");
		System.out.println("Divisible by 7 OR 13, numbers are : ");
		wloop.divisibleBy7By13(5,40);

	}

}
