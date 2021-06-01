package rikin.assignment8;
/*WAP of Assignment 6 using While loop. 
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

public class Assignment8 {
	
	void printEvenNumber(int startNum,int endNum) {
		System.out.println("Even numbers are: ");
		while(startNum<=endNum){
			if(startNum %2 == 0) 
				System.out.println(startNum);
			startNum++;
		}
	}
	
	void divisibleBy5(int startNum,int endNum) {
		System.out.println("Divisible by 5 numbers are: ");
		while(startNum<=endNum){
			if(startNum %5 == 0) 
				System.out.println(startNum);
			startNum++;
		}
	}
	
	void divisibleBy5and3(int startNum,int endNum) {
		System.out.println("Divisible by 5 and 3 numbers are: ");
		while(startNum<=endNum){
			if(startNum %5 == 0 && startNum %3 == 0 ) 
				System.out.println(startNum);
			startNum++;
		}
	}
	
	void divisibleBy7or13(int startNum,int endNum) {
		System.out.println("Divisible by 7 and 13 numbers are: ");
		while(startNum<=endNum){
			if (startNum %7 == 0)
				System.out.println(startNum+" Divisableby 7");
			else if (startNum %13 == 0)
				System.out.println(startNum+" Divisableby 13");
			startNum++;
		}
	}
	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.printEvenNumber(10,15);
		assignment8.divisibleBy5(10,30);
		assignment8.divisibleBy5and3(5,18);
		assignment8.divisibleBy7or13(5,40);
	}
}
	
