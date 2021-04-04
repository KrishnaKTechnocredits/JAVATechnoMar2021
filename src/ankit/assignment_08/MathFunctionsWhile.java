package ankit.assignment_08;

public class MathFunctionsWhile {
int startIndex, endIndex;

	void evenNumber(int startIndex,int endIndex) {
		if(startIndex == endIndex) {
			System.out.println("Both numbers are same please provide a vaild range");
		}
		else if (startIndex < endIndex) {
			 int index=startIndex;
			 while (index<=endIndex)  {
				if(index%2 == 0) {
					System.out.println("Even Number : " +index);
					}
					index++;
				} 
			}
		else{
				System.out.println("Start Index is greater than End Index");
			}
		}
	void divisableby5(int startIndex,int endIndex) {
		if(startIndex == endIndex) {
			System.out.println("Both numbers are same please provide a vaild range");
		}
		else if (startIndex < endIndex) {
			int index=startIndex;
			while( index<=endIndex) {
				if(index%5 == 0) {
					System.out.println("Number Divisible by 5: " +index);
					}
				index++;
				} 
			}
		else{
				System.out.println("Start Index is greater than End Index");
			}
		}
	void divisableby5And3(int startIndex,int endIndex) {
		if(startIndex == endIndex) {
			System.out.println("Both numbers are same please provide a vaild range");
		}
		else if (startIndex < endIndex) {
			int index=startIndex; 
			while(index<=endIndex) {
				if(index%5 == 0 && index%3 == 0) {
					System.out.println("Number Divisible by 5 And 3 both : " +index);
					}
				index++;
				} 
			}
		else{
				System.out.println("Start Index is greater than End Index");
			}
		}
	void divisableby7Or13(int startIndex,int endIndex) {
		if(startIndex == endIndex) {
			System.out.println("Both numbers are same please provide a vaild range");
		}
		else if (startIndex < endIndex) {
			int index=startIndex;
			while(index<=endIndex) {
				if(index%7 == 0) {
					System.out.println("Number Divisible 7 : " +index);
					}
					else if ((index%13 == 0)){
						System.out.println("Number Divisible 13 : " +index);
					} 
				index++;
				} 
			}
		else{
				System.out.println("Start Index is greater than End Index");
			}
		}	
	public static void main(String[] args) {
		MathFunctionsWhile mathFunctions = new MathFunctionsWhile();
		System.out.println("*****EVEN NUMBER****");
		mathFunctions.evenNumber(1,50);
		System.out.println("*****NUMBER DIVISIBLE BY 5****");
		mathFunctions.divisableby5(20, 30);
		System.out.println("*****NUMBER DIVISIBLE BY 5 & 3****");
		mathFunctions.divisableby5And3(30, 70);
		System.out.println("*****NUMBER DIVISIBLE BY 7 OR 13****");
		mathFunctions.divisableby7Or13(70, 140);
	}
}

/*Assignment 8 : 30th March 2021
Using While statement 
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
		 39 is divisible by 13*/