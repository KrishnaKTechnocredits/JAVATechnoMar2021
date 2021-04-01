package meenu;

/* Write a program on below using While loop:
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

public class NumberSystem {
	
	void evenNumbers(int startNumber, int endNumber) {
		System.out.println("Even numbers are: ");
		while(startNumber <= endNumber){
			if(startNumber % 2 == 0)
				System.out.println(startNumber);
			startNumber++;
		}
	}				
		
	void divisibleBy5(int startNumber, int endNumber){
		System.out.println("Numbers divisible by 5 are:");
		while(startNumber <= endNumber) {
			if(startNumber % 5 == 0)
				System.out.println(startNumber);
			startNumber++;
		} 
		
	}
	
	void divisibleBy5And3(int startNumber, int endNumber) {
		System.out.println("Numbers divisible by 5 and 3 are:");
		while(startNumber <= endNumber) {
			if(startNumber % 5 == 0 && startNumber % 3 == 0)
				System.out.println(startNumber);
			startNumber++;
		}
	}
	
	void divisibleBy7Or13(int startNumber,int endNumber) {
		System.out.println("Number divisible by 7 or 13 are:");
		while(startNumber <= endNumber) {
			if(startNumber % 7 == 0)
				System.out.println(startNumber+" is divisible by 7");
			else {
				if(startNumber % 13 == 0)
					System.out.println(startNumber+" is divisible by 13");
			}	
			startNumber++;
		}	
	}
	
	public static void main(String[] args) {
		NumberSystem numberSystem = new NumberSystem();
		numberSystem.evenNumbers(10,15);
		numberSystem.divisibleBy5(10,30);
		numberSystem.divisibleBy5And3(5,18);
		numberSystem.divisibleBy7Or13(5,40);

	}

}
