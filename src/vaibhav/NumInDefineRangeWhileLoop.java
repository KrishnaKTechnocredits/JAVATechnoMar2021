/*Java Assignment 8: 1st April 2021

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


package vaibhav;

public class NumInDefineRangeWhileLoop {
	
	//======================================================================//
	//             Even numbers in given range using while loop       	    //
	//======================================================================//
	
	void evenNumber(int startNum,int endNum){
		System.out.println("User defined range to find even numbers is : " + startNum + " to " + endNum);
		if (startNum<0 || endNum<0) {
			System.out.println("Please do not enter numbers less than zero");
		}else if (startNum == 0 || endNum == 0) {
			System.out.println("Please enter number above 0");
		}else if (startNum == endNum) {
			System.out.println("To define range both numbers should be differnt");
		}else if( startNum > endNum) {
			System.out.println("Define range in proper way i.e. 1st number should be smaller than 2nd number");
		}else {
			System.out.println("Even Numbers in the defined range are : ");
			
			while(startNum <= endNum) {
				if (startNum %2 == 0) {
					System.out.println(startNum);
				}	
				startNum = startNum +1;
			}
			System.out.println("");
		}	
	}
	
	//=====================================================================//
	//   	 Numbers divisible by 5 in given range using while loop 	   // 
	//=====================================================================//
		
	void numDivisibleByFive(int startNum,int endNum){
		System.out.println("User defined range to find number divisible by 5 is : " + startNum + " to " + endNum);
		if (startNum<0 || endNum<0) {
			System.out.println("Please do not enter numbers less than zero");
		}else if (startNum == 0 || endNum == 0) {
			System.out.println("Please enter number above 0, as 0 is divisible by all numbers");
		}else if (startNum == endNum) {
			System.out.println("To define range both numbers should be differnt");
		}else if( startNum > endNum) {
			System.out.println("Define range in proper way i.e. 1st number should be smaller than 2nd number");
		}else {
			System.out.println("Numbers divisible by 5 in the defined range are : ");
			
			while(startNum <= endNum) {
				if (startNum%5 ==0) {
					System.out.println(startNum);					
				}
				startNum = startNum +1;
			}
			System.out.println("");
		}
	}
	
	
	//=======================================================================//
	//  	Numbers divisible by 5 and 3 in given range using while loop  	 //  
	//=======================================================================//
	
	void numDivisibleByFiveAndThree(int startNum,int endNum){
		System.out.println("User defined range to find number divisible by 5 and 3 is : " + startNum + " to " + endNum);
		if (startNum<0 || endNum<0) {
			System.out.println("Please do not enter numbers less than zero");
		}else if (startNum == 0 || endNum == 0) {
			System.out.println("Please enter number above 0, as 0 is divisible by all numbers");
		}else if (startNum == endNum) {
			System.out.println("To define range both numbers should be differnt");
		}else if( startNum > endNum) {
			System.out.println("Define range in proper way i.e. 1st number should be smaller than 2nd number");
		}else {
			System.out.println("Numbers which are divisible by 5 & 3 in the defined range are : ");
			
			while(startNum <= endNum) {
				if((startNum%3 == 0) && (startNum%5 == 0)){
					System.out.println(startNum);
				}
				startNum = startNum + 1;
			}
			System.out.println("");	
		}	
	}
	
	//=======================================================================//
	//     Numbers divisible by 7 or 13 in given range using while loop 	 //  
	//=======================================================================//
	
	void numDivisibleBySevenOrThirteen(int startNum,int endNum){
		System.out.println("User defined range to find number divisible by 7 or 13 is : " + startNum + " to " + endNum);
		if (startNum<0 || endNum<0) {
			System.out.println("Please do not enter numbers less than zero");
		}else if (startNum == 0 || endNum == 0) {
			System.out.println("Please enter number above 0, as 0 is divisible by all numbers");
		}else if (startNum == endNum) {
			System.out.println("To define range both numbers should be differnt");
		}else if( startNum > endNum) {
			System.out.println("Define range in proper way i.e. 1st number should be smaller than 2nd number");
		}else {
			System.out.println("Numbers which are divisible by 7 or 13 in the defined range are : ");
			
			while(startNum <= endNum) {
				if((startNum%7 == 0) || (startNum%13 == 0)){
					if(startNum%7 == 0) {
						System.out.println(startNum + " is divisible by 7 ");
					}
					if (startNum%13 == 0) {
						System.out.println(startNum + " is divisible by 13");		
					}
				}
				startNum = startNum + 1;
			}
			System.out.println("");
		}	
	}
	
	
	//=======================================================================//
	//    					Main Function calling 			 	  		     //  
	//=======================================================================//
	
	public static void main(String[] args) {
		NumInDefineRangeWhileLoop numInDefineRangeWhileLoop = new NumInDefineRangeWhileLoop();
		numInDefineRangeWhileLoop.evenNumber(10, 15);
		numInDefineRangeWhileLoop.numDivisibleByFive(10, 30);
		numInDefineRangeWhileLoop.numDivisibleByFiveAndThree(5, 18);
		numInDefineRangeWhileLoop.numDivisibleBySevenOrThirteen(5, 40);
	}
}
