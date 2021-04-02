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
39 is divisible by 13*/

package mayur;

public class Maths {
	int index, startIndex, endIndex;
	void evenNumber(int startIndex, int endIndex) {
		for(int index = startIndex;index <= endIndex;index++) 
			if(index%2 ==0)
				System.out.println("Even numbers are: " +index);
	}

	void five(int startIndex, int endIndex) {
		for(int index=startIndex;index<=endIndex;index++)
			if(index%5==0)
				System.out.println("Number divisible by 5 are : " +index);

	}

	void fiveAndThree(int startIndex, int endIndex) {
		for(int index=startIndex;index<=endIndex;index++)
			if(index%5==0 && index%3==0)
				System.out.println("Number divisible by 5 and 3 are : " +index);
	}

	void sevenOrThirteen(int startIndex, int endIndex) {
		for(int index=startIndex;index<=endIndex;index++)
			if(index%7==0 || index%13==0)
				System.out.println("Numbers divisible by 7 or 13 are: " +index);
	}

	public static void main(String[] args){
		Maths maths = new Maths();
		maths.evenNumber(10,15);
	    maths.five(10,30);
	    maths.fiveAndThree(5,18);
	    maths.sevenOrThirteen(5,40);
	}

}
