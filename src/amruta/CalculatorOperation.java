// Assignment 6 : 30th March 2021  sing for Loop 

/*
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
		 39 is divisible by 13
*/

package amruta;

class CalculatorOperation{
	
	void displayevenNumber(int startindex, int endindex){
		
		System.out.println("Even Numbers are :");
		
		for(int num=startindex; num <= endindex; num++){
			
			if(num%2==0){
				System.out.println(num);
			}
		}
	}
	
	void divisiblebyFive(int startindex, int endindex){
		
		System.out.println("Numbers Divisible by 5 are :");
		
		for(int num=startindex; num <= endindex; num++){
			if(num%5==0){
				System.out.println(num);
			}
		}
	}
	
	void divisiblebyFiveandThree(int startindex, int endindex){
		
		System.out.println("Numbers Divisible by 5 and 3 are :");
		
		for(int num=startindex; num <= endindex; num++){
			if(num%5==0 || num%3==0){
				System.out.println(num);
			}
		}
	}
	
	void divisiblebySevenandThirteen(int startindex, int endindex){
		
		System.out.println("Numbers Divisible by 7 and 13 are :");
		for(int num=startindex; num <= endindex; num++){
			if(num%7==0 || num%13==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
	CalculatorOperation calculatoroperation = new CalculatorOperation();
	calculatoroperation.displayevenNumber(10,15);
	calculatoroperation.divisiblebyFive(10,30);
	calculatoroperation.divisiblebyFiveandThree(5,18);
	calculatoroperation.divisiblebySevenandThirteen(5,40);
	}
}
